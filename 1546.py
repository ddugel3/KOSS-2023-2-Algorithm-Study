n = int(input())
m = list(map(int,input().split(" ")))
M = max(m)
l =[]
for i in m:
    l.append(i/M*100)
print(sum(l)/len(l))