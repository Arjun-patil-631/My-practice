#include <stdio.h>

void generate(int allowed[], int m, int password[], int index, int n)
{
    if (index == n)
    {
        for (int i = 0; i < n; i++)
            printf("%d", password[i]);
        printf("\n");
        return;
    }
    for (int i = 0; i < m; i++)
    {
        password[index] = allowed[i];
        generate(allowed, m, password, index + 1, n);
    }
}

int main()
{
    int n, m;
    printf("Enter password length: ");
    scanf("%d", &n);
    printf("Enter number of allowed digits: ");
    scanf("%d", &m);
    int allowed[m];
    int password[n];
    printf("Enter allowed digits:\n");
    for (int i = 0; i < m; i++)
        scanf("%d", &allowed[i]);
    printf("\npossible passwords:\n");
    generate(allowed, m, password, 0, n);
    return 0;
}