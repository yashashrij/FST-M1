def rsum(n):
    if n <= 0:
        return n
    else:
        return n + rsum(n-1)

num = int(input("Enter a number: "))
rec=rsum(num)
print("The sum is",rec)