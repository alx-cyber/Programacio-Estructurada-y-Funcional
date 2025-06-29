public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    @Override
    public double calcularPeaje() {
        return ejes * 1.0;
    }

    @Override
    public String toString() {
        return "Camión - Placa: " + placa + ", Ejes: " + ejes;
    }
}