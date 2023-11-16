n = int(input())
n_list =[i+1 for i in range(n)]
i = 0
stack = []
result = []
answer = []
k_list = []

for j in range(n):
    k = int(input())
    k_list.append(k)
    while i <n and n_list[i] <= k :
        stack.append(n_list[i])
        answer.append('+')
        i+=1
        if i >= n:
            break


    if stack and stack[-1] == k:
        result.append(stack.pop())
        answer.append('-')
while stack:
    result.append(stack.pop())
    answer.append('-')
if k_list == result:
    for i in answer:
        print(i)
else:
    print("NO")