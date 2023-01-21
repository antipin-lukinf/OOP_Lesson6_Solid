package solid.lsp;

public abstract class Orderable {
    protected int qnt;
    protected int price;

    public Orderable(int qnt, int price) {
        this.qnt = qnt;
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int getAmount();
}
