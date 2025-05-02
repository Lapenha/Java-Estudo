package Estudo;

public class MethodChaining {
    private String name;
    private int age;

    public MethodChaining setName(String name) {
        this.name = name;
        return this;
    }
    public MethodChaining setAge(int age) {
        this.age = age;
        return this;
    }

    public void printPerson(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}
