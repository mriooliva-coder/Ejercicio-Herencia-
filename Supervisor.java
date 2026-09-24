public class Supervisor extends Empleado {
    private int equiposSupervisados;
    private static final double BONO_POR_EQUIPO = 500.0;

    public Supervisor(String nombre, String id, double salarioBase, int equiposSupervisados) {
        super(nombre, id, salarioBase);              
        this.equiposSupervisados = equiposSupervisados;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (equiposSupervisados * BONO_POR_EQUIPO);
    }
}
