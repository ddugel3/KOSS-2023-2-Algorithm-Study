n = int(input())

paper =[[0] * 100 for _ in range(100)]
for i in range(n):
    a, b = map(int,input().split(" "))
    for j in range(10):
        for k in range(10):
            paper[a+j][b+k]=1
sum1 = 0
for i in paper:
    sum1+=sum(i)
print(sum1)
