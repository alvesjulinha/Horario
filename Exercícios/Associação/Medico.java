public class Medico {
   private String nome;
   private String especialidade;
   private String crm;

   public Medico(String nome, String especialidade, String CRM) {
       this.nome = nome;
       this.especialidade = especialidade;
       this.crm = crm;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       if (!nome.equals("")){
           this.nome = nome;
       }else{
           System.out.println("O nome do médico deve ser informado");
       }
   }

   public String getEspecialidade() {
       return especialidade;
   }

   public void setEspecialidade(String especialidade) {
       if (!especialidade.equals("")){
           this.especialidade = especialidade;
       }else{
           System.out.println("A especialidade do médico deve ser informada");
       }
   }

   public String getCrm() {
       return crm;
   }

   public void setCRM(String CRM) {
       if (!crm.equals("")){
           this.crm = crm;
       }else{
           System.out.println("O CRM do médico deve ser informado");
       }
   }

   public void apresentarMedico(String nome, String especialidade, String crm){
       System.out.println("Nome: " + nome);
       System.out.println("\nEspecialidadee: " + especialidade);
       System.out.println("\nCRM: " + crm);
   }
