##import os
#from __future__ import print_function #used for print functionality, but changes syntax


def main():
    ##directory = ".."
    ##folder = "HelloWorld"
    ##path = os.path.join(directory, folder)
    ##print path
    ##fileName = "Method.py"
    ##newPath = os.path.join(path, fileName)
    ##print newPath
    #newCommand="python "+ newPath
    # print newCommand
    # os.system(newCommand)

    #reply = ""
    while True:
        reply = raw_input()
        if reply == 'stop':
            break
    
    print reply.upper()





if __name__ == '__main__':
    main()
