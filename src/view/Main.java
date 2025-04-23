package view;

import model.Endereco;
import model.Escola;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("10.783.898/0005-07",
            "IFPB Cajazeiras",
                new Endereco("José Antônio da Silva",
                    300, "58900-000"));

        System.out.println(escola.getEndereco().getRua().toUpperCase());

    }
}