/* All original code written by Jasper Holton
 * Contact jasper@holton.io
 * Online at http://holton.io
 * License under The MIT License (MIT)
 * Copyright (c) 2014 Jasper Holton
 * Full licence text at http://opensource.org/licenses/MIT
 */
 
public class BucketSort{
   public static void main(String[] args) {
      int[] toSort= {1,4,5,3,0,1,4,2,5,2,0,3}; // The array to be sorted
      int maxValue=5; // The maximum value in the array

      System.out.println("Array before sorting: " + arrayToString(toSort));
      sort(toSort,maxValue);
      System.out.println("Array after sorting:  " + arrayToString(toSort));
   }
   
   // Bucket sort method
   public static void sort(int[] array, int maxVal) {
      int [] bucket=new int[maxVal+1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<array.length; i++) {
         bucket[array[i]]++;
      }
 
      int pos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            array[pos++]=i;
         }
      }
   }
   
   // Convert an array to a string
   public static String arrayToString(int[] array){
     String result = "[";
     for(int i = 0; i < array.length; i++)
     {
       if(i != array.length - 1)
         result+=array[i] + ",";
       else
         result+=array[i] + "]";
     }
     return result;
   }
}