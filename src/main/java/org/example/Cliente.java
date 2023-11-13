package org.example;

import lombok.Data;

@Data
public class Cliente {
    private int matricula;
    private int telefone;
    private String nome;

    private Reserva[] reservas;

    public Cliente(int matricula, String nome, int telefone){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        reservas = new Reserva[3];
    }

    public void efetuaReserva(Obra obra){

    }
}
