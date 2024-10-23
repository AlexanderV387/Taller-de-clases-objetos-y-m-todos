import javax.swing.*;

public class Vehiculo {

    public static void main(String[] args) {

        // Ingreso de información del vehículo
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        int numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventanas:"));
        int cantidadPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));

        // Cálculo de kilómetros recorridos
        double kilometrosRecorridos = kilometrajeFinal - kilometrajeInicial;

        // Verificación de kilometraje
        if (kilometrosRecorridos < 0) {
            JOptionPane.showMessageDialog(null, "Error: El kilometraje final no puede ser menor que el inicial.");
        } else {
            String informacionVehiculo = String.format(
                    "Información del vehículo:\n" +
                            "Número de Motor: %s\n" +
                            "Número de Ventanas: %d\n" +
                            "Cantidad de Puertas: %d\n" +
                            "Marca: %s\n" +
                            "Modelo: %s\n" +
                            "Kilometraje Inicial: %.2f km\n" +
                            "Kilometraje Final: %.2f km\n" +
                            "Kilómetros Recorridos: %.2f km",
                    numeroMotor, numeroVentanas, cantidadPuertas, marca, modelo, kilometrajeInicial, kilometrajeFinal, kilometrosRecorridos
            );

            JOptionPane.showMessageDialog(null, informacionVehiculo);
        }
    }
}
