# =================================================
# 1. ask the user his/her fav. food. Save in an array
#use input() instead for Python3.0 and newer version
#===================================================
# print "Plese let me know your fav. five food"
# favFood=[]
# for i in range (1,6):
#     print "What is your No. %d fav. food?"%i
#     food=raw_input()
#     favFood.append(food)
# print favFood #['a', 'b', 'c', 'd', 'e']

#==============================================
#2. change the second fav. food to "fried rice",
# and the last one to "ice cream"
#Guen Chen
# favFood[1]="fried rice"
# favFood[-1]="ice cream"
# print favFood
#============================================
#3. delete 'd' in the array
newArray=['a', 'b', 'c', 'd', 'e']
del newArray[3]
print newArray
#====4. reverse the array====
newArray.reverse()
print newArray
#===5. sort the array=====
Array_sample=['1',2,3,'hello','123','1111']
Array_sample.sort()
print Array_sample
#===6. add an element to the front of an array
shortArray=[1,2,3]
a=-1
longArray=[a]+shortArray
print longArray
b=-2
longArray.insert(0,b)
print longArray

mydic={"Java": "CE",
       "Softwre Engineering":"CS"}
print mydic