package aula03;

public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    
    public void visualizarCliente(){
        System.out.println("Cliente: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }
    
    public Cliente(String nome, String sobrenome, String cpf){
        this.nome = "Fabio";
        this.sobrenome = "Kawasaki";
        this.cpf = "111.111.111-11";
    }
}