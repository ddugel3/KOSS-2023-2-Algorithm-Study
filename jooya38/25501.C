//재귀의 귀재
//함수의 반환값과 recursion 함수의 호출 횟수 출력
#include <stdio.h>
#include <string.h>

int f_count=0; //recursion 함수의 호출 횟수
//전역변수

int count(){
    f_count+=1;
    return f_count;
}

int recursion(const char *s, int l, int r){
    count();
    if(l >= r) {
        return 1;
    }
    else if(s[l] != s[r]) {
        return 0;
    }
    else {
        return recursion(s, l+1, r-1);
    }
}

int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}

int main(){
    int t;
    scanf("%d", &t);
    for(int i=0; i<t; i++){
        char test[1001]; //문장
        int re_an; //함수 반환값 변수
        scanf("%s", test);
        re_an = isPalindrome(test);
        printf("%d %d\n", re_an, f_count);
        f_count=0;
    }
}