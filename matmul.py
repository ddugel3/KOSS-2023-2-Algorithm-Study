import numpy as np
n = int(input())
r = []
while n>0:
    r, s, t = map(int, input().split(" "))
    result1=[]
    result2=[]
    for i in range(r):
        l = []
        m=list(map(int,input().split()))
        for j in range(s):
            l.append(m[j])
        result1.append(l)
    for i in range(s):
        l = []
        m=list(map(int,input().split()))
        for j in range(t):
            l.append(m[j])
        result2.append(l)
    result=list(np.array(result1)@np.array(result2))
    # print(result)
    # print(type(result))
    # r.append(result)
# for j in range(n):
    for i in range(r):
        for j in range(t):
            print(result[i][j],end=" ")
        print("")
    n -=1
