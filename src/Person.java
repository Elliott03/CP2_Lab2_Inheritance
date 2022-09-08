import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
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

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public String formalName() {
        return this.title + " " + fullName();
    }

    public String getAge() {
        int currentYear = LocalDate.now().getYear();
        return String.valueOf(currentYear - YOB);
    }
    public String getAge(int year) {
        return String.valueOf(year - YOB);
    }

    public String toCSVDataRecord() {
        return this.ID + "," + this.firstName + "," + this.lastName + "," + this.title + "," + this.YOB;
    }
}
