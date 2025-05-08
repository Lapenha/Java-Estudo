package Estudo;

public enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize; //constructor
    }
    public void orderPizza(){
        switch (pizzaSize) {
            case SMALL:
                System.out.println("Pizza small");
                break;
            case MEDIUM:
                System.out.println("Pizza Medium");
                break;
            case LARGE:
                System.out.println("Pizza Large");
                break;
            case EXTRALARGE:
                System.out.println("Pizza Extralarge");
                break;

                default:
                    System.out.println("I dont know what to do");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Test test = new Test(Size.MEDIUM);
        test.orderPizza();
    }
}
