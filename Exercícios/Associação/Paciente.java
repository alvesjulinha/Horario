public class Paciente {
   private String nomePaciente;
   private int idade;
   private String cpf;

   //construtor
   public Paciente(String nomePaciente, int idade, String cpf) {
       this.nomePaciente = nomePaciente;
       this.idade = idade;
       this.cpf = cpf;
   }

   public String getNomePaciente() {
       return nomePaciente;
   }

   public String setNomePaciente(String nomePaciente) {
       if (!nomePaciente.equals("")) {
           this.nomePaciente = nomePaciente;
       } else {
           System.out.println("O nome do paciente deve ser informado");
       }

       public int getIdade() {
           return idade;
       }

       public void setIdade ( int idade){
           if (idade > 0) {
               this.idade = idade;
           } else {
               System.out.println("A idade do paciente deve ser maior que 0");
           }

           public String getCpf() {
               return cpf;
           }

           public void setCpf(String cpf){
               if (!cpf.equals("")) {
                   this.cpf = cpf;
               } else {
                   System.out.println("O CPF do paciente deve ser informado");
               }
           }
       }
       public void apresentarPaciente(String nomePaciente, int idade, String cpf){
           System.out.println("Nome: " + nomePaciente);
           System.out.println("\nIdade: " + idade);
           System.out.println("\nCPF: " + cpf);
       }

   }
   public void realizarConsulta(Medico medico){
       System.out.printf("O paciente" + nomePaciente + "tem uma consulta com o(a) Dr(a). " + nome);
   }

   public void apresentarPaciente() {
       System.out.printf("Nome: " + nomePaciente);
       System.out.printf("\nIdade: " + idade);
       System.out.printf("\nCPF: " + cpf);
   }
}
