d={'Apple':1,'Banana':2,'Cherry':3}
key= input("Enter key to check:")
if key in d.keys():
      print("Key is present and value of the key is:")
      print(d[key])
else:
      print("Key isn't present!")