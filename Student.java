
public class Student {
    String name = "";
    int id; 
    int grade; 


    // Constructor with all atributes being overloaded
    Student(String inputName, int id, int grade) {
        this.name = inputName;
        this.id = id; 
        this.grade = grade; 
    }
    public String toString() // returns attributes of the objects and concatinates to a string 
    {
        return "Name: " + this.name + ", ID: " + this.id + ", Grade: " + this.grade;
    }
    public boolean equals(Student y) // returns true or false based on the equality of the id attribute
    {
        if (this.id == y.id) 
        {
            return true; 
        }
        return false; 
    }
}