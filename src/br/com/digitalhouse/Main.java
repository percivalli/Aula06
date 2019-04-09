package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pipe", "20", "Vira-Lata");

        System.out.println("Esse cachorro é mamífero? " + cachorro.ehMamifero());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Tamanho: " + cachorro.getTamanho());


    }
}
