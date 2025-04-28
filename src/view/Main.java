package view;

import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1, "João");
        ContaCorrente conta2 = new ContaCorrente(2, "João");
        ContaCorrente conta3 = new ContaCorrente(3, "João");

        System.out.println(ContaCorrente.getContContas());

    }
}