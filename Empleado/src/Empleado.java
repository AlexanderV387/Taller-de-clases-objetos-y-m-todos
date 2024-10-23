import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    // Atributos del empleado
    private String cedula, nombre, apellido, genero;
    private double salario;
    private LocalDate fechaNacimiento, fechaIngreso;

    // Constructor para inicializar los datos del empleado
    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    // Modificar salario
    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    // Calcular la edad del empleado
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Calcular la antigüedad del empleado
    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    // Calcular prestaciones
    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }

    // Mostrar la información del empleado
    public String mostrarInformacion() {
        return String.format(
                "Cédula: %s\nNombre: %s %s\nGénero: %s\nEdad: %d años\nSalario: %.2f\nAntigüedad: %d años\nPrestaciones: %.2f",
                cedula, nombre, apellido, genero, calcularEdad(), salario, calcularAntiguedad(), calcularPrestaciones()
        );
    }

    public static void main(String[] args) {
        // Ingresar datos del empleado
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));
        int mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento:"));
        int diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:"));
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);

        int anioIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso:"));
        int mesIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de ingreso:"));
        int diaIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de ingreso:"));
        LocalDate fechaIngreso = LocalDate.of(anioIngreso, mesIngreso, diaIngreso);

        // Crear el objeto empleado
        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);

        // Modificar salario si se desea
        int modificarSalario = JOptionPane.showConfirmDialog(null, "¿Desea modificar el salario?", "Modificar Salario", JOptionPane.YES_NO_OPTION);
        if (modificarSalario == JOptionPane.YES_OPTION) {
            double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario:"));
            empleado.modificarSalario(nuevoSalario);
        }

        // Mostrar la información del empleado
        JOptionPane.showMessageDialog(null, empleado.mostrarInformacion());
    }
}
