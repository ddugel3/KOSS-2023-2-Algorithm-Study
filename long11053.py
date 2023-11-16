n = int(input())
m = list(map(int,input().split()))
a= 0
count = 0
for j in m:
    for i in range(a,n-1):
        if j < m[i+1]:
            j = m[i+1]
            count +=1

    a += 1
print(count)

