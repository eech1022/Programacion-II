/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;
import java.util.Arrays;
/**
 *
 * @author Lenovo
 */
public class SelectionSort {
    void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
          int min_idx = step;

          for (int i = step + 1; i < size; i++) {

            // To sort in descending order, change > to < in this line.
            // Select the minimum element in each loop.
            if (array[i] < array[min_idx]) {
              min_idx = i;
            }
          }

          // put min at the correct position
          int temp = array[step];
          array[step] = array[min_idx];
          array[min_idx] = temp;
        }
    }
}
