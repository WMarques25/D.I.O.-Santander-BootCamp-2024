import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int parametro1 = terminal.nextInt();

        System.out.print("Digite o número final: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            terminal.close();
            System.out.println("Fim do programa.");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }

        int contagem = parametro2 - parametro1;
        for (int i = 0; i <= contagem; i++) {
            System.out.print(parametro1 + i + ", ");
        }
    }
}
