def gcd(a,b):
    if b>a:
        a,b = b,a
    while a%b > 0:
        a, b = b , a%b
    return b
print(gcd(3,9))