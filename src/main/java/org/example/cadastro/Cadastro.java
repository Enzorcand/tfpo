package org.example.cadastro;

public interface Cadastro<T> {

    abstract void print();
    abstract void cadastrarItem();

    abstract T selecionaItem();
}
