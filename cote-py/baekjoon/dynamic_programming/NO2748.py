N = int(input())

cache = [-1] * 91
cache[0] = 0
cache[1] = 1


def fibo(num):
    if cache[num] == -1:
        cache[num] = fibo(num - 1) + fibo(num - 2)

    return cache[num]


print(fibo(N))