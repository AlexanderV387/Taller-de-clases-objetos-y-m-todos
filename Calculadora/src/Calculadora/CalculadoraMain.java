package Calculadora;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraMain {

    static int dia, mes, anio;

    public static void main(String args[]) throws IOException {
        String Mensaje = "";
        String op = "0";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        op = JOptionPane.showInputDialog("Seleccione una opción:\n 1. Calculadora\n 2. Cuadrilátero\n " +
                "3. Cuadrilátero Nuevo Constructor\n 4. Calendario\n 5. Hora");

        switch (op) {
            case "1":
                System.out.println("Ingrese un saludo: ");
                Mensaje = br.readLine();
                System.out.println(Mensaje);
                String Modelo;
                Modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
                ObjCalculadora objCal = new ObjCalculadora(); //Objeto para crear métodos con o sin parámetros
                objCal.IngreseModelo(Modelo);
                break;

            case "2":
                int largo = 0;
                String op1 = "0";
                largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo del cuadrilátero"));
                objCuadrilatero objCua = new objCuadrilatero(largo);
                op1 = JOptionPane.showInputDialog("Seleccione la operación: \n1. Calcular el área \n2. Calcular Perímetro");
                if (op1.equals("1")) {
                    objCua.calcularArea();
                    JOptionPane.showMessageDialog(null,
                            "El resultado del área es: " + objCua.getResArea());
                } else if (op1.equals("2")) {
                    objCua.calcularPerimetro();
                    JOptionPane.showMessageDialog(null,
                            "El resultado del perímetro es: " + objCua.getResPerimetro());
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no existe");
                }
                break;

            case "3":
                objCuadrilatero objCuaN = new objCuadrilatero();
                break;

            case "4":
                iniciarHoy();
                JOptionPane.showMessageDialog(null, "El día es: " + dia +
                        " El mes es: " + mes + " El año es: " + anio);
                break;

            case "5":
                objCalendario cale = new objCalendario();
                cale.sacaFecha();
                JOptionPane.showMessageDialog(null, cale.toString());
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe esa opción");
                break;
        }

    }

    public static void iniciarHoy() {
        GregorianCalendar cal = new GregorianCalendar();
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        anio = cal.get(Calendar.YEAR);
    }
}
