import numpy as np
matrixOne=np.arange(15).reshape(3,5)
print type(matrixOne)
print matrixOne

matrixTwo=np.array([2,4,6])
newMatrix=np.dot(matrixTwo,matrixOne)
print "result is ",newMatrix