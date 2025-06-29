public class Main {
    public static void main(String[] args) {
        EstacionPeaje peaje = new EstacionPeaje("Peaje Uide", "Caseta Principal");

        peaje.registrarVehiculo(new Carro("ABC123"));
        peaje.registrarVehiculo(new Moto("XYZ789"));
        peaje.registrarVehiculo(new Camion("LMN456", 4));

        peaje.imprimirReporte();
    }
}