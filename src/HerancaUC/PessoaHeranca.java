package HerancaUC;

public class PessoaHeranca {
    final private String nome;
    final private int idade;

    public PessoaHeranca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {return nome;}
    public int getIdade(){return idade;}
    public void exibirInfo(){
        System.out.printf("Nome: %s\nIdade: %d\n",getNome(),getIdade());
    }
}
class Professor extends PessoaHeranca{
    final private int matricula;
    public Professor(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public int getMatricula() {return matricula;}

    public void lecionar(){
    }
    @Override
    public void exibirInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nMatricula: %d\n",getNome(),getIdade(), getMatricula());
    }

}
class ProfessorNormal extends Professor{
    public ProfessorNormal(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }
    @Override
    public void lecionar() {
        System.out.println("Lecionando");
    }
}
class ProfessorPesquisador extends Professor{
    public ProfessorPesquisador(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }
    @Override
    public void lecionar() {
        System.out.println("Pesquisando");
    }

}
class Aluno extends PessoaHeranca{
    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    }
    public int getRa(){return ra;}

    public void acaoAluno(){
        System.out.println("Estudando");
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome: "+getNome() +", Idade: "+getIdade() +", Ra: "+getRa());
    }

}
class AlunoDeGraduacao extends Aluno {
    public AlunoDeGraduacao(String nome, int idade,int ra) {
        super(nome, idade, ra);
    }
    @Override
    public void acaoAluno(){
        System.out.println("Estudando graduacao");
    }
}
class testeEscola {
    public static void main(String[] args) {
        ProfessorPesquisador pPesquisador = new ProfessorPesquisador("Pedro", 20, 3);
        Aluno aluno = new Aluno("joao", 20, 3);
        AlunoDeGraduacao alunoGraduacao = new AlunoDeGraduacao("julia", 20, 3);
        ProfessorNormal pNormal = new ProfessorNormal("sla", 20, 3);

        pPesquisador.lecionar();
        pNormal.lecionar();
        aluno.acaoAluno();
        alunoGraduacao.acaoAluno();
        pPesquisador.exibirInfo();
        alunoGraduacao.exibirInfo();


    }
}
