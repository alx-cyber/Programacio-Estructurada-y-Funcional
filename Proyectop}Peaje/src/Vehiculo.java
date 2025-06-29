public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract double calcularPeaje();

    @Override
    public String toString() {
        return "Vehículo con placa: " + placa;
    }
}
