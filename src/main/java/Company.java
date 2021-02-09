import java.util.List;

public class Company {
    List<Person> staff;
    String name;

    public Company(String name) {
        this.name = name;
    }

    public List<Person> getStaff() {
        return staff;
    }

    public void setStaff(List<Person> staff) {
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
