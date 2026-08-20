package Heranca1;

public class ContaPJ extends Conta{
   private String cnpj;

   public ContaPJ(String titular, int nConta, double saldo, String cnpj) {
       super(titular, nConta, saldo);
       this.cnpj = cnpj;
   }

   public String getCnpj() {
       return cnpj;
   }

   public void setCnpj(String cnpj) {
       this.cnpj = cnpj;
   }

   @Override
   public void mostrarDados() {
       super.mostrarDados();
       System.out.println("CNPJ: " + cnpj);
   }
}


