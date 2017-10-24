"""Testing pulling data from bittrex"""
#import url.request
#import urllib.request as url
#import urllib.request as url
#import url.parse
#import url
#from urllib.parse import urllibparse
#import urllib.request.urlopen
import json
#import bittrex_testing as bt
from bittrex import Bittrex

#API Key, Bittrex b8fff1ce3fc24461af8755b802256431
#secret or api key? b586b6fcb829494b90ee14c28128b11d


#Key:8b634f9a28fe44fd8d1266b16f9b232b
#Secret:864d7a972918478b9e78f9f5dc6f761e


def main():

    api_key = "8b634f9a28fe44fd8d1266b16f9b232b"
    api_secret = "864d7a972918478b9e78f9f5dc6f761e"

    print("** Tesing out Bittrex **")
    bitWeb = "https://bittrex.com/api/v1.1/public/getmarkets"
    #markSum = "https://bittrex.com/api/v1.1/public/getmarketsummaries"

    #my_bittrex = Bittrex(api_key, api_secret) # or defaulting to v1.1 as Bittrex(None, None)
    #testing = my_bittrex.get_markets()

    #myTest = bt.bittrex.Bittrex(api_key,api_secret)

    #print(testing)


    #page = url.urlopen(bitWeb).read()
    #mSum = url.urlopen(markSum).read()

    #print(page)
    #-------------------------------------------------
    myB = Bittrex(api_key, api_secret)
    #print(myB.get_markets())
    #print(myB.get_balance('ETH'))
    print(myB.get_balance('NAV'))
    print("-------------")
    balance = myB.get_balance('NAV')
    #test = json.loads(myB.get_balance('ETH'))
    #dump = json.dumps(test)
    #print(dump)
    print(type(balance))
    #balTest = test["Balance"]
    if "result"in balance:
        print(balance["result"]["Balance"])
        result = balance["result"]


    

if __name__ == "__main__":
    main()
