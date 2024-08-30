/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo2;

/**
 *
 * @author Usuario
 */
public class FusionarYOrdenar {
   public static int[] fusionarYOrdenar(int[] nums1, int[] nums2) {
        int longitud1 = nums1.length;
        int longitud2 = nums2.length;
        int[] fusionado = new int[longitud1 + longitud2];
        
        int i = 0, j = 0, k = 0;
        
        // Fusionar los dos arreglos mientras se mantienen ordenados
        while (i < longitud1 && j < longitud2) {
            if (nums1[i] <= nums2[j]) {
                fusionado[k++] = nums1[i++];
            } else {
                fusionado[k++] = nums2[j++];
            }
        }
        
        // Copiar los elementos restantes de nums1, si hay alguno
        while (i < longitud1) {
            fusionado[k++] = nums1[i++];
        }
        
        // Copiar los elementos restantes de nums2, si hay alguno
        while (j < longitud2) {
            fusionado[k++] = nums2[j++];
        }
        
        return fusionado;
    }  
}
