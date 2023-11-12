public class Main {
    private int horas;
    private int minutos;
    private int segundos;

    public Main() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0; 
    }

    public Main(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void visualizarHora() {
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Hora: " + horaFormateada);
    }

    public Main sumarHoras(Main otraHora) {
        Main resultado = new Main();

        resultado.segundos = this.segundos + otraHora.segundos;
        resultado.minutos = this.minutos + otraHora.minutos + resultado.segundos / 60;
        resultado.horas = this.horas + otraHora.horas + resultado.minutos / 60;

        resultado.segundos %= 60;
        resultado.minutos %= 60;
        resultado.horas %= 24;

        return resultado;
    }

    public static void main(String[] args) {
        Main hora1 = new Main(10, 30, 45);
        Main hora2 = new Main(3, 15, 20);
        Main resultado = new Main();

        resultado = hora1.sumarHoras(hora2);

        System.out.print("Hora 1: ");
        hora1.visualizarHora();

        System.out.print("Hora 2: ");
        hora2.visualizarHora();

        System.out.print("Resultado: ");
        resultado.visualizarHora();
    }
}
