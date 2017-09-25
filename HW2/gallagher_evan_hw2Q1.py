
def main():

    ls = ["Nick", "Susan", "Chet", "Dolly", "Bill"]
    myarr = ["Ellie", "Beatrice", "Charles"]
    ls.__setslice__(1, 2, myarr)
    ls.remove("Bill")
    ls.append("Lewis")
    ls.append("Izzy")
    ls.remove("Nick")
    ls.reverse()
    ls.insert(0, "Archie")
    ls.sort()
    print ls


if __name__ == '__main__':
    main()
