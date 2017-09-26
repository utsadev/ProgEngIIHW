#=======Lesson 3======
#=====Sequence Assignments====
star=0
triangle=1
a,b=star,triangle
print a,b
[a,b]=[star,triangle]
print [a,b]
a,b=3,4
print a,b
#====tuple vs list====
tup1 = ('a', 'c', 2017, 10)
tup2 = (1, 2, 3, 4, 5, 6, 7)

print "tup1[0]: ", tup1[0]
print "tup2[1:5]: ", tup2[1:5]

list1=['a', 'c', 2017, 10]
list2=[1, 2, 3, 4, 5, 6, 7 ]
print "list1[0]: ", list1[0]
print "list2[1:5]: ", list2[1:5]
#print type(list2[1:5]), type(tup2[1:5])

#-===differencee between tuple and list===
#tuples cannot be changed e.g., append, pop, del, cannot work
#tup1[0]="abc" # wrong!
#del tup1[-1] # wrong
#print tup1
#tup1.append("abc")
#print tup1
#list1[0]="abc"
#print list1

# combine two tuples into one using +
tup3=tup1+tup2
print tup3

list3=list1+list2
print list3


#===Convert a tupe to list
list4=list(tup1)
print list4
#===convert list to tuple====
tup4=tuple(list4)
print tup4

#====zip tuple===

tup_zip=zip(tup1, tup2)
print tup_zip
tup_zip2=zip(tup2,tup1)
print tup_zip2
mydict=dict(tup_zip2)
print mydict

mydict[1]="b"
print mydict




