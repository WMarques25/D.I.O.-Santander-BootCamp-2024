import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        var curso1 = new Curso("Java", 
            "Descricao java", 8);

        var curso2 = new Curso("JavaScript", 
            "Descricao JavaScript", 4);

        var mentoria = new Mentoria("Mentoria Java", "Descricao mentoria java", 
            LocalDate.now());
        
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp(
            "Bootcamp Java Developer", "Descricao bootcamp java"
        );

        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        var dev = new Dev("well");

        dev.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos Well: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("\nConteudos Concluidos Well: " + dev.getConteudosConcluidos());
        System.out.println("\nXP Total: " + dev.calcularTotalXp());

        var dev2 = new Dev("marques");

        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\nConteudos Inscritos Marques: " + dev2.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos Marques: " + dev2.getConteudosConcluidos());
        System.out.println("\nXP Total: " + dev2.calcularTotalXp());



        
    }
}
