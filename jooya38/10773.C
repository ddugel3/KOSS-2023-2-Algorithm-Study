// stack 사용
// 0 입력 -> pop(); 1번
// 0 아닌 수 ->  push(n);

#include <stdio.h>
#include <stack>

int main(){
    std::stack<int> s;
    int t, n, num=0;
    int sum=0;
    scanf("%d", &t);

    for (int i=0; i<t; i++){
        scanf("%d", &n); 
        if (n!=0){
            s.push(n);
        }else if(n==0){
            s.pop();
        }
    }
    // while (s.empty==false){
        // num = s.top();
        // sum += num;
        // s.pop();
    // }
    int size=s.size();
    for (int i = 0; i<size; i++){
        num = s.top();
        sum += num;
        s.pop();
    }
    printf("%d", sum);
    return 0;
}