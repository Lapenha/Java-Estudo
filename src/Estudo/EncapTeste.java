package Estudo;

public class EncapTeste {
    public static void main(String[] args) {
        Encapsulamento encap= new Encapsulamento();

        encap.setNome( "Maria" );
        encap.setIdNum( 1 );
        encap.setAge( 18 );

        System.out.println(encap.getNome());
        System.out.println(encap.getIdNum());
        System.out.println(encap.getAge());

    }

}
