package com.db.db1start.SimuladorContaCorrente;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Teste Conta Bancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");
        ContaBancaria2 contaSimples2 = new ContaBancaria2();
        contaSimples2.setNomeCliente("Cliente Conta Simples2");
        contaSimples2.setNumConta("22222");


        contaSimples.depositar(100);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples,70);

        System.out.println(contaSimples);
    }
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saque insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }

    private static void realizarTransferencia(ContaBancaria2 conta, double valor){

        }

    }
}
