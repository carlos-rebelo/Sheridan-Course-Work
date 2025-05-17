#include <stdio.h>

void printHello(int value) {
    for(int i = 1; i <= value; i++) {
        printf("Hello World! %d %s ", i , "-");
    }
}

void printFor() {
    int x1 = 10;
    float x2 = 10.22;
    char x3 = 'A';

    printf("x1 = %d x2 = %f x3 = %c", x1, x2, x3);

}

void getInput() {
    int x;
    int cont = 1;
    int oddCount = 0;
    int evenCount = 0;

    while (cont == 1) {
        printf("Enter an integer: ");
        scanf("%d", &x);
        if (x % 2 == 0)
        {
            printf("%d is an even number\n", x);
            evenCount++;

        }
        else
        {
            printf("%d is an odd number\n", x);
            oddCount++;
        }

        printf("Would you like to try again? y/n: ");
        char answer;
        scanf(" %c", &answer);
        if (answer == 'n')
        {
            printf("You entered %d odd numbers and %d even numbers.", oddCount, evenCount);
            cont = 0;
        }
    }
}

void fivesEx() {
    int nums[5];
    int positiveSum;
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for (int i = 0; i < 5; i++) {
        printf("Enter a number: ");
        scanf("%d", &nums[i]);
        if (nums[i] > 0) {
            printf("%d is a positive number\n", nums[i]);
            positiveSum += nums[i];
            positiveCount++;
        }

        else if (nums[i] == 0)
        {
            printf("%d is zero\n", nums[i]);
            zeroCount++;
        }
        
        else {
            printf("%d is a negative number\n", nums[i]);
            negativeCount++;
        }
        
    }
    printf("The sum of the positive numbers is %d\n", positiveSum);
    printf("The number of positive numbers is %d\n", positiveCount);
    printf("The number of negative numbers is %d\n", negativeCount);
    printf("The number of zeros is %d\n", zeroCount);
}

void kExercise() {
    int k = 0;
    float average = 0;
    float sum = 0;
    int x = 0;

    printf("Enter an integer number: ");
    scanf("%d", &k);

    for (int i = 1; i <= k; i++)
    {
        
        printf("Enter input %d: ", i);
        scanf("%d", &x);
        sum += x;

    }
    printf("Average of %d = %.2f", k, sum/k);
}

void computeArray() {
    int nums[10];
    float sum = 0;
    float average = 0;

    for (int i = 0; i < 10; i++) {
        printf("Enter a number: ");
        scanf("%d", &nums[i]);
    }
    
    for (int i = 0; i < 10; i++) {
        sum += nums[i];
    }
    average = sum / 10;
    printf("Average = %.2f", average);

}


void main () {
    
    struct student {
        char name[50];
        int age;
        char gender;
        char course[50];
        int id;

    };

    struct student student1;


    


}







