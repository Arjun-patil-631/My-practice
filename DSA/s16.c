#define Max 100
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int a[Max];

    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int low = 0, high = n - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (a[mid] < a[mid + 1]) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    printf("%d\n", a[low]);

    return 0;
}
