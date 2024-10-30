#include "QuickSort.h"
#include <iostream>

const bool QuickSort::asc = true;   // 定义静态常量升序
const bool QuickSort::desc = false;  // 定义静态常量降序

// 默认构造函数
QuickSort::QuickSort() : order(true) {}

// 带参数构造函数，指定排序规则
QuickSort::QuickSort(bool rule) : order(rule) {}

// 对外提供的排序方法
void QuickSort::sort(int arr[]) {
    // 计算数组长度
    int size = 0;
    while (arr[size] != '\0') { // 假设输入的数组以0作为结束标志
        size++;
    }
    quickSort(arr, 0, size - 1, order);
}

// 快速排序实现
void QuickSort::quickSort(int arr[], int i, int j, bool rules) {
    int start = i;
    int end = j;

    if (start >= end) {
        return;
    }

    int base = arr[i];

    while (start < end) {
        if (rules) {
            while (start < end && arr[end] >= base) {
                end--;
            }
            while (start < end && arr[start] <= base) {
                start++;
            }
        } else {
            while (start < end && arr[end] <= base) {
                end--;
            }
            while (start < end && arr[start] >= base) {
                start++;
            }
        }

        if (start < end) {
            std::swap(arr[start], arr[end]);
        }
    }

    std::swap(arr[i], arr[start]);

    quickSort(arr, i, start - 1, rules);
    quickSort(arr, start + 1, j, rules);
}

