import java.time.LocalDate;

public class Aluno {

    //Atributos ou propriedades
    private String nome;
    private int matricula;
    private String cpf;
    private String endereco;
    private String telefone;
    private LocalDate nascimento;

    public Aluno(){}

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, String cpf,
                 String endereco, String telefone,
                 LocalDate nascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
