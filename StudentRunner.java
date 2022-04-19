
public class StudentRunner
 {
    public static void main(String args[]) 
    {
        String lining = new String("The duplicity of the ID's of the two studetns is: "); // string object for later use
        Student s = new Student("TestName", 123, 11);
        Student t = new Student("Testname", 124, 11);
        Student r = new Student("New Name", 125, 12);

        // note: I created the lining variable to show how the compiler is calling different toString methods in this program
        System.out.println(s.toString()); // method call to print the attributes of student s 
        System.out.println(lining.toString() + s.equals(t)); // method call to print if the id number of student s and student t were equal 
        System.out.println(lining.toString() + s.equals(r)); // method call to pritn if the id number of student s and student r were equal 
        System.out.println(lining.toString() + r.equals(r)); // duplicates
    }
}