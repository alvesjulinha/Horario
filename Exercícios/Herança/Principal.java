package Heranca1;

public class Principal {
   public static void main(String[] args) {
       ContaPF contapf = new ContaPF(
               "Cris",
               1001,
               1000,
               "12345678900"               
       );
       ContaPJ contapj = new ContaPJ(
               "Muriel",
               2002,
               5000,
               "12.123.123/0001-12"
       );
       System.out.println("Conta pessoa física: ");
       contapf.depositar(2500);
       contapf.sacar(900);
       System.out.println("----------------------");
       System.out.println("Conta pessoa jurídica: ");
       contapj.depositar(8000);
       contapj.sacar(3000);
       contapj.mostrarDados();
   }
}
