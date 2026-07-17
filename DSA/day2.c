//water tank monitoring system
#include<stdio.h>
int main(){
    int water;
    while(water<=100){
        scanf("%d", &water);
        if(water==-1){
           printf("system disconnected");
           return 0;
        }
        else if(water<=20)
            printf("ALERT !!!\n");
        else if(water>100)
        {
            printf("OVERFLOW!!")
            return 0;
        }
        else printf("water filling");
    }
    printf("TANK FULL");
    return 0;
}