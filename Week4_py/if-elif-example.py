
print "Welcome to Hotel ABC"
print "How many rooms do you want to reserve?"
roomNo=int(raw_input())
print "How many nights do you want to stay?"
nightNo=int(raw_input())
print "We have King Room ($100/night), and Queen Room ($80/night)"
print "Press 1 to select King Room, and 2 to select Queen Room"
roomType=int(raw_input())
King=100
Queen=80
total=0.0
if (roomType==1):
    total=roomNo*nightNo*King
    if (roomNo>3 and nightNo<=3):
        total=total*0.9
    elif (roomNo<=3 and nightNo>3):
        total = total * 0.9
    elif (roomNo>3 and nightNo>3):
        total = total * 0.8
    else:
        pass
elif(roomType==2):
    total = roomNo * nightNo * Queen
    if (roomNo > 3 and nightNo <= 3):
        total = total * 0.9
    elif (roomNo <= 3 and nightNo > 3):
        total = total * 0.9
    elif (roomNo > 3 and nightNo > 3):
        total = total * 0.8
    else:
        pass
print "Your total Bill is: %.2f"%total
