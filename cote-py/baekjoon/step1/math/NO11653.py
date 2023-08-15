value = int(input())

i = 2
while value > 1:
    if value % i == 0:
        print(i)
        value = value / i
    else:
        i += 1
