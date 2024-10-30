#include <iostream>
#include "QuickSort.h"

int main() {
    int arr[] = {45, 57, 78, 41, 5, 1, 5, 66, 41, 10, 969, 51, 150, 415, 77};

    QuickSort qs(desc);

    qs.sort(arr);

    for (int i = 0; i < 15; ++i) {
        std::cout << arr[i] << " ";
    }
    
}