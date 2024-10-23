import javax.swing.*;

public class Producto {

    public static void main(String[] args) {

        // Ingreso de información del producto
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double valorProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto:"));
        int tieneIVA = JOptionPane.showConfirmDialog(null, "¿El producto tiene IVA?", "Confirmar", JOptionPane.YES_NO_OPTION);

        // Cálculo del IVA
        double iva = 0;
        if (tieneIVA == JOptionPane.YES_OPTION) {
            if (valorProducto <= 500) {
                iva = valorProducto * 0.12;
            } else if (valorProducto <= 1500) {
                iva = valorProducto * 0.14;
            } else {
                iva = valorProducto * 0.15;
            }
        }

        // Cálculo del valor total (producto + IVA)
        double valorTotal = valorProducto + iva;

        // Mostrar la información del producto y el cálculo del IVA
        String informacionProducto = String.format(
                "Información del producto:\n" +
                        "Nombre del producto: %s\n" +
                        "Valor del producto: %.2f\n" +
                        "IVA aplicado: %.2f\n" +
                        "Valor total con IVA: %.2f",
                nombreProducto, valorProducto, iva, valorTotal
        );

        JOptionPane.showMessageDialog(null, informacionProducto);
    }
}
