import java.util.*;

class App {

    public static void main(String[] args) {

	System.out.println("Hello");
	System.out.println("Commit1");
	System.out.println("Commit2");

	Person person = new Person("Furkan");
	System.out.println(person.getName());
	System.out.println("deneme");
    }
}


class Person {

    private String name;

    public Person(String name) {

	this.name = name;
    }

    public String getName() {

	return this.name;
    }
}
