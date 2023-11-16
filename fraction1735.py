a, b = map(int, input().split())
c, d = map(int, input().split())

m = b*d
n = a*d + b*c

def gcd(a,b):
    if b>a:
        a,b = b,a
    while a%b > 0:
        a, b = b , a%b
    return b
z = gcd(n,m)
print(n//z, m//z)
