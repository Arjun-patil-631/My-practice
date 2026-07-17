//max profits from stock prices
LC121
#include <stdio.h>
#define length(arr) (sizeof(arr) / sizeof(arr[0]))
int main(){
    int i, j, max_profit = 0;
    int prices[]={7,1,5,3,6,4};
    int n=length(prices);
    for(i = 0; i < n - 1; i++){
        for(j = i + 1; j < n; j++){
            if(prices[j] > prices[i]){
                int profit = prices[j] - prices[i];
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }
    }
    printf("Maximum Profit: %d\n", max_profit);
    return 0;
}