package CursoDadosJava;

import java.util.Scanner;

class PrimeiroExemploTAD {
    public PrimeiroExemploTAD() {
        this.valor = 0;
    }

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor < 0){
            this.valor = 0;
            System.out.println("Valor menor que 0 -> corrigido para 0");
        } else if(valor > 40 && valor < 60){
            if(valor < 50){
                this.valor = 40;
                System.out.println("Valor no intervalo não suportado -> corrigido para 40");
            } else {
                this.valor = 60;
                System.out.println("Valor no intervalo não suportado -> corrigido para 60");
            }
        } else if (valor > 100) {
            this.valor = 100;
            System.out.println("Valor maior que 100 -> corrigido para 100");
        } else {
            this.valor = valor;
        }
    }
}

class TesteTADExemplo {
    public static void main(String[] args) {
        PrimeiroExemploTAD t = new PrimeiroExemploTAD();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        float v = sc.nextFloat();
        t.setValor(v);

        System.out.println("Valor final armazenado: " + t.getValor());
    }
}
