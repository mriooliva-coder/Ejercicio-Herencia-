public class Main {
    public static void main(String[] args) {
        Empleado[] equipo = {
            new Piloto("Ana Gómez", "E-101", 4500.0, 60),
            new TecnicoMantenimiento("Luis Rivas", "E-102", 3800.0, 3),
            new AgenteVentas("Carla Mux", "E-103", 3200.0, 900.0),
            new Supervisor("Marco Pérez", "E-104", 5000.0, 3)
        };

        for (Empleado e : equipo) {
            System.out.printf("%s: Q%.2f%n", e.getNombre(), e.calcularSalario());
        }
    }
}
