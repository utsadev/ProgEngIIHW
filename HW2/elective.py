
def main():

    # creates a dictionary with a key and value
    classDic = {"2CPR2B": "C Language", "1UNX1B": "Intro to UNIX",
                "3SH414": "Shell Programming", "4PL400": "Perl Programming"}

    while True:
        print "\nType in -1 to stop the program"
        print "Type in 2CPR2B, 1UNX1B, 3SH414, 4PL400 to see what class you are taking this semester\n"
        #stores the user input inside of reply
        reply = raw_input()
        #if the use types '-1' the program with end
        if reply == '-1':
            quit()
        #checks if reply is a key in the dictionary
        if classDic[reply]:
            #prints the value of that key
            print "\n\nYou will be taking %s" % reply
        else:
            print "Error: couldn't find class name"


if __name__ == '__main__':
    main()
