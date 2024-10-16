package MiAporte;

// @author 7zacg
public class PilaTareasU {

    private NodoPilaU cima;

    // Constructor
    public PilaTareasU() {
        cima = null;
    }

    // Método para apilar una nueva tarea
    public void apilar(String tarea) {
        NodoPilaU nuevoNodo = new NodoPilaU(tarea);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para desapilar una tarea:
    public String desapilar() {
        if (cima == null) {
            return "La pila de tareas está vacía.";
        }

        String tarea = cima.tarea;
        cima = cima.siguiente;
        return "Tarea '" + tarea + "' desapilada.";
    }

    // Método para mostrar la pila de tareas:
    public String mostrarPila() {
        if (cima == null) {
            return "La pila de tareas está vacía.";
        }

        StringBuilder resultado = new StringBuilder();
        NodoPilaU temp = cima;
        while (temp != null) {
            resultado.append(temp.tarea).append(" -> ");
            temp = temp.siguiente;
        }
        resultado.append("null");

        return resultado.toString();
    }
}
