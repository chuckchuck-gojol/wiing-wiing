FROM python:3.7
RUN apt-get update && apt-get install -y libsndfile1
RUN git clone https://github.com/chuckchuck-gojol/wiing-wiing.git
WORKDIR wiing-wiing/backend_code
RUN pip install -r requirements.txt
ENTRYPOINT gunicorn --bind 0.0.0.0:5000 app:app