import person.*;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setFirstName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setFirstName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        son.happyBirthday();
        System.out.println(son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}