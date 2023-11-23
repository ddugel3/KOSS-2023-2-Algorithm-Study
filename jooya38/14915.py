a, b= map(int, input().strip().split())
def formation(a,b):
    c="0123456789ABCDEF"
    if a<b:
        return str(c[a])
    else:
        return formation(a//b,b)+str(c[a%b])
print(formation(a,b))