m, n = map(int, input().split(" "))

def bin(m):
    result = []
    alp = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
    if m == 0:
        return 0
    while m > 0:
        result.append(alp[m%n])
        m = m//n
    result.reverse()
    for i in result:
        if i == 0:
            result.pop()
        else:
            break


    result1 = ''.join(result)
    return result1
print(bin(m))
