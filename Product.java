package Files;

public class Product {
    private String name;
    private double valor;
    private int quantidade;


    public Product(String name, int quantidade, double valor) {
        this.name = name;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        double total = (quantidade * valor);
        return total;
    }
}
