public class PilaTareasU {
    private Tarea[] pila; // Arreglo para almacenar las tareas
    private int tope; // Índice del elemento superior de la pila
    private int capacidad; // Capacidad máxima de la pila

    // Constructor
    public PilaTareasU(int capacidad) {
        this.capacidad = capacidad;
        this.pila = new Tarea[capacidad]; // Inicializa el arreglo
        this.tope = -1; // Pila vacía
    }

    // Método para apilar una nueva tarea
    public boolean apilar(String tarea, int importancia) {
        if (tope == capacidad - 1) {
            return false; // La pila está llena
        }
        tope++;
        pila[tope] = new Tarea(tarea, importancia); // Crea y añade la nueva tarea
        return true;
    }

    // Método para desapilar una tarea
    public Tarea desapilar() {
        if (tope == -1) {
            return null; // La pila está vacía
        }
        return pila[tope--]; // Devuelve la tarea en la cima y decremente el tope
    }

    // Método para mostrar la pila de tareas
    public Tarea[] mostrarPila() {
        if (tope == -1) {
            return null; // La pila está vacía
        }
        
        Tarea[] tareas = new Tarea[tope + 1];
        for (int i = 0; i <= tope; i++) {
            tareas[i] = pila[i]; // Copia las tareas al arreglo resultante
        }
        return tareas; // Retorna el arreglo con las tareas
    }

    // Método para ordenar la pila por importancia (de mayor a menor)
    public void ordenarPilaPorImportancia() {
        for (int i = 0; i < tope; i++) {
            for (int j = 0; j < tope - i; j++) {
                if (pila[j].importancia < pila[j + 1].importancia) {
                    // Intercambia las tareas
                    Tarea temp = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = temp;
                }
            }
        }
    }
}

// Clase auxiliar para las tareas
class Tarea {
    String tarea;
    int importancia;

    Tarea(String tarea, int importancia) {
        this.tarea = tarea;
        this.importancia = importancia;
    }
}





