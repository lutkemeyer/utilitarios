import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        do {

            println("======================== MENU =========================");
            println("= 1 - Gerar Hash do fornecedor ");
            println("= 0 - Sair ");
            println("=======================================================");
            println("Digite: ");

            opcao = lerInt();

            switch (opcao) {
                case 1:
                    new HashFornecedorFacade().executar();
                    break;
            }

            println("======================================");
            println("Deseja voltar para o menu?");
            println("1 - Sim");
            println("0 - Não");
            println("======================================");
            print("Digite: ");

            opcao = lerInt();

        } while (opcao != 0);

    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static int lerInt() {
        int i = SCANNER.nextInt();
        SCANNER.nextLine();
        return i;
    }

    public static String lerString() {
        return SCANNER.nextLine();
    }

}
