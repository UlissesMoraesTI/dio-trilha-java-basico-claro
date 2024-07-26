import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente = " ";
        String agencia = " ";
        int conta = 0;
        double saldo = 0;

        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.println("Por favor, informe seu Nome !");
        nomeCliente = leitorDeEntradas.next();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = leitorDeEntradas.next();

        do {
            System.out.println("Por favor, digite o número da Conta !");
            conta = leitorDeEntradas.nextInt();

        } while (conta == 0);

        System.out.println("Por favor, digite o valor do Saldo !");
        saldo = leitorDeEntradas.nextFloat();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + conta + " e seu saldo " + String.format("%.2f", saldo)
                        + " já está disponível para saque");
    }
}
