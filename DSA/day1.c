//taxi fare calculator
#include<stdio.h>
int main(){
    float distance;
    float fare=50;
    int pt;
    scanf("%f", &distance);
    if(distance>5 && distance<=15)
        fare+=(distance-5)*10;
    else if(distance>15)
        fare+=100+(distance-15)*15;
    printf("is it peak time??\n('1' for yes/'0' for no)\n");
    scanf("%d", &pt);
    if(pt==1){
        fare+=fare*(0.2);
    }
    printf("%.2f", fare);
}