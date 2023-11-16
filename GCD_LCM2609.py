a, b = map(int,input().split())
c=a*b
if b>a:
    a,b = b,a
while a%b > 0:
    a, b = b , a%b
print(b)
print(int(c/b))

