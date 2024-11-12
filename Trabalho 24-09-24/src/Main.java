import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Carro carro = new Carro("Toyota","Corolla",2020, 4);
        Moto moto = new Moto("BMW","G310 GS",2023, 1200);
        Caminhao caminhao = new Caminhao("Mercedes","710", 2022, 3);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seja bem vindo a Localiza, vamos iniciar o seu antendimento");
            System.out.println("Escolha a ação desejada:");
            System.out.println("1 - Alugar moto");
            System.out.println("2 - Devolver moto");
            System.out.println("3 - Alugar Caminhão");
            System.out.println("4 - Devolver Caminhão");
            System.out.println("5 - Alugar Carro");
            System.out.println("6 - Devolver Carro");
            System.out.println("7 - Calcular Valor Al7uguel");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    moto.alugar();
                    break;
                case 2:
                    moto.devolver();
                    break;
                case 3:
                    caminhao.alugar();
                    break;
                case 4:
                    caminhao.devolver();
                    break;
                case 5:
                    carro.alugar();
                    break;
                case 6:
                    carro.devolver();
                    break;
                case 7:
                    System.out.println("Digite o número de dias:");
                    int dias = scanner.nextInt();
                    System.out.println("Valor do aluguel do Carro: R$ " + carro.calcularValorAluguel(dias));
                    System.out.println("Valor do aluguel da Moto: R$ " + moto.calcularValorAluguel(dias));
                    System.out.println("Valor do aluguel do Caminhão: R$ " + caminhao.calcularValorAluguel(dias));
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}


