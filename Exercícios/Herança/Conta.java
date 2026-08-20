package Heranca1;

public class Conta {
   private String titular;
   private int nConta;
   private double saldo;

   public Conta(String titular, int nConta, double saldo) {
       this.titular = titular;
       this.nConta = nConta;
       this.saldo = saldo;
   }

   public String getTitular() {
       return titular;
   }

   public void setTitular(String titular) {
       this.titular = titular;
   }

   public int getnConta() {
       return nConta;
   }

   public void setnConta(int nConta) {
       this.nConta = nConta;
   }

   public double getSaldo() {
       return saldo;
   }

   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }

   public void depositar(double valor){
       if (valor > 0){
           saldo += valor;
           System.out.println("Depósito realizado com sucesso");
       } else {
           System.out.println("O valor a ser depositado deve ser maior que zero");
       }
   }

   public void sacar(double valor){
       if (valor > 0 && valor <= saldo){
           saldo -= valor;
           System.out.println("Saque realizado com sucesso");
       } else{
           System.out.println("Valor inválido ou saldo insuficiente");
       }
   }

   public void mostrarDados(){
       System.out.printf("Titular: " + titular);
       System.out.printf("Número da conta: " + nConta);
       System.out.printf("Saldo: R$ %.2f%n" + saldo);
   }
}
