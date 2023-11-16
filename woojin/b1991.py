def search(root):
    node = dic[root]
    result.append(root)
    if node[0] == '.' and node[1] == '.':
        return
    if node[0] != '.':
        search(node[0])
    if node[1] != '.':
        search(node[1])

def search2(root):
    node = dic[root]
    if node[0] == '.' and node[1] == '.':
        result.append(root)
        return
    if node[0] == '.' and node[1] !='.':
        result.append(root)
    if node[0] != '.':
        search2(node[0])
        result.append(root)
    if node[1] != '.':
        search2(node[1])

def search3(root):
    node = dic[root]
    if node[0] == '.' and node[1] == '.':
        result.append(root)
        return
    if node[0] != '.':
        search3(node[0])
    if node[1] != '.':
        search3(node[1])
        result.append(root)
    if node[0] != '.' and node[1] =='.':
        result.append(root)

root = 'A'
dic = dict()

n = int(input())
for _ in range(n):
    a,b,c = input().split()
    dic[a] = [b,c]

result = []
search(root)
print(''.join(result))

result = []
search2(root)
print(''.join(result))

result = []
search3(root)
print(''.join(result))