import java.util.*;

class App {

    public static void main(String[] args) {

	System.out.println("Hello");
	//Add commit 1
	//Add commit 2

	Person person = new Person("Furkan");
	System.out.println(person.getName());
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
