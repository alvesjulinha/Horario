public class Principal {
   public static void main(String[] args){
       ReservaHotel r1 = new ReservaHotel("Danny " ,217 , 7 , 55.90);
       ReservaHotel r2 = new ReservaHotel("Vitória ",222 , 5 , 55.90);

       System.out.println(r1);
       System.out.println("---------------------------------");
       System.out.println(r2);
       System.out.println("---------------------------------");

       double valorN = r1.calcularHospedagem();
       double valorComDesconto = r2.calcularHospedagem(15);
       double valorCTaxa = r2.calcularHospedagem(15, 40);
       System.out.printf("Valor normal da primeira reserva: R$ %.2f%n", valorN);
       System.out.printf("Valor normal da segunda reserva com desconto: R$ %.2f%n", valorComDesconto);
       System.out.printf("Valor normal da segunda reserva com desconto e taxa de serviço: R$ %.2f%n", valorN);

   }
}

