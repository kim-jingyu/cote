import sys

values = list(map(int, sys.stdin.readline().split()))

print((values[0] + values[1]) % values[2])
print((values[0] % values[2]) + (values[1] % values[2]) % values[2])
print((values[0] * values[1]) % values[2])
print(((values[0] % values[2]) * (values[1] % values[2])) % values[2])