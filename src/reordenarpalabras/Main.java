
package reordenarpalabras;

public class Main {
    public static void main(String[] args) {
        
        
        System.out.println("REORDENAR PALABRAS");
        System.out.println("_______________________________");

        String[] words1 = {"esta2", "bien4", "muy3", "esto1"};
        mostrarResultadoReordenar(words1);

        String[] words2 = {"uno3", "dos1", "tres2"};
        mostrarResultadoReordenar(words2);

        String[] words3 = {"es5", "una2", "prueba3", "esto1", "simple4"};
        mostrarResultadoReordenar(words3);

       
        
        
        System.out.println("FUSION Y ORDENAR");
        System.out.println("_______________________________");

        int[] nums1_1 = {1, 3, 5};
        int[] nums2_1 = {2, 4, 6};
        mostrarResultadoFusionYOrdenamiento(nums1_1, nums2_1);

        int[] nums1_2 = {10, 20, 30};
        int[] nums2_2 = {5, 25, 35};
        mostrarResultadoFusionYOrdenamiento(nums1_2, nums2_2);

        int[] nums1_3 = {7, 8, 9};
        int[] nums2_3 = {1, 2, 3, 4, 5, 6};
        mostrarResultadoFusionYOrdenamiento(nums1_3, nums2_3);
    }

    public static void mostrarResultadoReordenar(String[] words) {
        System.out.println("Palabras originales: " + String.join(" ", words));
        String result = ReordenarPalabras.reorderSentence(words);
        System.out.println("Oracion reordenada: " + result);
        System.out.println("_______________________________");
        System.out.println(); 
    }

    public static void mostrarResultadoFusionYOrdenamiento(int[] nums1, int[] nums2) {
        System.out.println("Arreglo 1 original: " + FusionYOrdenamiento.arrayToString(nums1));
        System.out.println("Arreglo 2 original: " + FusionYOrdenamiento.arrayToString(nums2));
        int[] result = FusionYOrdenamiento.mergeAndSort(nums1, nums2);
        System.out.println("Arreglo fusionado y ordenado: " + FusionYOrdenamiento.arrayToString(result));
        System.out.println("_______________________________");
        System.out.println(); 
    }
}
