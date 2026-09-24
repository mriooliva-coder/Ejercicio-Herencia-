public class TecnicoMantenimiento extends Empleado {
    private int certificaciones;
    private static final double BONO_POR_CERTIFICACION = 150.0;

    public TecnicoMantenimiento(String nombre, String id, double salarioBase, int certificaciones) {
        super(nombre, id, salarioBase);
        this.certificaciones = certificaciones;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (certificaciones * BONO_POR_CERTIFICACION);
    }
}
