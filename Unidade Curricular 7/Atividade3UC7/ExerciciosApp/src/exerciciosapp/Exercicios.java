package exerciciosapp;

abstract class Exercicios {
    protected String nome;
    
    public Exercicios(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
