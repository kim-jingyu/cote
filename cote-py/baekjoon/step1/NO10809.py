S = input()
nums = [-1] * 26

for i in range(len(S)):
    idx = ord(S[i]) - ord('a')
    if nums[idx] == -1:
        nums[idx] = i

print(' '.join(map(str, nums)))