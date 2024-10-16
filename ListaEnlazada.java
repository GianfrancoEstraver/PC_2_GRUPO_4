
import javax.swing.table.DefaultTableModel;

public class ListaEnlazada {
    Nodo cabeza;
    Nodo cola;
    int tamaño;

    public ListaEnlazada() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    // Método para agregar una tarea con su importancia
    public void agregarTarea(String tarea, int importancia) {
        Nodo nuevoNodo = new Nodo(tarea, importancia);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        tamaño++;
    }

    // Método para eliminar una tarea por su nombre
    public boolean eliminarTarea(String tarea) {
        if (cabeza == null) {
            return false; // La lista está vacía
        }

        if (cabeza.tarea.equals(tarea)) {
            cabeza = cabeza.siguiente; // Eliminar el nodo de la cabeza
            tamaño--;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.tarea.equals(tarea)) {
                actual.siguiente = actual.siguiente.siguiente; // Eliminar el nodo
                tamaño--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false; // La tarea no fue encontrada
    }

    // Método para mostrar las tareas
    public void mostrarTareas(DefaultTableModel modelo) {
        Nodo actual = cabeza;
        while (actual != null) {
            modelo.addRow(new Object[]{actual.tarea, actual.importancia}); // Agrega la tarea y la importancia al modelo
            actual = actual.siguiente;
        }
    }

    // Método para buscar una tarea por su nombre
    public boolean buscarTarea(String tarea) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.tarea.equals(tarea)) {
                return true; // Tarea encontrada
            }
            actual = actual.siguiente;
        }
        return false; // Tarea no encontrada
    }
}


