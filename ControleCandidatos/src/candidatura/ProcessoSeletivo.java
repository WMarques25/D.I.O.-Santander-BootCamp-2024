package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativas++;
            } else {
                System.out.println("Contato Realizado");
            }
        } while(continuarTentando && tentativas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato);
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        // Array com a lista de candidatos
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Candidatos selecionados");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato: " + candidatos[i]);
        }
    }
    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela", "Jorge"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" O candidato " + candidato + " pretende ganhar " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatoSelecionado++;
            } 
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato");
        } else if(salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
