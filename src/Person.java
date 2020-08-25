import java.util.Date;

public class Person {
    private int height;         //inches
    private boolean gender;     //female true
    private String firstName;
    private String lastName;
    private Date dob;
    private int weight;     //lbs

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isGender(boolean b) {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(int height, boolean gender, String firstName, String lastName, Date dob, int weight) {
        this.height = height;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.weight = weight;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", gender=" + gender +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", weight=" + weight +
                '}';

    }
}
