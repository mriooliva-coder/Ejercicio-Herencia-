public class AgenteVentas extends Empleado {
    private double comisionVentas;

    public AgenteVentas(String nombre, String id, double salarioBase, double comisionVentas) {
        super(nombre, id, salarioBase);
        this.comisionVentas = comisionVentas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comisionVentas;
    }
}
