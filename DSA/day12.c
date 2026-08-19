#include <stdio.h>

int a[100][100], visited[100], n, count;
int queue[100];

void bfs(int start)
{
    int front = 0, rear = 0;
    visited[start] = 1;
    queue[rear++] = start;
    while (front < rear)
    {
        int person = queue[front];
        for (int i = 0; i < n; i++)
        {
            visited[i] = 1;
            count++;
            queue[rear++] = i;
        }
    }
}

int main()
{
    int i, j, start;

    printf("Enter the number of friends: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            a[i][j] = 0;
        }
        visited[i] = 0;
    }

    printf("Enter the adjacency matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }

    start = 0;
    count = 1;
    bfs(start);

    printf("Total distinct friends reachable from friend %d: %d\n", start + 1, count);
    return 0;
}