n = int(input())
li = ""


for i in range(n):
    st = []
    li = input()
    
    for j in li:
        a = 0
        if j == '(':
            st.append("(")
            
        elif j == ')': 
            if st:
                st.pop()
                
            else:
                print("NO")
                a += 1
                break
            
    if a != 1 and len(st) == 0:
        print("YES")

    elif a != 1 and len(st) != 0: 
        print("NO")