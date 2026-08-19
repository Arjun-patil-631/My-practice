#include <stdio.h>

int a[100][100], visited[100], n, count;

void dfs(int person) {
    visited[person] = 1;

    for (int i = 0; i < n; i++) {
        if (a[person][i] == 1 && !visited[i]) {
            count++;
            dfs(i);
        }
    }
}

int main() {
    int i, j, start;

    printf("Enter the number of friends: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            a[i][j] = 0;
        }
        visited[i] = 0;
    }

    printf("Enter the adjacency matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    start=0;
    count = 1;
    dfs(start);

    printf("Total distinct friends reachable from friend %d: %d\n", start + 1, count);
    return 0;
}