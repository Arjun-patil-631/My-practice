
#include <stdio.h>
#include <stdlib.h>

long long merge(int arr[], int temp[], int left, int mid, int right) {
    int i = left;
    int j = mid + 1;
    int k = left;
    long long count = 0;

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
            count += (mid - i + 1);
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= right) {
        temp[k++] = arr[j++];
    }

    for (i = left; i <= right; i++) {
        arr[i] = temp[i];
    }

    return count;
}

long long mergeSort(int arr[], int temp[], int left, int right) {
    long long count = 0;

    if (left < right) {
        int mid = left + (right - left) / 2;

        count += mergeSort(arr, temp, left, mid);
        count += mergeSort(arr, temp, mid + 1, right);
        count += merge(arr, temp, left, mid, right);
    }

    return count;
}

int main(void) {
    int N;
    scanf("%d", &N);

    int *arr = malloc(N * sizeof(int));
    int *temp = malloc(N * sizeof(int));

    if (arr == NULL || temp == NULL) {
        free(arr);
        free(temp);
        return 1;
    }

    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    long long result = mergeSort(arr, temp, 0, N - 1);

    printf("%lld\n", result);

    free(arr);
    free(temp);

    return 0;
}
