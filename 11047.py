n,k = map(int,input().split())
A = []
result = 0
for i in range(n):
    m = int(input())
    A.append(m)
A.reverse()

for c in A:
    if k>=c:
        result += k//c
        k = k%c

print(result)