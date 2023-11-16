#include <iostream>
#include <stack>

int main(){
    std::stack<int> s;
    int t, n;
    scanf("%d", &t);
    scanf("%d", &n);
    for(int j=1; j<=n; j++){
        s.push(j);
        printf("+");
    }
    for (int i =0; i<t-1; i++){
        int slast=s.top();
        scanf("%d", &n);
        if(slast>n){
            if(){ //이전에 있던 숫자가 아니라면 계속 푸시 아니라면 숫자가 있다면 건너뛰고 n
                s.push()
            }
        }
    }
}