public class StringBuilder {
    public static void main(String[] args) {
        
        // Dichiarazione e inizializzazione di un oggetto StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // Utilizzo del metodo append()
        sb.append(" world!");
        System.out.println(sb.toString()); // Output: "Hello world!"
        
        // Utilizzo del metodo insert()
        sb.insert(6, "Java ");
        System.out.println(sb.toString()); // Output: "Hello Java world!"
        
        // Utilizzo del metodo delete()
        sb.delete(6, 10);
        System.out.println(sb.toString()); // Output: "Hello world!"
        
        // Utilizzo del metodo reverse()
        sb.reverse();
        System.out.println(sb.toString()); // Output: "!dlrow olleH"
    }
}