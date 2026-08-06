#include<stdio.h>
int notes[15];
int combinations[100];
void find(int index, int n, int target, int sum, int size){
    if(sum==target){
        for(int i=0; i<size; i++){
            printf("%d ", combinations[i]);
           }
        printf("\n");
        return;
    }
    if(sum>target || index==n){
        return;
    }
    combinations[size]=notes[index];
    find(index, n, target,sum+notes[index], size+1);
    find(index+1, n, target,sum, size);
}

int main(){
    int n, target;
    print("how many types of notes?:")
    scanf("%d", &n);
    for(int i=0; i<n; i++)
        scanf("%d", &notes[i]);
    print("Enter the target value:");
    scanf("%d", &target);
    find(0, n, target, 0, 0);
    return 0;
}