def Prime(num):
    if num==1:
        return False
    else:
        for i in range(2,int(num**0.5)+1):
            if num%i == 0:
                return False
        return True
    
n1, n2 = map(int, input().split())

for i in range(n1, n2+1):
    if Prime(i):
        print(i)