# 방법 1 (딕셔너리로 풀기)
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


# 방법2 (tree를 만들어서 풀기)
from string import ascii_uppercase
 
alpha_list = list(ascii_uppercase)

class Node():
    def __init__(self, name):
        self.name = name
        self.left = None
        self.right = None

class Tree():
    def __init__(self):
        self.root = None

node_dic = dict()
node_dic['.'] = Node('.')
node_dic['.'].left = None
node_dic['.'].right = None

n = int(input())

for i in range(n):
    node_dic[alpha_list[i]] = Node(alpha_list[i])

for _ in range(n):
    a,b,c = input().split()
    
    node_dic[a].left = node_dic[b]
    node_dic[a].right = node_dic[c]

tree = Tree()
tree.root = node_dic['A']

def preorder(root):
    if node_dic[root].name == '.':
        return
    
    print(node_dic[root].name, end='')

    preorder(node_dic[root].left.name)
    preorder(node_dic[root].right.name)

def inorder(root):
    if node_dic[root].name == '.':
        return
    
    inorder(node_dic[root].left.name)
    print(node_dic[root].name, end='')
    inorder(node_dic[root].right.name)

def postorder(root):
    if node_dic[root].name == '.':
        return
    
    postorder(node_dic[root].left.name)
    postorder(node_dic[root].right.name)
    print(node_dic[root].name, end='')

preorder(tree.root.name)
print()
inorder(tree.root.name)
print()
postorder(tree.root.name)