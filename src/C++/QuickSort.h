#ifndef QUICKSORT_H
#define QUICKSORT_H

static const bool asc = true;   // 用于指定升序
static const bool desc = false;  // 用于指定降序

class QuickSort {
public:


    QuickSort();                          // 默认构造函数
    QuickSort(bool rule);                 // 带参数构造函数，指定排序规则

    void sort(int arr[]);                 // 对外提供的排序方法

private:
    bool order;                          // 排序规则
    void quickSort(int arr[], int i, int j, bool rules); // 快速排序实现
};

#endif // QUICKSORT_H
