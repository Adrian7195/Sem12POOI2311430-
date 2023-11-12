import java.util.Scanner;

public class Main {
    private String nombre;
    private int numeroEmpleado;

    public Main() {
        this.nombre = "";
        this.numeroEmpleado = 0;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el número de empleado: ");
        this.numeroEmpleado = sc.nextInt();
        sc.nextLine(); 
        sc.close(); 
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }

    public static void main(String[] args) {
        Main[] empleados = new Main[50]; elementos

        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Main(); 
            System.out.println("Ingrese los datos del empleado #" + (i + 1) + ":");
            empleados[i].leerDatos(); 
        }

        System.out.println("\nDatos de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nEmpleado #" + (i + 1) + ":");
            empleados[i].verDatos(); 
        }
    }
}
