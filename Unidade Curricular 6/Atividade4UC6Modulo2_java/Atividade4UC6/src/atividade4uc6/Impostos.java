package atividade4uc6;

public abstract class Impostos implements ImpostoMetodos{
    protected String tipo;
    protected double total;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

}
