package atasteofstreams;

import java.util.List;
import java.util.function.Function;

public class Start {
    public static void main(String[] args)
    {

        Student[] students = {
                new Student("Ralph", Program.BUSI, 14),
                new Student("Lisa", Program.COMP, 98),
                new Student("Martin", Program.COMP, 88),
                new Student("Millhouse", Program.COMP, 38),
                new Student("Bart", Program.PHYS, 52),
                new Student("Uter", Program.MATH, 72),
                new Student("Uter", Program.MATH, 72),
        };

        DataSlicerizer slicer = new DataSlicerizer(students);

        // ⁡⁣⁢⁢Part A⁡ : 

        // slicer.oopSliceAndDice();

        //  slicer.functionalSliceAndDice();

        //⁡⁣⁢⁢ Part B:
        

        //Let's build our own filter

        //slicer.filterOnCompStudents();

        //slicer.ourOwnHomegrownForEach();

        //  ⁡⁣⁢⁢Part C⁡ :
        slicer.printOutStudentsWithoutDuplicates();

        // ⁡⁣⁢⁢Part D⁡ :
        slicer.printOutSortedListByGpa();

        // ⁡⁣⁢⁢Part E⁡ :

        System.out.println("\nReturning a List that has been slicerized!");

        // List<Student> sortedStudents = slicer.getSortedListOfStudentsInComp();
        // for (Student student : sortedStudents)
        // {
        //     System.out.println(student.getName());
        // }

        // ⁡⁣⁢⁢Part F⁡ : 

        // slicer.usingMap();

    }
}
