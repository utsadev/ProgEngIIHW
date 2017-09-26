
def main():

    #creates a list caled ls with names in it
    ls = ["Nick", "Susan", "Chet", "Dolly", "Bill"]
    #second list used to place it in the middle of another list
    myarr = ["Ellie", "Beatrice", "Charles"]
    #replaces the 1st and 2nd element in the list
    #with every element of another list
    ls.__setslice__(1, 2, myarr)
    #remvoes a element in the list if it matches "Bill"
    ls.remove("Bill")
    #adds Lewis to the end of the list
    ls.append("Lewis")
    ls.append("Izzy")
    #removes Nick from the list
    ls.remove("Nick")
    #reversed the list
    ls.reverse()
    #inserts "Archie" to the begging of the list
    ls.insert(0, "Archie")
    #sorts the list in alphabetical order
    ls.sort()
    print ls


if __name__ == '__main__':
    main()
