package immutable;

public class Start {
    public static void main(String[] args)
    {

        Student student = new Student.StudentBuilder("Bart", "Simpson", 111).program("COMPSCI").build();

        System.out.println(student);
    }
}
