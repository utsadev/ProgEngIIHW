def convert(conF, conT, conLen):
    # 1 meter = 3.281ft
    # 1 foot = .305
    meterToFt = 3.281 #used for converting meters to feet
    ftToMeter = .305  #used for converting feet to meters
    conF = conF.lower() #forces the string of conF to all lowercase
    conT = conT.lower() #forces the string of conT to all lowercase
    if conF == 'm':
        conversion = ftToMeter * conLen #math to convert feet to meters
    elif conF == 'ft':
        conversion = meterToFt * conLen #math to convert meters to feet

    return conversion


def get_valid_number(conT):

    while True:
        #gathers users input
        conLen = raw_input("Length in %s to convert: " % conT)
        #if conT is 'q' it will exit out of the program
        if conLen == 'q':
            print "Done"
            quit()
        else:
            #converts conLen from a string to a integer
            conLen = int(conLen)
        #checks to make sure conLen is a interger before breaking the loop
        if type(conLen) != int:
            print "sorry please enter another number"
        else:
            break

    return conLen


def get_valid_unit_F(accepted_units):

    while True:
        #gathers users input
        conF = raw_input("Convert from units: ")
        #if conT is 'q' it will exit out of the program
        if conF == 'q':
            print "Done"
            quit()
        #cheks to see if the if conT is a valid unit to convert
        #by checking conT against accepted_units
        if conF not in accepted_units:
            print "Sorry don't know anything about %s unit" % conF
        else:
            break

    return conF


def get_valid_unit_T(accepted_units):

    while True:
        #gathers users input
        conT = raw_input("Convert to units: ")
        #if conT is 'q' it will exit out of the program
        if conT == 'q':
            print "Done"
            quit()
        #cheks to see if the if conT is a valid unit to convert
        #by checking conT against accepted_units
        if conT not in accepted_units:
            print "Sorry don't know anything about %s unit" % conT
        else:
            break
    return conT


def main():

    #used later to compare inputs against it
    accepted_units = {'m', 'M', 'ft', 'FT'}

    while True:
        print "\nPlease enter 'q' to quite program"
        conF = get_valid_unit_F(accepted_units) #used to get the units for converting from
        conT = get_valid_unit_T(accepted_units) #used to get the units for converting to
        conLen = get_valid_number(conT)         #used to gather length to convert
        print ""
        conv = convert(conF, conT, conLen)      #returns converted conversions of conF, conT
        print "%s %s = %.3f %s" % (conLen, conT, conv, conF) #prints the conversions
        print "================================"


if __name__ == "__main__":
    main()
