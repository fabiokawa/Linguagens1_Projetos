package aula03;

public class Conta {
    int numero;
    double saldo;
    Cliente titular;
    
    void visualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    
    void depositar(double valor){
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }
    
    boolean sacar(double value){
        if (this.saldo < value) {
           return false;
        } else {
           this.saldo = this.saldo - value;
           return true;
        }
    }
    
    void transferirPara(double valor, Conta c){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            c.saldo = c.saldo + valor;
            System.out.println("Transferencia realizada com sucesso"); 
        } else {
            System.out.println("Nao foi possivel");   
            }
        }
    }
