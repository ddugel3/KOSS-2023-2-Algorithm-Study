num1, num2 = map (int, input().split())

def binary (num1, num2):
    num3 = "0123456789ABCDEF"
    if num1<num2:
        return str(num3[num1])
    else:
        return binary(num1//num2,num2)+str(num3[num1%num2])
print(binary(num1,num2))