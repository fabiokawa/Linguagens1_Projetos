package aula03;

public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    
    void visualizarCliente(){
        System.out.println("Cliente: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }
}