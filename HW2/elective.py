
def main():

    classDic = {"2CPR2B": "C Language", "1UNX1B": "Intro to UNIX",
                "3SH414": "Shell Programming", "4PL400": "Perl Programming"}

    
    #print "Type in 2CPR2B, 1UNX1B, 3SH414, 4PL400 to see what class you are taking this semester"

    while True:
        print "\nType in -1 to stop the program"
        print "Type in 2CPR2B, 1UNX1B, 3SH414, 4PL400 to see what class you are taking this semester\n"
        reply = raw_input()
        if reply == '-1':
            break
        if classDic[reply]:
            print "\n\nYou will be taking %s"%reply
        else:
            print "Error: couldn't find class name"
        

if __name__ == '__main__':
    main()
