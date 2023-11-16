#include<stdio.h>
#include<stack>
#include<string.h>

using namespace std;

int main(){
    int t;
    char s[51];
    std::stack<char> check;
    scanf("%d", &t);
    

    for (int i=0; i<t; i++){
        scanf("%s", s);
        for(int j=0; s[j]; j++){
            if (s[j]=='('){
                check.push('(');
            }
            else if (s[j]==')'&&check.empty()){
                printf("NO\n");
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