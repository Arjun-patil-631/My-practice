/*
A cyber security needs to mask user emails for privacy you must replace all characters in the username (before @)
with * except for the first and last characters

constraints: string length 3<= |S|<=100

The input always contains exactly one @
*/

/*
#include <stdio.h>
#include <string.h>

int main() {
    char s[101];
    printf("INPUT : ");
    scanf("%100s", s);

    int i = 0;

    //first find '@'
    while (s[i] != '@') {
        i++;
    }

    // Mask characters between first and last
    for (int j = 1; j < i - 1; j++) {
        s[j] = '*';
    }
    printf("OUTPUT : ");
    printf("%s\n", s);

    return 0;
}
*/


/*
the above code can be solved  using the recursion concept*/


//using recursion:
#include<stdio.h>
#include<string.h>

void maskEmail(char s[], int index){
    if(s[index]=='@'){
    return;
    }
    if (index > 0 && s[index + 1] != '@') {
        s[index] = '*';
    }

    maskEmail(s, index + 1);
}

int main(){
    char s[101];
    printf("Enter the Email: ");
    scanf("%100s", s);

    maskEmail(s, 0);
    printf("The masked mail is : %s", s);
    return 0;
}
