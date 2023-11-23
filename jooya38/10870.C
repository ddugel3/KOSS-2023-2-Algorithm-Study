//피보나치 수열
#include<stdio.h>

int fibo(int);  //함수 원형 선언

int main(){    
    int x;
    int a;
    scanf("%d",&x);
    a=fibo(x);
    printf("%d", a);
}

int fibo(int n){   //피보나치 (재귀)
    if(n<2){
        return n;
    }else{
        return fibo(n-1)+fibo(n-2);
    }
}