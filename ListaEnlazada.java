import javax.swing.table.DefaultTableModel;

public class ListaEnlazada {
    Nodo cabeza;
    Nodo cola;
    int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    // Método para agregar una tarea al final de la lista
    public void agregarTarea(String descripcion) {
        Nodo nuevaTarea = new Nodo(descripcion);
        if (cola == null) {
            cabeza = nuevaTarea;
            cola = nuevaTarea;
        } else {
            cola.siguiente = nuevaTarea;
            cola = nuevaTarea;
        }
        tamaño++;
    }

    // Método para eliminar una tarea por nombre
    public boolean eliminarTarea(String descripcion) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.descripcion.equals(descripcion)) {
            cabeza = cabeza.siguiente;
            tamaño--;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.descripcion.equals(descripcion)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamaño--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para mostrar las tareas en una tabla
    public void mostrarTareas(DefaultTableModel modelo) {
        Nodo actual = cabeza;
        while (actual != null) {
            Object[] fila = {actual.descripcion};
            modelo.addRow(fila);
            actual = actual.siguiente;
        }
    }

    // Método para buscar una tarea por nombre
    public boolean buscarTarea(String descripcion) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.descripcion.equals(descripcion)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}

