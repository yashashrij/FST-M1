def message():
    try:
        name = "Yashashri"
        return yashashri
    except NameError:
        return "NameError occurred. name hasn't been defined yet."
 
print(message())