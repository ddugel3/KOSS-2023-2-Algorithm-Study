n = int(input())
stack = []
for i in range(n):
    m = input()
    if 'pop' == m:
        if stack == []:
            print(-1)
        else:
            print(stack.pop())
        continue
    elif 'push' in m:
        a,b = m.split()
        stack.append(int(b))

        continue
    elif 'size' == m:
        print(len(stack))
        continue
    elif 'empty' == m:
        if stack ==[]:
            print(1)
        else:
            print(0)
        continue
    else:
        if stack == []:
            print(-1)
        else:
            print(stack[-1])
        continue