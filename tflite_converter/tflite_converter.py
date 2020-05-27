import tensorflow as tf

export_dir = "./test_saved_model"

# Convert the model.
converter = tf.lite.TFLiteConverter.from_saved_model(export_dir)
tflite_model = converter.convert()
