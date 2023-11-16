M, N = map(int, input().split(" "))

numbers = list(range(M,N+1))
if 1 in numbers:
    numbers.remove(1)
for i in numbers:
    for j in range(2,int(N/2)):
        if i*j in numbers:
            numbers.remove(i*j)

while numbers !=[]:
    print(numbers.pop(0))