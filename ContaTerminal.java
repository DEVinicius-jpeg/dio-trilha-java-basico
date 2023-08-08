package dio.curso.fundamentos.projeto;
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public String solicitarAgencia(){
        scanner.reset();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        return agencia;
    }

    public int solicitarNumeroConta(){
        scanner.reset();
        System.out.println("Agora digite o número da Conta!");
        int numero = scanner.nextInt();
        return numero;
    }

    public String solicitarNomeCliente(){
        scanner.reset();
        System.out.println("Insira seu nome completo:");
        String nome = scanner.next();
        return nome;
    }

    public double solicitarDeposito(){
        scanner.reset();
        System.out.println("Informe o valor para depósito:");
        System.out.println("Obs: Utilize ',' para separar a parte inteira da francionária.");
        double saldo = scanner.nextDouble();
        return saldo;
    }

    public void exibirInfConta(String nomeCliente, String agencia, int numero, double saldo){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f " +
                "já está disponível para saque!!!", nomeCliente, agencia, numero, saldo);
    }

}
