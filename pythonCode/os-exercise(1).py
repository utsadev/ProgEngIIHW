import os
import time
import webbrowser

import tweepy


def pythonCode():
    directory=".."
    folder="HelloWorld"
    path=os.path.join(directory,folder)
    fileName="Method.py"
    newPath=os.path.join(path,fileName)
    print newPath
    newCommand="python "+newPath
    print newCommand
    os.system(newCommand)
#pythonCode()
#os.system("ls")
#os.system("date")
def webPage():
    webbrowser.open("https://www.google.com")
    time.sleep(5)
    webbrowser.open("https://www.cnn.com")
    time.sleep(5)
    webbrowser.open("https://www.utsa.edu")
#webPage()

def login_to_twitter(consumer_key, consumer_secret, access_token, access_token_secret):

    auth = tweepy.OAuthHandler(consumer_key,  consumer_secret)
    auth.set_access_token(access_token,       access_token_secret)

    api = tweepy.API(auth)
    ret = {}
    ret['api'] = api
    ret['auth'] = auth
    return  api

def SendTwitter():
    consumer_key = ''
    consumer_secret = ''
    access_token = ''
    access_token_secret = ''



    MessList=["How are you doing today ","I like Twitter! ","Just test it "]
    for i in range (0,len(MessList)):
        message =MessList[i]+str(i)
        print message

        api = login_to_twitter(consumer_key, consumer_secret, access_token, access_token_secret )

        ret = api.update_status(status=message)


def RemoveTweet():
    consumer_key = ''
    consumer_secret = ''
    access_token = ''
    access_token_secret = ''

    api = login_to_twitter(consumer_key, consumer_secret, access_token, access_token_secret )
    timeline=api.user_timeline(count=3)
    print "Found %d" %(len(timeline))
    print timeline
    for t in timeline:
        api.destroy_status(t.id)
#
if __name__ == '__main__':
    #SendTwitter()
    RemoveTweet()