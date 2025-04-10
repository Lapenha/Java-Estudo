import java.util.Scanner;

public class EstudoScanner {
    public static void main(String[] args) {
        String[] nomes = new String[1];
        int[] idades = new int[1];

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();


        nomes[0] = nome;
        idades[0] = idade;

        scanner.close();

        for(int i = 0; i < nomes.length; i++){
            for(int j = 0; j < nomes.length; j++){
                System.out.println("Usuario: " + nomes[i]);
                System.out.println("Idade: " + idades[j] + "\n");
                

            }
            
        }
    }
    
}
