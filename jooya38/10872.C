//팩토리얼
#include<stdio.h>

int fac(int);  //함수 원형 선언

int main(){
    int x;
    int a;
    scanf("%d", &x);
    a = fac(x);
    printf("%d", a);
}

int fac(int n){
    if(n==0 || n==1){
        return 1;
    }else{
        return n*fac(n-1);
    }

}