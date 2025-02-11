package forelesing11.models;

public class Persons {
    private String firstName;
    private String lastName;
    private int age;
    private final String birthNumber;

    //constructor
    public Persons(String firstName, String lastName, int age, String birthNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthNumber = birthNumber;
    }

    public Persons(String birthNumber){
        this.birthNumber = birthNumber;
    }


    // Getter for birthNumber
    public String getBirthNumber() {
        return birthNumber;
    }

    
    //getter for firstName
    public String getFirstName() {
        return firstName;
    }

    

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}