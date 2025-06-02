package Exs;

import java.util.function.Consumer;

public class LambdaBasica {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
    }
}
