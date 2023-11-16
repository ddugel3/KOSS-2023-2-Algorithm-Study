#include<stdio.h>
#include<deque>
#include<ctype.h>
#include<string.h>

using namespace std;


void main(){
    deque<char> pipe;
    char string[10001];
    // char result[10001];

    scanf("%[^\n]", string);

    int stringlen = strlen(string);

    for(int i =0; i < stringlen; i++){
        if(string[i]=='<'){

            while (i < stringlen && string[i] != '>'){
                pipe.push_back(string[i]);
                i++;
            }      
            pipe.push_back('>');            
        }
        else if(string[i] != '<'){
            while(i < stringlen && !isspace(string[i])){
                pipe.push_front(string[i]);
                i++;
            }
            pipe.push_back(string[i]); 
        }
    }
    
    while (!pipe.empty()) {
        printf("%c", pipe.front());
        pipe.pop_front();
    }
}