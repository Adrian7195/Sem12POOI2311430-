public class Main {
    private int longitud;
    private String cadena;

    public Main(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return '\0'; 
        }
    }

    public void visualizar() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
    }

    public static void main(String[] args) {
        Main miCadena = new Main("Hola, mundo!");

        System.out.println("Longitud de la cadena: " + miCadena.getLongitud());
        System.out.println("Cadena actual: " + miCadena.getCadena());

        int indice = 7; 
        char caracter = miCadena.caracter(indice);
        if (caracter != '\0') {
            System.out.println("Carácter en el índice " + indice + ": " + caracter);
        } else {
            System.out.println("El índice está fuera de rango.");
        }

        miCadena.visualizar();
    }
}
