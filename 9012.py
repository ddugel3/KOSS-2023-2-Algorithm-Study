n = int(input())

for i in range(n):
    m = str(input())
    stack = []
    p=0
    for j in range(len(m)):
        if m[j] == '(':
            stack.append(m[j])
        elif m[j] == ')':
            if stack != [] and stack[-1] == '(':
                stack.pop()
            else:
                print('NO')
                p=1
                break
    if p==1:
        pass
    else:
        if stack == []:
            print('YES')
        else:
            print('NO')
