def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)


N, S = map(int, input().split())
people = list(map(int, input().split()))
answer = abs(people[0] - S)

for value in people[1:]:
    answer = gcd(abs(value - S), answer)

print(answer)