t = input()
a = tuple(int(x) for x in t.split())
print(a)

print("Elements that are divisible by 5:")
for num in a:
    if (num % 5 == 0):
        print(num)