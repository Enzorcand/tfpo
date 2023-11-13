package org.example;

import lombok.Data;

@Data
public class Reserva {
    private Livro livro;
    private int[] dataRetirada;
    private int[] dataDevolucao;

    public Reserva(){

    }
}
