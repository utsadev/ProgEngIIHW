import matplotlib.pyplot as plt


#import numpy as np

x = []
y = []

for i in range(1, 10):
    x.append(i)
    j = i**2
    y.append(j)

plt.plot([1, 2, 3, 4], 'r--')
plt.xlabel('Sample')
plt.ylabel('Value')
plt.plot(x, y)
plt.show()
