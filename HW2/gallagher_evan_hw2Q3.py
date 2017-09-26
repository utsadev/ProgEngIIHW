
def get_valid_number(conT):
    pass
    #conLen = raw_input("Length in %s to convert: "%conT)

def get_valid_unit(conF, conT):

    accepted_units = {'m','M','ft','FT'}

    conF = raw_input("Convert from units: ")
    if conF not in accepted_units:
        print "You have entered wrong units"
        SystemExit()

    conT = raw_input("Convert to units: ")
    if conT not in accepted_units:
        print "You have entered wrong units"
        SystemExit()
    
    return conF, conT


def main():

    conF = ""
    conT = ""

    get_valid_unit(conF, conT)
    print conF, conT
    #get_valid_number(conT)
   
    


if __name__ == "__main__":
    main()