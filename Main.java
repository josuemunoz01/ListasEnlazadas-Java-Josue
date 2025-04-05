public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        
        // Carnet 202404306
        // Instrucciones del Grupo 1 (mi carnet termina en 6)
        System.out.println("1. Agregando 0 al inicio:");
        lista.addFirst(0);
        lista.printList();

        System.out.println("\n2. Agregando 2 al final:");
        lista.add(2);
        lista.printList();

        System.out.println("\n3. Agregando 4 en la posición 1:");
        lista.addMiddle(4, 1);
        lista.printList();

        System.out.println("\n4. Lista actual:");
        lista.printList();

        System.out.println("\n5. Eliminando 2:");
        lista.remove(2);
        lista.printList();

        System.out.println("\n6. Agregando 6 al final:");
        lista.add(6);
        lista.printList();

        System.out.println("\n7. ¿La lista contiene 4?");
        System.out.println(lista.contains(4) ? "Sí" : "No");

        System.out.println("8. ¿La lista contiene 8?");
        System.out.println(lista.contains(8) ? "Sí" : "No");

        System.out.println("\n9. Revirtiendo la lista:");
        lista.reverse();
        lista.printList();

        System.out.println("\n10. Agregando 8 al inicio:");
        lista.addFirst(8);
        lista.printList();

        System.out.println("\n11. Lista final:");
        lista.printList();
    }
}
