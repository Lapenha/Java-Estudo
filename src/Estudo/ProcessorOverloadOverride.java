package Estudo;

import java.util.Arrays;

public class ProcessorOverloadOverride {
    public void process(int i, int j){
        System.out.println("Processing two integers: " + i + " and " + j); //overloading
    }
    public void process(int[] ints){
        System.out.println("Adding integer array:" + Arrays.toString(ints)); //overloading
    }
    public void process(Object[] objs){
        System.out.println("Adding integer array:" + Arrays.toString(objs)); //overloading
    }

}
class MathProcessor extends ProcessorOverloadOverride {
    @Override
    public void process(int i, int j) {
        System.out.println("Sum of integer is " + (i + j));
    }

    @Override
    public void process(int[] ints) {
        int sum = 0;
        for(int i: ints){
            sum += i;
        }
        System.out.println("Sum of integers is " + sum);
    }
}
