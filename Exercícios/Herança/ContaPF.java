package Heranca1;

public class ContaPF extends Conta {
 private String cpf;

 public ContaPF(String titular, int nConta, double saldo, String cpf) {
   super(titular, nConta, saldo);
   this.cpf = cpf;
 }

 public String getCpf() {
   return cpf;
 }

 public void setCpf(String cpf) {
   this.cpf = cpf;
 }

 @Override
 public void mostrarDados() {
   super.mostrarDados();
   System.out.println("CPF: " + cpf);
 }
}
