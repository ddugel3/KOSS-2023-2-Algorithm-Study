//하노이 탑
#include<stdio.h>
#include<math.h>

long long count;

int hanoi(int n, int start, int  to, int end){
    if (n==1){
        printf("%d %d\n", start, end);
        count = 1;
        return 0;
    }else{
        hanoi(n-1, start, end, to);
        printf("%d %d\n", start, end);
        hanoi(n-1, to, start, end);
        count=pow(2,n)-1;
    }
}

int main(){
    int t;
    scanf("%d\n", &t);
    if(t<=20 && t>0){
        printf("%lld\n", count);
        hanoi(t, 1, 2, 3);
    }else{
        printf("%lld\n", count);
    }
}