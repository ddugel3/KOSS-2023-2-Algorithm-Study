n = list(map(int,input().split()))
result1=[]
result2=[]
for i in range(n[0]):
    l = []
    m=list(map(int,input().split()))
    for j in range(n[1]):
        l.append(m[j])
    result1.append(l)

for i in range(n[0]):
    l = []
    m=list(map(int,input().split()))
    for j in range(n[1]):
        l.append(m[j])
    result2.append(l)
for i in range(n[0]):
    for j in range(n[1]):
        print(result1[i][j]+result2[i][j],end=" ")
    print("")