
import MiAporte.ListaEnlazadaU;
import MiAporte.PilaTareasU;

// @author 7zacg
public class LlamarU {

    public static void main(String[] args) {
        ListaEnlazadaU lista = new ListaEnlazadaU();

        System.out.println("Lista Enlazada: ");
        lista.agregarTarea("Tarea 1");
        lista.agregarTarea("Tarea 2");
        lista.agregarTarea("Tarea 3");
        System.out.println(lista.mostrarTareas());
        System.out.println("Buscar Tarea: ");
        System.out.println(lista.buscarTarea("Tarea 2"));
        System.out.println("ELiminar tarea:");
        System.out.println(lista.eliminarTarea("Tarea 2"));
        System.out.println(lista.mostrarTareas());
        System.out.println();
        System.out.println("Pilas: ");
        System.out.println("Crear una pila Tareas: ");
        PilaTareasU pila = lista.crearPilaDeTareas();
        System.out.println(pila.mostrarPila());
        System.out.println("Desapilar tarea:");
        System.out.println(pila.desapilar());
        System.out.println(pila.mostrarPila());
    }
}
