# =================================================
# 1. ask the user his/her fav. food. Save in an array
# use input() instead for Python3.0 and newer version
#===================================================
print "Plese let me know your fav. five food"
favFood = []
for i in range(1, 6):
    print "What is your No. %d fav. food?" % i
    food = raw_input()
    favFood.append(food)
print favFood  # ['a', 'b', 'c', 'd', 'e']
print favFood[-1]
del favFood[3]
print favFood
