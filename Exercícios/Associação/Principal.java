public class Principal {
   public static void main(String[] args) {

       Medico m1 = new Medico("Laura", "Pediatra", "905487534");
       Paciente p1 = new Paciente("Emily", 8,"12352853973");

       m1.apresentarMedico();
       p1.apresentarPaciente();
   }
}


