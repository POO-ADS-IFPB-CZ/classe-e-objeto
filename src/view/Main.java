package view;

import model.ContaCorrente;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate nascimento = LocalDate.of(2000,05,
                1);

        System.out.println(
                Period.between(nascimento, LocalDate.now())
                        .getYears());


    }
}