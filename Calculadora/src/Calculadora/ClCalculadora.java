package Calculadora;

import java.util.Scanner;

public class ClCalculadora {

    public static void main(String args[]) {

        String nombre, apellido;
        int num1, num2;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Buenos Días");
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();

        System.out.println("El nombre es: " + nombre + "\nSu apellido es: " + apellido);

        System.out.println("Ingrese el número 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el número 2: ");
        num2 = sc.nextInt();

        // Calculadora básica usando la clase ObjCalculadora
        ObjCalculadora calc = new ObjCalculadora();
        calc.numero1 = num1;
        calc.numero2 = num2;
        calc.operacion = "+";
        resultado = calc.CalculaValores();

        System.out.println("El resultado de la suma es: " + resultado);
    }
}
