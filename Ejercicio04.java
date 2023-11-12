public class Main {
    private int horas;
    private int minutos;
    private int segundos;

    public Main(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void avanzar(int horas, int minutos, int segundos) {
        this.horas += horas;
        this.minutos += minutos;
        this.segundos += segundos;

        
        this.minutos += this.segundos / 60;
        this.segundos %= 60;
        this.horas += this.minutos / 60;
        this.minutos %= 60;
        this.horas %= 24;
    }

    public void ponerACero() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void visualizar() {
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Hora actual: " + horaFormateada);
    }

    public static void main(String[] args) {
        Main hora = new Main(10, 30, 45);

        hora.visualizar();

        hora.avanzar(2, 15, 30);
        System.out.println("Después de avanzar 2 horas, 15 minutos y 30 segundos:");
        hora.visualizar();

        hora.ponerACero();
        System.out.println("Después de poner a cero:");
        hora.visualizar();
    }
}

