#include<stdio.h>
#include<deque>
#include<ctype.h>
#include<string.h>

using namespace std;


int main(){
    deque<char> pipe;
    char string[10001];
    int t;

    scanf("%d", t);
    scanf("%[^\n]", string);

    for(int i =0; i < t; i++){
            while(i < t && !isspace(string[i])){
                pipe.push_front(string[i]);
                i++;
            }
            i++;
            pipe.push_back(string[i]); 
    }
    
    while (!pipe.empty()) {
        printf("%c", pipe.front());
        pipe.pop_front();
    }
}