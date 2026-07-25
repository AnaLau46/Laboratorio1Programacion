import java.util.Stack;
public class Main {
        public static void main(String[] args) {
            // Mensaje de bienvenida
            System.out.println("¡Hola mundo");
            System.out.println("----------------------------------");

            // Ejemplo funcional de Pila (Stack)
            Stack<String> pila = new Stack<>();

            // Insertar elementos en la pila
            pila.push("Primer elemento");
            pila.push("Segundo elemento");
            pila.push("Tercer elemento");

            // Mostrar el elemento en la cima
            System.out.println("Elemento en la cima: " + pila.peek());

            // Remover un elemento de la pila
            System.out.println("Elemento removido: " + pila.pop());

            // Estado actual de la pila
            System.out.println("Pila actual: " + pila);
        }
    }

