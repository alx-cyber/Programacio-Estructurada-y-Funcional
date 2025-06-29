public class Carro extends Vehiculo {
    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 2.0;
    }

    @Override
    public String toString() {
        return "Carro - Placa: " + placa;
    }
}