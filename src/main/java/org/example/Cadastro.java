package org.example;

public interface Cadastro<T> {



    abstract void print();
    abstract void cadastrarItem();

    abstract T selecionaItem();
}
