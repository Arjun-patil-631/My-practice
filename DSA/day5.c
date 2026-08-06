//combinations; if n employees, and form team of k members
/*
#include<stdio.h>
int main(){
    int n, k;
    scanf("%d", &n);
    scanf("%d", &k);
    for(int i=1; i<n; i++){
        for(int j=i+1; j<=n; j++){
            printf("%d %d\n", i,j);
        }
    }
}
*/
/*
//using functions generate all combinations of n employees and form team of k members
#include<stdio.h>
void generate(int i, int k, int n, int index){
    static int arr[100];
    if(index==k){
        for(int j=0; j<k; j++)
            printf("%d ", arr[j]);
        printf("\n");
        return;
    }
    if(i>n)
        return;
    arr[index]=i;
    generate(i+1, k, n, index+1);
    generate(i+1, k, n, index);
}

int main(){
    int n, k;
    printf("Enter the number of employees (n): ");
    scanf("%d", &n);
    printf("Enter the team size (k): ");
    scanf("%d", &k);
    generate(1, k, n, 0);
}
*/

#include<stdio.h>
int arr[30];
void generate(int s, int n, int k, int index){
    if(index==k){
        for(int i=0; i<k; i++)
            printf("%d ", arr[i]);
        printf("\n");
        return;
    }
    for(int i=s; i<=n; i++){
        arr[index]=i;
        generate(i+1, n, k, index+1);
    }
    return;
}

int main(){
    int n, k;
    printf("Enter the number of employees (n): ");
    scanf("%d", &n);
    printf("Enter the team size (k): ");
    scanf("%d", &k);
    generate(1, n, k, 0);
}

   

