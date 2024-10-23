package Calculadora;

import javax.swing.*;

public class objCuadrilatero {

    int largo, ancho;
    private int resArea, resPerimetro;

    public objCuadrilatero() {
        JOptionPane.showMessageDialog(null, "Soy el nuevo constructor");
    }

    public objCuadrilatero(int largo) {
        JOptionPane.showMessageDialog(null, "Bienvenidos a mi sistema de Cuadrilátero");
        this.largo = largo;
        this.ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del cuadrilátero"));
    }

    public void calcularArea() {
        resArea = largo * ancho;
    }

    public void calcularPerimetro() {
        resPerimetro = 2 * (largo + ancho);
    }

    public int getResArea() {
        return resArea;
    }

    public int getResPerimetro() {
        return resPerimetro;
    }
}
