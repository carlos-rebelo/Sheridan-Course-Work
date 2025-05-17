
#include <stdio.h>
#include <string.h>

// Recursive Function
long recursiveFactorial(int n)
{
    if (n < 2)
    {
        return 1;
    }
    else
    {
        return n * recursiveFactorial(n - 1);
    }
}
// Recursive Function
void factorialApp()
{
    int userNum = 1;

    while (userNum >= 0)
    {
        printf("Please enter a positive integer to calculate its factorial: ");
        scanf("%d", &userNum);
        if (userNum > 50)
        {
            printf("Value is too big!\n");
        }
        else if (userNum >= 0)
        {
            printf("The factorial of %d is %ld\n", userNum, recursiveFactorial(userNum));
        }
    }
}
// Recursive Function
long fibonacci(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
// Recursive Function
void fibonacciApp()
{
    int n = 0;

    while (n >= 0)
    {
        printf("Please enter a positive integer to calculate its fibonacci: ");
        scanf("%d", &n);
        if (n > 50)
        {
            printf("Value is too big!\n");
        }
        else if (n >= 0)
        {
            printf("The fibonacci of %d is %ld\n", n, fibonacci(n));
        }
    }
}

void basicPointers()
{
    // Pointers
    int n = 10;
    int *ptr = &n;
    printf("Value of n: %d\n", n);
    printf("Value of ptr: %p\n", ptr);
    printf("Value of *ptr: %d\n", *ptr);
    *ptr = 20;

    printf("Value of n: %d\n", n);
    printf("Value of ptr: %p\n", ptr);
    printf("Value of *ptr: %d\n", *ptr);
}

void funNoPointer(int x, int y)
{
    x = 10;
    y = 20;

    printf("%d %d\n", x, y);
}

void funPointer(int *x, int *y)
{
    *x = 10;
    *y = 20;

    printf("%d %d\n", *x, *y);
}

void pointersToFunctions()
{
    int a = 1;
    int b = 2;
    printf("By Value: \n");
    printf("%d %d\n", a, b);
    funNoPointer(a, b);
    printf("%d %d\n", a, b);
    printf("By Reference: \n");
    printf("%d %d\n", a, b);
    funPointer(&a, &b);
    printf("%d %d\n", a, b);
}

void test(int val[], int m)
{
    int j;
    for (j = 0; j < m; j++)
    {
        val[j] += 25;
    }
}

int main()
{
    // declare a pointer
    char *chrPtr = "Sheridan";
    int i;
    for (i = 0; i < 8; i++)
    {
        printf(" %c : %u \n", *chrPtr, chrPtr);
        chrPtr++;
    }

    return 0;
}