/*
 ============================================================================
 Name        : gpa_calculator.c
 Author      : Carlos Rebelo
 Date        : 2025-05-11
 Description : This program allows a user to manage and calculate GPA data
 *             for a fixed set of courses. The user can:
 *               - Load course data from a text file
 *               - Update grades for specific courses
 *               - View all current courses
 *               - Find the highest grade from the courses
 *               - Calculate and display GPA from course details
 *               - Save updated course data to a text file
 ============================================================================
*/

#include <stdio.h>
#include <stdbool.h>

// Define a Course structure to hold course ID, credit hours, and grade
typedef struct
{
    char courseId[50];
    int courseCredit;
    float courseGrade;
} Course;

#define MAX_COURSES 4 // Define how many courses are allowed

// Reads course data from a file into an array of Course structures
void readCourses(char fileName[], Course courses[])
{
    FILE *fp;
    fp = fopen(fileName, "r");

    if (fp == NULL)
    {
        printf("Error opening file.\n");
    }

    else
    {
        for (int i = 0; i < MAX_COURSES; i++)
        {
            fscanf(fp, "%s %d %f", courses[i].courseId, 
                &courses[i].courseCredit, &courses[i].courseGrade);
        }
        fclose(fp);
    }
}

// Displays the main menu of options to the user
void displayMenu()
{
    printf("Welcome to the GPA Calculator!\n");
    printf("Please select an option:\n");
    printf("1. Update Grades\n");
    printf("2. View Grades\n");
    printf("3. Find Maximum Grade\n");
    printf("4. Calculate GPA\n");
    printf("5. Save Grades\n");
    printf("6. Exit\n");
    printf("Enter your choice (1-6): ");
}

// Lists all courses and their current data
void displayCourses(Course courses[])
{
    for (int i = 0; i < MAX_COURSES; i++)
    {
        printf("%d. %s %d %f\n", i + 1, courses[i].courseId, 
            courses[i].courseCredit, courses[i].courseGrade);
    }
}

// Returns the greater of two float values
float max(float n1, float n2)
{
    if (n1 > n2)
    {
        return n1;
    }
    else
    {
        return n2;
    }
}

// Loops through all grades and returns the highest one
float findMaxGrade(Course courses[])
{
    float maxGrade = courses[0].courseGrade;
    for (int i = 1; i < MAX_COURSES; i++)
    {
        maxGrade = max(maxGrade, courses[i].courseGrade);
    }
    return maxGrade;
}

// Lets the user select a course and update its grade
void updateGrades(Course courses[])
{
    int index;
    displayCourses(courses);
    printf("Enter the index of the course you want to update: ");
    scanf("%d", &index);
    printf("Enter the new grade for the course: ");
    scanf("%f", &courses[index - 1].courseGrade);
    printf("Updated Grade: %.2f\n", courses[index - 1].courseGrade);
}

// Converts a numeric grade into a grade point value
float gradePoint(float grade)
{
    if (grade >= 90)
    {
        return 4.0;
    }
    else if (grade >= 85)
    {
        return 3.8;
    }
    else if (grade >= 80)
    {
        return 3.6;
    }
    else if (grade >= 75)
    {
        return 3.3;
    }
    else if (grade >= 70)
    {
        return 3.0;
    }
    else if (grade >= 65)
    {
        return 2.5;
    }
    else if (grade >= 60)
    {
        return 2.0;
    }
    else if (grade >= 55)
    {
        return 1.5;
    }
    else if (grade >= 50)
    {
        return 1.0;
    }
    else
    {
        return 0.0;
    }
}

// Calculates the weighted GPA based on course credits and grades
float computeGPA(Course courses[])
{
    float totalGPApoints = 0;
    int totalCredits = 0;
    for (int i = 0; i < MAX_COURSES; i++)
    {
        totalGPApoints += (gradePoint(courses[i].courseGrade) * 
            courses[i].courseCredit);
        totalCredits += courses[i].courseCredit;
    }
    return totalGPApoints / totalCredits;
}

// Saves the current course data to a specified file
void saveCourses(Course courses[])
{
    FILE *output_fp;
    char filename[50];
    printf("Enter the name of the file to save the courses" 
            " (include the extension): ");
    scanf("%s", filename);
    output_fp = fopen(filename, "w");
    if (output_fp == NULL)
    {
        printf("Error opening file.\n");
    }

    else
    {
        fprintf(output_fp, "Carlos Rebelo's Courses\n");
        for (int i = 0; i < MAX_COURSES; i++)
        {
            fprintf(output_fp, "%s %d %f\n", courses[i].courseId, 
                courses[i].courseCredit, courses[i].courseGrade);
        }
    }
    fclose(output_fp);
    printf("Courses saved successfully!\n");
}

// Main program loop
void main()
{
    Course courses[MAX_COURSES]; // Stores all course data
    bool active = true;

    // Load initial course data from file
    readCourses("grades.txt", courses);

    // Keep showing the menu until user chooses to exit
    while (active)
    {
        displayMenu();
        int choice;
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            // Update Grades
            updateGrades(courses);
            break;
        case 2:
            // View Grades
            displayCourses(courses);
            break;
        case 3:
            // Find Maximum Grade
            float maxGrade = findMaxGrade(courses);
            printf("The maximum grade is: %.2f\n", maxGrade);
            break;
        case 4:
            // Calculate GPA
            float gpa = computeGPA(courses);
            printf("Your GPA is: %.2f\n", gpa);
            break;
        case 5:
            // Save Grades

            saveCourses(courses);
            break;
        case 6:
            // Exit
            printf("Thank you for using the GPA Calculator!\n");
            active = false;
        }
    }
}
