package model;

public class Escola {

    private String cnpj;
    private String nome;
    private Endereco endereco;

    public Escola(String cnpj, String nome, Endereco endereco){
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //TODO: Fazer os demais getters e setters

}
