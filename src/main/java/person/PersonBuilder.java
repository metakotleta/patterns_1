package person;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private Integer age;
    private String city;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException{
        if (this.age < 0 || this.age > 100) {
            throw new IllegalArgumentException("Трахаться смеяться");
        }
        if (this.firstName == null || this.lastName == null) {
            throw new IllegalStateException("Ебаться улыбаться");
        }

        Person person;
        if (this.age == null) {
            person = new Person(firstName, lastName);
        } else {
            person = new Person(firstName, lastName, age);
        }

        if (this.city != null) {
            person.setCity(this.city);
        }
        return person;
    }
}
