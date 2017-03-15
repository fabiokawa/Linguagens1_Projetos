package aula03;

public class Aula03 {

    public static void main(String[] args) {
        Conta c1 = new Conta(12345, 1000, "Fabio", "Kawasaki", "111.111.111-11");   
        //c1.titular = new Cliente();
        //c1.titular.cpf = "111.111.111-11";
        //c1.titular.nome = "Douglas";
        //c1.titular.sobrenome = "Rezende";
        //c1.saldo = 1000;
        c1.titular.visualizarCliente();
        c1.visualizarSaldo();   
             
        /*Conta c2 = new Conta();  
        c2.titular = new Cliente();
        c2.titular.cpf = "222.222.222-22";
        c2.titular.nome = "Binho";
        c2.titular.sobrenome = "Kawa";
        c2.saldo = 6500;
        c2.titular.visualizarCliente();
        c2.visualizarSaldo();*/
        
        c1.transferirPara(1500, c2);
        c1.visualizarSaldo();
        c2.visualizarSaldo();
    }
    
}