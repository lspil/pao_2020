package exemplu4;

import java.util.Objects;

public class Automobil {

    private String model;
    private String marca;
    private int capacitate;
    private double pret;

    public Automobil(String model, String marca, int capacitate, double pret) {
        this.model = model;
        this.marca = marca;
        this.capacitate = capacitate;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return capacitate == automobil.capacitate &&
                Double.compare(automobil.pret, pret) == 0 &&
                Objects.equals(model, automobil.model) &&
                Objects.equals(marca, automobil.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, marca, capacitate, pret);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "model='" + model + '\'' +
                ", marca='" + marca + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }
}
