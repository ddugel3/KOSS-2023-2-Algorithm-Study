#include <stdio.h>
#include <deque>
#include <ctype.h>
#include <string.h>

using namespace std;

int main() {
    deque<char> pipe;
    char string[100001];

    scanf("%[^\n]", string);

    int stringlen = strlen(string);
    

    for (int i = 0; i < stringlen; i++) {
        if (string[i] == '<') {
            
            while (i < stringlen && string[i] != '>') {
                pipe.push_back(string[i]);
                i++;
            }
            pipe.push_back('>');
        } else if (string[i] != '<') {
            if (!isspace(string[i])) {
                deque<char> word;
                while (i < stringlen && !isspace(string[i]) && string[i] != '<') {
                    word.push_front(string[i]);
                    i++;
                }
                while (!word.empty()) {
                    pipe.push_back(word.front());
                    word.pop_front();
                }
                i--; 
            } else {
                pipe.push_back(string[i]);
            }
        }
    }

    while (!pipe.empty()) {
        printf("%c", pipe.front());
        pipe.pop_front();
    }

    return 0;
}