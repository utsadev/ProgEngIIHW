"""Testing tensorflow"""
import tensorflow as tf
#import scipy
#import matplotlib as plt


hello = tf.constant('Hello, TensorFlow!')

sess = tf.Session()
print(sess.run(hello))
