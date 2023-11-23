package org.example.cadastro;

import org.example.Obra;
import org.example.cadastro.Cadastro;

import java.util.HashMap;
import java.util.InputMismatchException;

public class CadastroObra implements Cadastro<Obra> {
    private HashMap<String, Obra> obras;

    @Override
    public void print() {

    }

    @Override
    public void cadastrarItem() {

    }

    @Override
    public Obra selecionaItem() {
        return null;
    }

    public void adObra(String isbn, int quantidade){
        if(obras.get(isbn) != null){
            Obra obra = obras.get(isbn);
            obra.setCopias(obra.getCopias() + quantidade);
        } else {
            cadastrarItem();
            adObra(isbn,quantidade);
        }
    }

    public void removeObra(String isbn, int quantidade){
        if(obras.get(isbn) != null){
            Obra obra = obras.get(isbn);
            if(quantidade > obra.getCopias()){
                throw new InputMismatchException("Numero de copias invalido");
            }

            obra.setCopias(obra.getCopias() + quantidade);
        } else {
             throw new InputMismatchException("Obra não cadastrada");
        }
    }
}
