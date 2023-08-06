o = input()

# 8진수 -> 10진수
value = int(o, 8)

# 10진수 -> 2진수
b = bin(value)
print(b[2:])