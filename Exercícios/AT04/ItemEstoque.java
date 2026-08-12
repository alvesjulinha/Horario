public class ItemEstoque {
    private String nome;
    private double preco;
    private int qtd;

    public ItemEstoque(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco; }
        else {
            System.out.println("Indisponível");
        }
    }
    public int getQtd(int i){
        return qtd;
    }
    public void setNome(String nome){
        if (nome != nome){
            this.nome = nome;
        } else {
            System.out.println("O produto/nome deve ser diferente");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " \nPreço: R$ %.2f" + preco +
                " \nQuantidade em estoque: " + qtd;
    }
}
