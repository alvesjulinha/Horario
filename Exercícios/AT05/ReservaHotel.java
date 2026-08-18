public class ReservaHotel {
   private String nome;
   private int nQuarto;
   private int nDiarias;
   private double valorDiaria;


   //construtor
   public ReservaHotel(String nome, int nQuarto, int nDiarias, double valorDiaria) {
       this.nome = nome;
       this.nQuarto = nQuarto;
       this.nDiarias = nDiarias;
       this.valorDiaria = valorDiaria;
   }

   //Métodos getters
   public String getNome() {
       return nome;
   }
   public int getnQuarto() {
       return nQuarto;
   }
   public int getnDiarias() {
       return nDiarias;
   }
   public double getValorDiaria() {
       return valorDiaria;
   }

   //Métodos setters
   public void setNome(String nome) {
       if (nome != "") {
           this.nome = nome;
       } else {
           System.out.println("O nome do hóspede deve ser informado");
       }
   }
   public void setnQuarto(int nQuarto) {
       if (nQuarto > 0) {
           this.nQuarto = nQuarto;
       } else {
           System.out.println("O número do quarto deve ser positivo");
       }
   }
   public void setnDiarias(int nDiarias) {
       if (nDiarias > 0) {
           this.nDiarias = nDiarias;
       } else {
           System.out.println("A quantidade de diárias deve ser maior que zero");
       }
   }
   public void setValorDiaria(double valorDiaria) {
       if (valorDiaria > 0) {
           this.valorDiaria = valorDiaria;
       } else {
           System.out.println("O valor da diária deve ser maior que zero");
       }
   }
   public double calcularHospedagem() {
       return nDiarias * valorDiaria;
   }
   public double calcularHospedagem(double percentualDesconto) {
       if (percentualDesconto >= 0 && percentualDesconto <= 100) {
           double valor = calcularHospedagem();
           double desconto = valor * percentualDesconto / 100;
           return valor - desconto;
       } else {
           System.out.println("Desconto inválido");
           return calcularHospedagem();
       }
   }


   public double calcularHospedagem(double percentualDesconto, double taxaServico) {
       if (percentualDesconto >= 0 && percentualDesconto <= 100 && taxaServico >= 0) {
           double valorCDesconto = calcularHospedagem(percentualDesconto);
           return valorCDesconto + taxaServico;
       } else {
           System.out.println("Odesconto ou a taxa de serviço são inválidos");
       }
       return calcularHospedagem();
   }
   @Override
   public String toString(){
       return "Hóspede: " + nome +
               "\nNúmero do quarto: " + nQuarto +
               "\nNúmero de diárias: " + nDiarias +
               "\nValor da diária: " + valorDiaria;
   }
}


