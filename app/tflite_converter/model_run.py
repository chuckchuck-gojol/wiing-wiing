import numpy as np
import pandas as pd
import glob
import joblib


def extract_feature(file_name):
    X, sample_rate = librosa.load(file_name)
    stft = np.abs(librosa.stft(X))
    mfccs = np.mean(librosa.feature.mfcc(y=X, sr=sample_rate, n_mfcc=40).T,axis=0)
    chroma = np.mean(librosa.feature.chroma_stft(S=stft, sr=sample_rate).T,axis=0)
    mel = np.mean(librosa.feature.melspectrogram(X, sr=sample_rate).T,axis=0)
    contrast = np.mean(librosa.feature.spectral_contrast(S=stft, sr=sample_rate).T,axis=0)
    tonnetz = np.mean(librosa.feature.tonnetz(y=librosa.effects.harmonic(X), sr=sample_rate).T,axis=0)
    return mfccs,chroma,mel,contrast,tonnetz

def parse_audio_files(filenames):
    rows = len(filenames)
    # feature는 각 파일 별 row(window) * 피처 의 2차원 행렬
    # labels은 파일 별 카테고리 int 값
    features = np.zeros((rows,193))
    i = 0
    for fn in filenames:
        try:
            mfccs, chroma, mel, contrast,tonnetz = extract_feature(fn)
            ext_features = np.hstack([mfccs,chroma,mel,contrast,tonnetz])
        except:
            print("error : "+fn)
        else:
            features[i] = ext_features
            print("성공")
            i += 1
    return features


files = ["test_file.wav"]
X_test = parse_audio_files(files)

X_test = X_test.reshape(X_test.shape[0], 193, 1)

model = joblib.load("model_1.pkl")
pred = model.predict_proba(X_test)
print(pred)
ans = float(pred)

print(pred)

def print_ans(ans):
    ans = round(ans)
    #기능 1
    if(ans==0):
        print("사이렌")
    # 기능 2
    if(ans==1):
        print("차량 엔진 소리_접근중")
    if(ans==2):
        print("차량 경적 소리_위험")
    # 기능 3 -> 모델 2 반환
    if(ans==3):
        print("지하철 트리거")

print_ans(ans)