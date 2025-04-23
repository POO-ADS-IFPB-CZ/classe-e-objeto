package view;

import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1, "João");
        ContaCorrente conta2 = new ContaCorrente(2, "Maria");

        conta1.depositar(1000);
        conta1.depositar(1000000);
        conta2.depositar(500);
        conta1.transferir(conta2, 200);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

    }
}