package Exs;

public class ArrayExemplo {
    public static void main(String[] args) {
        //criando array de inteiros 
        int[] numeros = new int[5];


        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println("ARRAY");
        System.out.println("Primeiro numero: "+ numeros[0]);

        System.out.println("Tamanho do Array: " + numeros.length);
        //for basico
        System.out.println("Elementos com for");
        for(int i = 0; i<numeros.length;i++){
            System.out.println("Indice: "+ i + "-> "+ numeros[i] +"\n");
        }
        //for each
        for(int num : numeros){
            System.out.println(num);
        }

        //criando e inicialisando diretamente
    String[] nomes = {"Ana", "Marcela", "Julia"};

    System.out.println("Nomes:");
    for(String nome : nomes) {
        System.out.println(nome);
    }


    //array multidimensional
    int[][] matrix = {
        {1, 2},
        {3, 4}
    };
        System.out.println("Matriz:");

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Posicao ["+i+"]["+j+"] = " + matrix[i][j]);
                //

            }
        }
    }
}
