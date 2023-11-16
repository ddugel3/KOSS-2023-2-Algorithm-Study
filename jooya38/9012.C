#include<stdio.h>
#include<stack>
#include<string.h>

using namespace std;

int main(){
    int t;
    char s[51];
    stack<char> check;
    scanf("%d", &t);
    

    for (int i=0; i<t; i++){
        scanf("%s", s);
        std::stack<char> check;
        for(int j=0; s[j]; j++){
            if (s[j]=='('){
                check.push('(');
            }
            else if (s[j]==')'&&check.empty()){
                check.push(')');
                // printf("NO\n");
                break;
            }
            else if (s[j]==')'&&!check.empty()){
                    check.pop();
            }
        }
        if (check.empty()){
            printf("YES\n");
        }
        else printf("NO\n");
    }
}