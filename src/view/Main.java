package view;

import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("João");
        ContaCorrente conta2 = new ContaCorrente("Maria");
        ContaCorrente conta3 = new ContaCorrente("Pedro");

        System.out.println(ContaCorrente.getContContas());

    }
}