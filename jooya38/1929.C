#include<iostream>
#include<vector>

int main()
{
    int M, N;
    scanf("%d %d", &M, &N);
    int numberPrice = N-M+1;
    int number[numberPrice];

    for (int i = 2; i<=N; i++){
        number[i]=i;
    }
    
    for(int i = 2; i<=N; i++){
        if(number[i]==0){
            continue;
        }
        else
        {
          for (int j = 2*i; j<=N; j+=i)
          {
              number[j]=0;
          }            
        }
    }
    for(int i = M; i<=N; i++){
      if(number[i]!=0)
        printf("%d\n",number[i]);
    }
}