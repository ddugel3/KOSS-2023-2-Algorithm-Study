import sys
input = sys.stdin.readline

n = int(input())
li = [0 for i in range(n)]
dp = li.copy()

for i in range(n):
    li[i] = int(input())
dp[0] = li[0]
dp[1] = dp[0] + li[1]

for i in range(2, n):
    dp[i] = max(dp[i-2] + li[i], dp[i-3] + li[i] + li[i-1], dp[i-4] + li[i] + li[i-1])