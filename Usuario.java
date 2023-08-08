package dio.curso.fundamentos.projeto;

import dio.curso.fundamentos.projeto.ContaTerminal;

public class Usuario {
    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();

        String agenciaCliente = contaTerminal.solicitarAgencia();
        int numeroContaCliente = contaTerminal.solicitarNumeroConta();
        String nomeCliente = contaTerminal.solicitarNomeCliente();
        double saldoCliente = contaTerminal.solicitarDeposito();

        contaTerminal.exibirInfConta(nomeCliente,agenciaCliente,numeroContaCliente,saldoCliente);
    }
}
