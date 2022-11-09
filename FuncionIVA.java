public class FuncionIVA {
    public static void main(String[] args) {
        double precio, iva  ;
        precio=580;
       iva = valorIva(precio);
        System.out.println("El precio con el iva incluido es "+ (precio+iva));
    }

public static double valorIva(double precio) {
    double iva;
    iva = precio * 0.21;

    return iva;
}
}