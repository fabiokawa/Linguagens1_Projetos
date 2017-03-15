package aula03;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    
    public void visualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }
    
    public boolean sacar(double value){
        if (this.saldo < value) {
           return false;
        } else {
           this.saldo = this.saldo - value;
           return true;
        }
    }
    
    public void transferirPara(double valor, Conta c){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            c.saldo = c.saldo + valor;
            System.out.println("Transferencia realizada com sucesso"); 
        } else {
            System.out.println("Nao foi possivel");   
            }
        }
    
    public Conta(int numero, double saldo, Cliente titular, String nome, String sobrenome, String cpf){
        this.numero = 12345;
        this.saldo = 1000;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
}

