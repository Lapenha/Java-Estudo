package TesteA1;

import javax.swing.*;

public class Nums {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 0; i<7; i++){
           int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

           if(num % 2 > 0){
               total += num;
           }
        }
        System.out.println(total);
    }
}

