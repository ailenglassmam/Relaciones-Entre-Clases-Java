package Entities;

//import java.util.ArrayList;

/**
 * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un
 * palo (espadas, bastos, oros y copas). Esta clase debe contener un método
 * toString() que retorne el número de carta y el palo.
 */
public class Carta {
    private String numeroCarta;
    private String paloCarta;
    private boolean cartaUsada = false;

    public Carta() {
    }

    public Carta(String numeroCarta, String paloCarta) {
        this.numeroCarta = numeroCarta;
        this.paloCarta = paloCarta;
    }

    public Carta(String numeroCarta, String paloCarta, boolean cartaUsada) {
        this.numeroCarta = numeroCarta;
        this.paloCarta = paloCarta;
        this.cartaUsada = cartaUsada;
    }

    public boolean isCartaUsada() {
        return cartaUsada;
    }

    public void setCartaUsada(boolean cartaUsada) {
        this.cartaUsada = cartaUsada;
    }



    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(String paloCarta) {
        this.paloCarta = paloCarta;
    }

    @Override
    public String toString() {
        return  paloCarta + " de " + numeroCarta;
    }
    
}
