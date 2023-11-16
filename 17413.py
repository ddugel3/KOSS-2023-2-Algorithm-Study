m=input()
stack=[]
tag=[]
result = []
tagpoint=0
if "<" in m:
    for i in m:
        if tagpoint == 0: #단어가 나오는 중일때
            if i == "<":
                result.append("".join(stack[::-1]))
                result.append(i)
                tagpoint = 1

                stack = []
            elif i == " ":
                result.append("".join(stack[::-1]))
                result.append(" ")
                stack =[]
            else:
                stack.append(i)
        else:
            if i == ">":
                result.append(i)
                tagpoint = 0
            else:
                result.append(i)
    result.append("".join(stack[::-1]))
else:
    m = m.split(" ")
    for i in m:
        print(''.join(reversed(i)),end=" ")
sol = "".join(result)
print(sol)