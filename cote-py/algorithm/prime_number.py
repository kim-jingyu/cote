import math


def is_prime_easy_version(target):
    for i in range(2, target):
        if target % i == 0:
            return False
    return True


def is_prime_improved_version(target):
    for i in range(2, int(target / 2) + 1):
        if target % i == 0:
            return False
    return True


def is_prime_sqrt_version(target):
    for i in range(2, int(math.sqrt(target)) + 1):
        if target % i == 0:
            return False
    return True


def sieve_of_eratosthenes(target):
    check_list = [True] * (target + 1)
    for i in range(2, target + 1):
        if not check_list[i]:
            continue

        for j in range(i + i, target + 1, i):
            check_list[j] = False

    for i in range(2, target + 1):
        if check_list[i]:
            print(i, end=' ')


if __name__ == '__main__':
    sieve_of_eratosthenes(100)
    # if is_prime_improved_version(9):
    #     print('소수입니다.')
    # else:
    #     print('소수가 아닙니다')

# 14 -> 1 2 7
# 16 -> 1 2 4 8