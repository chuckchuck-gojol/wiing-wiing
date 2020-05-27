import tensorflow as tf
gf = tf.GraphDef()
m_file = open('frozen_inference_graph.pb','rb')
for n in gf.node:
    print( n.name )