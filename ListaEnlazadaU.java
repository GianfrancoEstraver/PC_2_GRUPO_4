package MiAporte;

// @author 7zacg
public class ListaEnlazadaU {

    private NodoU cabeza;

    public ListaEnlazadaU() {
        cabeza = null;
    }

    // Método para agregar una nueva tarea:
    public void agregarTarea(String tarea) {
        NodoU nuevoNodo = new NodoU(tarea);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoU temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para eliminar una tarea:
    public String eliminarTarea(String tarea) {
        if (cabeza == null) {
            return "La lista de tareas está vacía. No se puede eliminar la tarea.";
        }

        // Si la tarea es del primer nodo:
        if (cabeza.tarea.equals(tarea)) {
            cabeza = cabeza.siguiente;
            return "Tarea '" + tarea + "' eliminada exitosamente.";
        }

        NodoU temp = cabeza;

        // Busca en la lista hasta encontrar el nodo correspondiente:
        while (temp.siguiente != null && !temp.siguiente.tarea.equals(tarea)) {
            temp = temp.siguiente;
        }

        // Lla tarea se encuentra en la lsita:
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            return "Tarea '" + tarea + "' eliminada exitosamente.";
        } else {
            // La tarea no se encuentra en la lista:
            return "La tarea '" + tarea + "' no se encontró en la lista.";
        }
    }

    // Método para mostrar la lista completa de tareas:
    public String mostrarTareas() {
        if (cabeza == null) {
            return "La lista de tareas está vacía.";
        }

        StringBuilder resultado = new StringBuilder();
        NodoU temp = cabeza;
        while (temp != null) {
            resultado.append(temp.tarea).append(" -> ");
            temp = temp.siguiente;
        }
        resultado.append("null");

        return resultado.toString();
    }

    // Método para buscar una tarea:
    public String buscarTarea(String tarea) {
        NodoU temp = cabeza;
        int posicion = 0;

        while (temp != null) {
            if (temp.tarea.equals(tarea)) {
                return "Tarea '" + tarea + "' encontrada en la posición " + posicion + ".";
            }
            temp = temp.siguiente;
            posicion++;
        }

        return "La tarea '" + tarea + "' no se encontró en la lista.";
    }

    // Método para convertir la lista en una pila (Prioridad)
    public PilaTareasU crearPilaDeTareas() {
        PilaTareasU pila = new PilaTareasU();
        NodoU temp = cabeza;

        while (temp != null) {
            pila.apilar(temp.tarea);
            temp = temp.siguiente;
        }

        return pila;
    }

}
