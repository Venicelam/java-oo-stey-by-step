package practice01;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
public String getName(){
        return name;
}
public int getAge(){
        return age;
}
public String introduce(){
      return "My name is " + name + ". I am " + age +" years old.";
}
    }

