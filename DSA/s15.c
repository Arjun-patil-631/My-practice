#define Max 100
#include <stdio.h>

int arr[Max];
int main() {
    int n;
    scanf("%d", &n);

    

    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int low = 0, high = n - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] % 2 == 0) {
            ans = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    printf("%d\n", ans);

    return 0;
}
