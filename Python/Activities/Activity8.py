test_list = [ 1, 6, 3, 5, 3, 4 ]
 
print("Checking if 4 exists in list : ")
 
for i in test_list:
    if(i == 4) :
        print ("Element Exists")

firstElement = test_list[0]

lastElement = test_list[-1]
 
if (firstElement == lastElement):
    print(True)
else:
    print(False)