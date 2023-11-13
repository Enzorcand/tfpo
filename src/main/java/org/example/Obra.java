package org.example;

import lombok.Data;

import java.io.PrintStream;

@Data
public abstract class Obra {
    protected String isbn;
    protected String nome;
    protected String editora;
    protected int anoPubli;
    protected int copias;

    protected int disponiveis;

    public Obra(String isbn, String nome, String editora, int anoPubli){
        this.isbn = isbn;
        this.nome = nome;
        this.editora = editora;
        this.anoPubli = anoPubli;
        copias = 0;
    }


    //retira obra do sistema reduzindo em 1 as obras disponiveis. Caso não tenha obras disponiveis dispara uma exceção.
    // apos efetuar a transação, cadastra o relato da transação no arquivo de texto de relatório. Tambem define
    // o prazo de devolução da obra
    public void retiraObra(){
        PrintStream file = new PrintStream("src/main/java/org/example/transacoes.txt");
    }


    // Verifica o atraso da obra, e se a obra estava realmente retirada. Caso não esteja dispara uma exceção.
    // Após conferencia, calcula quantos dias atrasou, registrando estes dados no arquivo de relatórip.
    public void devolveObra(){
        PrintStream file = new PrintStream("src/main/java/org/example/transacoes.txt");
    }
}
