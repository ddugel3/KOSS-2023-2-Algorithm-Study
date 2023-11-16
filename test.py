n = int(input())
def fibo(x):
    dp = [0]*n
    if x == 1 or x ==2:
        return 1
    if dp[x] != 0:
        return dp[x]

    return fibo(x-1) + fibo(x-2)
print(fibo(n))