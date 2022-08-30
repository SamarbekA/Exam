package Exam_2;


public abstract class People {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String city;

    private int[] timeTable;

    public abstract void work(String firstName);

    public abstract void ToRelax();

    public abstract void communications();

    public People(String id, String firstName, String lastName, int age, String email, String city, int[] timeTable) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
        this.timeTable = timeTable;
    }
    public String getId() {
        return id;
    }

    public String getFirstName() {

        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {

        return age;
    }

    public String getEmail() {

        return email;
    }

    public String getCity() {

        return city;
    }

    public abstract void timeTable(int n);
}