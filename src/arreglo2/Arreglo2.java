/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo2;

import static arreglo2.FusionarYOrdenar.fusionarYOrdenar;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Arreglo2 {
    public static void main(String[] args) {
  int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] resultado = fusionarYOrdenar(nums1, nums2);  // Llama al método
        
        System.out.println(Arrays.toString(resultado)); // Salida: [1, 2, 3, 4, 5, 6]
    }
    
}
