package Estudo;

public class EncapPerson {
    private String name;
    private int age;
    private int id;

    public String getName() {return name;}
    public int getId(){return id;}
    public int getAge(){return age;}

    public void setAge(int newAge){this.age = newAge;}
    public void setName(String newName){this.name = newName;}
    public void setId(int newId){this.id = newId;}


    public String exibirDados(){
        return "Id: "+ getId() + " Nome: "+ getName() + " Idade: " + getAge();
    }
}
