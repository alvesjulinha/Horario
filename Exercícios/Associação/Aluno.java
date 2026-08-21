package Associacao;

public class Aluno {
   private String nome;
   private String matricula;

   private Curso curso;

   public Aluno(String nome, String matricula) {
       this.matricula = matricula;
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getMatricula() {
       return matricula;
   }

   public void matricularCurso(Curso curso){
       if (curso != null){
           this.curso = curso;
           System.out.println(nome + " foi matriculado no curso de " + curso.getNome());
       } else {
           System.out.println("Erro: o curso não pode estar nulo");
       }
   }

   public void setMatricula(String matricula) {
       this.matricula = matricula;
   }

   public void apresentarAluno(){
       System.out.println("Nome: " + nome);
       System.out.println("\nMatricula: " + matricula);

       if (curso != null){
           System.out.println("Curso: " + curso.getNome());
           System.out.println("\nCarga horária: " + nome + "horas");
       }else {
           System.out.println("O aluno não está matriculado em nenhum curso");
       }
   }

}
