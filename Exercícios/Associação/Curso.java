package Associacao;

public class Curso {
   private String nome;
   private int cargaHoraria;

   public Curso(String nome, int cargaHoraria) {
       this.nome = nome;
       this.cargaHoraria = cargaHoraria;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public int getCargaHoraria() {
       return cargaHoraria;
   }

   public void setCargaHoraria(int cargaHoraria) {
       this.cargaHoraria = cargaHoraria;
   }

   public void apresentarCurso(){
       System.out.println("Curso: " + nome);
       System.out.println("\nCarga horária: " + getCargaHoraria() + "horas");
   }
}


package Associacao;

public class Principal {
   public static void main(String[] args) {
        Curso curso = new Curso("Office", 160);
        Aluno aluno = new Aluno("Davi", "123456");
       System.out.println("Antes da matrícula");
       aluno.apresentarAluno();
       System.out.println("------------------");
       aluno.matricularCurso(curso);
       System.out.println("Depois da matrícula");
       System.out.println("------------------");
       aluno.apresentarAluno();
       curso.apresentarCurso();
   }
}
