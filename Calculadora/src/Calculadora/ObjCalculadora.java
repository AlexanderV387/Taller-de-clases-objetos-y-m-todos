package Calculadora;

import javax.swing.*;

public class ObjCalculadora {

    // Atributos
    private String Modelo;
    String operacion;
    double numero1, numero2, resultado;
    int numInt = 0;

    public void IngreseModelo(String Modelo) {
        this.Modelo = Modelo;
        IngresoValores();
    }

    public void IngresoValores() {
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 2"));
        operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /)");

        resultado = this.CalculaValores();
        JOptionPane.showMessageDialog(null, "El modelo es: " + Modelo);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

    public double CalculaValores() {
        double resultadoOperacion = 0;

        switch (operacion) {
            case "+":
                resultadoOperacion = numero1 + numero2;
                break;
            case "-":
                resultadoOperacion = numero1 - numero2;
                break;
            case "*":
                resultadoOperacion = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir para 0");
                } else {
                    resultadoOperacion = numero1 / numero2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
        }

        return resultadoOperacion;
    }

    public String Par_Impar() {
        String mensaje = "";

        if ((numInt % 2) == 0) {
            mensaje = "El número es par";
        } else {
            mensaje = "El número es impar";
        }

        return mensaje;
    }
}
