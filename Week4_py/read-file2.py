#===write to a file
fileW=open("news.txt",'w')
fileW.write("I like College Football\n"
            "MSU beated LSU.")
fileW.close()

#===open and read a file===
fileR=open("news.txt",'r')
content=fileR.readlines()
print content  # a list

for line in content:
    print line
fileR.close()

#====continously write to the same file ===
for time in range (1,3):
    fileC=open("data.csv",'a')
    for i in range (0,10):
        data=time * i
        fileC.write(str(data)+",")
    fileC.write("\n")
fileC.close()

#===read from the csv file====

fileCR=open("data.csv",'r')
dataset=fileCR.readlines()
print dataset
for lines in dataset:
    print lines

fileCR.close()