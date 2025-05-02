package Estudo;

import java.util.ArrayList;

public class EncapPersonTeste {
    public static void main(String[] args) {
        var encap = new ArrayList<EncapPerson>();

        EncapPerson encap1 = new EncapPerson();
        encap1.setAge(20);
        encap1.setName("Joao");
        encap1.setId(1);

        EncapPerson encap2 = new EncapPerson();
        encap2.setAge(21);
        encap2.setName("Maria");
        encap2.setId(2);

        encap.add(encap1);
        encap.add(encap2);

        for(EncapPerson e : encap){
            System.out.println(e.exibirDados());
        }
    }
}
