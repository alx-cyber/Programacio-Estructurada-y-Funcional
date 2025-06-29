public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Moto - Placa: " + placa;
    }
}