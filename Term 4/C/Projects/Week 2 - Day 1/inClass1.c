#include <stdio.h>
#include <string.h>


typedef struct {
    char name[50];
    float gpa;
    int age;
}Student;


void printStudentInfo(Student students[], int count) {
    for (int i = 0; i < count; i++) {
        printf("Student %d:\n", i + 1);
        printf("Name: %s\n", students[i].name);
        printf("GPA: %.2f\n", students[i].gpa);
        printf("Age: %d\n", students[i].age);
        printf("\n");
    }
    

}

void readStudentInfo(Student students[], int count) {
    
    for (int i = 0; i < count; i++) {
        
        printf("Enter the students name: ");
        scanf("%s", students[i].name);
        printf("Enter the students gpa: ");
        scanf("%f", &students[i].gpa);
        printf("Enter the students age: ");
        scanf("%d", &students[i].age);
    }

}

void calculateAverageGPA(Student students[], int count) {
    float totalGPA = 0.0;
    for (int i = 0; i < count; i++) {
        totalGPA += students[i].gpa;
    }
    float averageGPA = totalGPA / count;
    printf("Average GPA: %.2f\n", averageGPA);
}

float findMaxGpa(Student students[], int count) {
    float maxGPA = students[0].gpa;
    int maxGPAIndex = 0;
    char studentName[50];
    for (int i = 1; i < count; i++) {
        if (students[i].gpa > maxGPA) {
            maxGPA = students[i].gpa;
            maxGPAIndex = i;
            
        }
        
    }
    printf("Student with the highest GPA: %s with a GPA of %.2f\n", students[maxGPAIndex].name, students[maxGPAIndex].gpa);
    return maxGPA;

}

void main() {
    Student customers[3];
    readStudentInfo(customers,3);
    printStudentInfo(customers, 3);
    calculateAverageGPA(customers, 3);
    findMaxGpa(customers, 3);
}




    
    
    
