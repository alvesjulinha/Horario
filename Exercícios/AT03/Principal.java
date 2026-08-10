public class Principal {

    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Marcos", "Chef de cozinha", 3600.00);
        Funcionario funcionario2 = new Funcionario("Melissa", "Piloto de avião", 7200.50);
    }

    System.out.println (funcionario1);
    System.out.println (funcionario2);

    Livro livro1 = new Livro ("O Lar da Srta. Peregrine para Crianças Peculiares","Ransom Riggs",352,2011);
    Livro livro2 = new Livro ("Cidade dos Etéreos", "Ransom Riggs",384, 2014);
    Livro livro3 = new Livro("Biblioteca de Almas", "Ransom riggs",416, 2015);

    System.out.println (livro1);
    System.out.println (livro2);
    System.out.println (livro3);

}
