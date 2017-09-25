
import matplotlib.pyplot as plt
x=[]
y=[]

for i in range (10,20):
    x.append(i)
    j=i**2
    y.append(j)
#print x
#print y
#plt.plot([1, 2, 3, 4],'g*')
#plt.xlabel('Sample')
#plt.ylabel('Value')
plt.plot(x,y)
plt.show()