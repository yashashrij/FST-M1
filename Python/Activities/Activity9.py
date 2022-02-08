def SplitLists(numList):
    evenList = []
    oddList = []
    for i in numList:
        if (i % 2 == 0):
            evenList.append(i)
        else:
            oddList.append(i)
    print("Even lists:", evenList)
    print("Odd lists:", oddList)

numList = [2, 5, 13, 17, 51, 62, 73, 84, 95]
SplitLists(numList)