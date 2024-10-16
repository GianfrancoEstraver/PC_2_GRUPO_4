public class Nodo {
    String tarea;
    int importancia; // Agregamos el campo para la importancia
    Nodo siguiente;

    public Nodo(String tarea, int importancia) {
        this.tarea = tarea;
        this.importancia = importancia; // Inicializar la importancia
        this.siguiente = null;
    }
}
