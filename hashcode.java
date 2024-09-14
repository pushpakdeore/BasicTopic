package Pushpak;

class Persona {
    String name;
    int age;

    Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class hashcode{
    public static void main(String[] args) {
        Persona person1 = new Persona("Alice", 25);
        Persona person2 = new Persona("Alice", 25);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
