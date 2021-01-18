package practice.java;

public class NewPerson {

    String name;
    Integer age;

//    public NewPerson(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }

    public static void main(String args[]) {
        NewPerson person = new NewPerson();
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
    }

}
