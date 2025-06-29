import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        totalRecaudado += peaje;
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo + " | Peaje: $" + peaje);
    }

    public void imprimirReporte() {
        System.out.println("\n--- REPORTE DE PEAJE ---");
        System.out.println("Estación: " + nombre + " (" + departamento + ")");
        System.out.println("Vehículos registrados:");
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v);
        }
        System.out.println("Total recaudado: $" + totalRecaudado);
    }
}