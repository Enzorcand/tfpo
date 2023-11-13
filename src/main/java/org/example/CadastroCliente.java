package org.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroCliente implements Cadastro<Cliente> {
    private HashMap<Integer, Cliente> clientes;

    @Override
    public void print() {
        for (Integer k: clientes.keySet()) {
            Cliente c = clientes.get(k);
            System.out.println(c.toString());
        }
    }

    @Override
    public void cadastrarItem() {
        Scanner scan = new Scanner(System.in);
        int matricula = scan.nextInt(); //Pesquisar como receber dados de uma interface;
        if(clientes.get(matricula) != null){
            throw new InputMismatchException("Cliente ja cadastrado");
        }
        String nome = scan.next();
        int telefone = scan.nextInt();

        Cliente cliente = new Cliente(matricula, nome, telefone);
        clientes.put(matricula, cliente);
    }

    @Override
    public Cliente selecionaItem() {
        return null;
    }
}
