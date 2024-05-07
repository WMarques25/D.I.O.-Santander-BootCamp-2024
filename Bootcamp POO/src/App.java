import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        var curso1 = new Curso("Java", 
            "Descricao java", 8);

        var curso2 = new Curso("JavaScript", 
            "Descricao JavaScript", 4);

        var mentoria = new Mentoria("Mentoria Java", "Descricao mentoria java", 
            LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
