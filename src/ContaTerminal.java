import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numeroDaAgencia;
        int numeroDaConta;
        String nomeDoCliente;
        BigDecimal saldo;


        System.out.println("Por favor, digite o número da agência: ");
        numeroDaAgencia = sc.next();

        System.out.println("Por favor, digite o número da conta: ");
        numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        nomeDoCliente = sc.next();


        System.out.println("Por favor, digite seu saldo: ");
        saldo = sc.nextBigDecimal();
        System.out.println("Olá, " + nomeDoCliente + "! Obrigado por criar uma conta em nosso banco. Sua " +
                "agência é " + numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está " +
                "disponível para saque.");

        sc.close();

    }
}
