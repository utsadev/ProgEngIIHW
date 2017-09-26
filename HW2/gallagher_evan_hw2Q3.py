def convert(conF, conT, conLen):
    # 1 meter = 3.281ft
    # 1 foot = .305
    meterToFt = 3.281
    ftToMeter = .305
    conF = conF.lower()
    conT = conT.lower()
    if conF == 'm':
        conversion = ftToMeter * conLen
    elif conF == 'ft':
        conversion = meterToFt * conLen

    return conversion


def get_valid_number(conT):

    while True:
        conLen = raw_input("Length in %s to convert: " % conT)
        if conLen == 'q':
            print "Done"
            quit()
        else:
            conLen = int(conLen)

        if type(conLen) != int:
            print "sorry please enter another number"
        else:
            break

    return conLen


def get_valid_unit_F(accepted_units):

    while True:
        conF = raw_input("Convert from units: ")
        if conF == 'q':
            print "Done"
            quit()
        if conF not in accepted_units:
            print "Sorry don't know anything about %s unit" % conF
        else:
            break

    return conF


def get_valid_unit_T(accepted_units):  # , conT):

    while True:
        conT = raw_input("Convert to units: ")
        if conT == 'q':
            print "Done"
            quit()
        if conT not in accepted_units:
            print "Sorry don't know anything about %s unit" % conT
        else:
            break
    return conT


def main():

    accepted_units = {'m', 'M', 'ft', 'FT'}

    while True:
        print "\nPlease enter 'q' to quite program"
        conF = get_valid_unit_F(accepted_units)
        conT = get_valid_unit_T(accepted_units)
        conLen = get_valid_number(conT)
        print ""
        conv = convert(conF, conT, conLen)
        print "%s %s = %.3f %s" % (conLen, conT, conv, conF)
        print "================================"


if __name__ == "__main__":
    main()
