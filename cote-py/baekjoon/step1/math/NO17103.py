MAX = 10 ** 6
T = int(input())
prime_check = [False, False] + [True] * (MAX - 1)

for i in range(2, MAX + 1):
    if prime_check[i]:
        for j in range(i*2, MAX + 1, i):
            prime_check[j] = False


for _ in range(T):
    N = int(input())
    answer = 0
    for i in range(1, N // 2 + 1):
        if prime_check[i] and prime_check[N - i]:
            answer += 1
    print(answer)
