import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Aluno joao = new Aluno("João", 123,
                "111.111.111-01", "Rua X, 300",
                "088999999999",
                LocalDate.of(2000,3,25));
        Aluno maria = new Aluno();
        Aluno jose = new Aluno("José", 654);


    }
}