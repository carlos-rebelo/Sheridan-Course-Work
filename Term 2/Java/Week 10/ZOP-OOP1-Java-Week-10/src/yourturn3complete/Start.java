package yourturn3complete;

import java.util.ArrayList;
import java.util.Comparator;

/* ⁡⁢⁣⁢Read Me: ⁡

    -Create a Student class that tracks name, studentNumber and GPA 
    -add a constructor and getters

    2.Create a class called Start with a main method
    Add 6 students to it:
        students.add(new Student("Bart", 1, 67));
        students.add(new Student("Lisa", 2, 98));
        students.add(new Student("Millhouse", 3, 64));
        students.add(new Student("Ralph", 4, 13));
        students.add(new Student("Nelsun", 5, 56));
        students.add(new Student("Martin", 6, 87));

    print out all the student names
    remove Ralph from position 3 and add him to the end (Can you do it in 2 lines of code?  Can you do it in one?)

    test to see if Ralph is still in the list...uh oh, what went wrong???

    Hint:  I hope you are 'equal' to the task to figure it out!
    Hint#2 - we know it is the same student if the studentNumber is the same

    Next, let's fix the spelling of Nelson's name. Pretend we don't know where in the list he is - what is the best way to do this?

    let's print out the list one last time.

    finally, let's print out the name of the student with the highest GPA

*/

public class Start {
    public static void main(String[] args)
    {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bart", 1, 67));
        students.add(new Student("Lisa", 2, 98));
        students.add(new Student("Millhouse", 3, 64));
        students.add(new Student("Ralph", 4, 13));
        students.add(new Student("Nelsun", 5, 56));
        students.add(new Student("Martin", 6, 87));

        System.out.println(students);
        System.out.println(students.get(3));

        Student s1 = students.remove(3);
        System.out.println(students.get(3));
        students.add(s1);

        // students.add(students.get(3));

        Student newNeslon = new Student("Nelson", 5, 56);
        int nelsonLocation = students.indexOf(newNeslon);
        System.out.println(nelsonLocation);
        students.set(nelsonLocation, newNeslon);

        System.out.println(students);

        String studentName = students.get(0).getName();
        int highest = students.get(0).getGPA();
        for (Student student : students)
        {
            if (student.getGPA() > highest)
            {
                highest = student.getGPA();
                studentName = student.getName();
            }
        }
        System.out.println(studentName);

        //hmmmmm....or:

        String bestStudent = students.stream()
                .max(Comparator.comparing(Student::getGPA))
                .get().getName();

        System.out.println(bestStudent);

        //this is known as streams - I will be releasing a video about Streams soon if you want to check them out.
    }
}
