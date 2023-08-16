import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroA = scan.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroB = scan.nextInt();

        try {

            contar(parametroA, parametroB);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O primeiro parâmetro deve ser menor que o segundo parâmetro.");
        }
    }

    static void contar(int parametroA, int parametroB) throws ParametrosInvalidosException {
        if (parametroA > parametroB) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroB - parametroA;
        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número: %d%n", i + 1);
        }
    }
}
