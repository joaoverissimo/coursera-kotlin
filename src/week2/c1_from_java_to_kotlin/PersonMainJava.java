package week2.c1_from_java_to_kotlin;

public class PersonMainJava {

    public static void main(String... args) {
        PersonJava personJava = new PersonJava("verissimo", 10);
        System.out.println(personJava);

        PersonKotlin personKotlin = new PersonKotlin("verissimo", 10);
        System.out.println(personKotlin);
    }

}
