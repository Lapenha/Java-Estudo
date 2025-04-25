public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        }
        else {
            System.out.println("Valor insuficiente!");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Valor insuficiente!");
        }
    }
    public void consulta() {
        System.out.println("Nome: " + nomeTitular + "\nSaldo atual: " + saldo);
    }
}