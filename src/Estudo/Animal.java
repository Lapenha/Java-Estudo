package Estudo;

public class Animal {
    public void makeNoise(){
        System.out.println("Generic animal noise");
    }
    public void makeNoise(Integer repetitions){
        while(repetitions>0){
            System.out.println("generic animal noise countdown "+repetitions);
            repetitions--;
        }

    }
}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Dog noise");
    }
}
class AnimalActivity{
    public static void eat(Animal animal){
        System.out.println("eat");
    }
    public static void eat(Dog dog){
        System.out.println("dog eating");
    }

}
class testeAnimais{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        animal.makeNoise(3);

        Animal dogAnimal = new Dog();
        dogAnimal.makeNoise();
        Dog dog = new Dog();

        AnimalActivity.eat(dogAnimal);
        AnimalActivity.eat(dogAnimal);
        AnimalActivity.eat(dog);
    }
}

