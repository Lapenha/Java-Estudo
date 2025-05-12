package Estudo;

public class InstanceBlockExample {
    {
        System.out.println("InstanceBlockExample 2");
    }
    {
        System.out.println("InstanceBlockExample 2");
    }
    static {
        System.out.println("StaticBlockExample 2");
    }
    
    public InstanceBlockExample(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        InstanceBlockExample obj = new InstanceBlockExample();
        System.out.println("main");
    }
}
