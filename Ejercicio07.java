	public class Main {
    private String nombre;
    private double salario;
    private String categoria;
    private double bonoSupervisor;
    private double bonoDirector;
    private int acciones;

    public Main(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public Main(String nombre, double salario, String categoria, double bonoSupervisor) {
        this(nombre, salario, categoria);
        this.bonoSupervisor = bonoSupervisor;
    }

    public Main(String nombre, double salario, String categoria, double bonoSupervisor, double bonoDirector, int acciones) {
        this(nombre, salario, categoria, bonoSupervisor);
        this.bonoDirector = bonoDirector;
        this.acciones = acciones;
    }

    public double calcularSalario() {
        return salario;
    }

    public void darDeAlta() {
    }

    public void jubilacion() {
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public double calcularBonoSupervisor() {
        return bonoSupervisor;
    }

    public String obtenerInformacionPublica() {
        return "Nombre: " + nombre + ", Salario: " + salario;
    }

    public String obtenerInformacionSupervisor() {
        return obtenerInformacionPublica() + ", Bono Supervisor: " + bonoSupervisor;
    }

    public double calcularBonoDirector() {
        return bonoDirector;
    }

    public void otorgarAumentoSalario(double porcentaje) {
        aumentarSalario(porcentaje * 1.5); 
    }

    public String obtenerInformacionRH() {
        return obtenerInformacionSupervisor() + ", Bono Director: " + bonoDirector + ", Acciones: " + acciones;
    }

    public static void main(String[] args) {
        Main empleado = new Main("Juan", 50000, "Operativo");
        Main supervisor = new Main("Ana", 80000, "Supervisor", 5000);
        Main director = new Main("Carlos", 120000, "Director", 5000, 10000, 100);

        System.out.println("Información Empleado: " + empleado.obtenerInformacionPublica());
        System.out.println("Información Supervisor: " + supervisor.obtenerInformacionSupervisor());
        System.out.println("Información Director: " + director.obtenerInformacionRH());

        supervisor.aumentarSalario(10);
        director.otorgarAumentoSalario(15);

        System.out.println("Nuevo salario Supervisor: " + supervisor.calcularSalario());
        System.out.println("Nuevo salario Director: " + director.calcularSalario());
    }
}

