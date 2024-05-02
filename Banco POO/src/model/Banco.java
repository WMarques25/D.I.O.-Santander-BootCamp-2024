package model;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    static private List<Conta> contas = new ArrayList<Conta>();

    static void addConta(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void listarContas(){
        System.out.println("*--* Listando Contas no Banco *--*\n");
        contas.forEach(System.out::println);
    }
}
