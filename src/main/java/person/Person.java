package person;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String city;

    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private boolean hasAge() {
        return age != null;
    }

    private boolean hasCity() {
        return !city.isEmpty();
    }

    public void happyBirthday() {
        if (hasAge()) {
            age = ++age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pBuilder = new PersonBuilder();
        pBuilder.setLastName(this.lastName);
        pBuilder.setAge(0);
        pBuilder.setCity(this.city);
        return pBuilder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
