public class programa4 {
    public static void main(String[] args) {
        String[] palabras = {"a", "a", "b", "b", "c"};
        
        // Arreglos para almacenar palabras únicas y sus cantidades
        String[] palabrasUnicas = new String[palabras.length];
        int[] cantidades = new int[palabras.length];
        int totalUnicas = 0;

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            boolean encontrada = false;

            for (int j = 0; j < totalUnicas; j++) {
                if (palabrasUnicas[j].equals(palabra)) {
                    cantidades[j]++;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                palabrasUnicas[totalUnicas] = palabra;
                cantidades[totalUnicas] = 1;
                totalUnicas++;
            }
        }

        for (int i = 0; i < totalUnicas; i++) {
            System.out.println(palabrasUnicas[i] + ": " + cantidades[i]);
        }
    }
    
}
