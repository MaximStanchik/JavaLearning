package springIntro;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person () {
        System.out.println("Person bean is created");
    };

    public String getSurname() {
        return surname;
    };

    public void setSurname(String surname) {
        this.surname = surname;
    };

    public int getAge() {
        return age;
    };

    public void setAge(int age) {
        this.age = age;
    };

    public void setPet (Pet pet) {
        System.out.println("Class person: set set");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
