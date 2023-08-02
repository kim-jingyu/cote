a = list(input())

for i, c in enumerate(a):
    if c.isupper():
        a[i] = chr(65 + (ord(c) - 65 + 13) % 26)
    elif c.islower():
        a[i] = chr(97 + (ord(c) - 97 + 13) % 26)

print(*a, sep='')