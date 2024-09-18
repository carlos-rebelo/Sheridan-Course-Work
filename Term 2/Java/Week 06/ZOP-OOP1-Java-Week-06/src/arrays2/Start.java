package arrays2;

public class Start {
    public static void main(String[] args)
    {
        //Building an array of objects...spoiler alert:  You already built one when you made an array of Strings!  It is no different!

        //Let's walk through this with the debugger

        Student s1 = new Student("Bart", 234, 2.45);
        System.out.println(s1);
        System.out.println(s1.getName());

        int[] myInts = new int[5];
        System.out.println(myInts);
        System.out.println(myInts[2]);

        // notice that, when we create an empty array of ints, every floor has a 0 in it.

        // we can create an array that is already full...
        int[] myInts2 = { 4, 5, 43, 7, 53, 3 };
        System.out.println(myInts2[2]);

        // OK, now with objects...keep in mind - it's the same thing!!!!

        Student[] students = new Student[5];

        System.out.println(students); //what is this?
        System.out.println(students[0]); //why
        //System.out.println(students[0].getName()); //what would this have done?

        // Remember that our array is just an object (warehouse) that has room to store the ADDRESS of 5 Student objects.  However, our array is currently empty...every floor is null because we haven't added any Students.

        // we can add Students
        students[0] = new Student("Bart", 1245, 2.0);
        students[1] = new Student("Lisa", 4525, 4.0);
        students[2] = new Student("Ralph", 13, 1.0);
        students[3] = new Student("Millhouse", 1246, 1.8);

        // Also, we can create Student array that is already full of Student object addresses!

        Student[] students2 = {
                new Student("Bart", 1424, 2.0),
                new Student("Lisa", 4525, 4.0),
                new Student("Ralph", 13, 1.0),
                new Student("Millhouse", 1246, 1.8) };

        // let's print out all of our student's names
        for (Student student: students) {
            System.out.println(student.getName());
        }
    }

}
