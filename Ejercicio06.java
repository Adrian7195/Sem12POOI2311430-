import java.util.ArrayList;
import java.util.List;

class LAN {
    private List<Nodo> nodos;
    private String topologia;
    private int tamanoPaquete;

    public LAN() {
        this.nodos = new ArrayList<>();
        this.topologia = "";
        this.tamanoPaquete = 0;
    }

    public List<Nodo> listarNodos() {
        return nodos;
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void quitarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public void configurarRed(String topologia) {
        this.topologia = topologia;
    }

    public void establecerTamanoPaquete(int tamano) {
        this.tamanoPaquete = tamano;
    }

    public void enviarPaquete(Nodo origen, Nodo destino, Paquete paquete) {
    }

    public void difundirPaquete(Nodo origen, Paquete paquete) {
    }

    public void realizarEstadisticas() {
    }
}

class Nodo {
    private int id;
    private String tipoDispositivo;

    public Nodo(int id, String tipoDispositivo) {
        this.id = id;
        this.tipoDispositivo = tipoDispositivo;
    }

    public int getId() {
        return id;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }
}

class Paquete {
    private String contenido;
    private int tamano;

    public Paquete(String contenido, int tamano) {
        this.contenido = contenido;
        this.tamano = tamano;
    }

    public String getContenido() {
        return contenido;
    }

    public int getTamano() {
        return tamano;
    }
}

public class Main {
    public static void main(String[] args) {
        LAN lan = new LAN();

        lan.agregarNodo(new Nodo(1, "PC"));
        lan.agregarNodo(new Nodo(2, "Impresora"));
        lan.configurarRed("Estrella");
        lan.establecerTamanoPaquete(1024);

        List<Nodo> nodos = lan.listarNodos();
        System.out.println("Nodos actuales en la red LAN:");
        for (Nodo nodo : nodos) {
            System.out.println("ID: " + nodo.getId() + ", Tipo: " + nodo.getTipoDispositivo());
        }
    }
}
