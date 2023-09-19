import java.util.*;

class MedianOfTwoNumbers {

    public static void main(String[] args) {
        // Inputs
        int[] nums1 = new int[]{1,2,3,4}; 
        int[] nums2 = new int[]{5,6};

        // Solution Funtion which returns MEDIAN
        findMedianSortedArrays(nums1, nums2);
   
    }

      public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergerdArray = new int[nums1.length+nums2.length];
        double result = 0.0;   
        int i=0, j=0, k=0;

        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                mergerdArray[k] = nums1[i];
                i++;
                k++;                
            }else{
                mergerdArray[k] = nums2[j];
                j++;
                k++;
            }
        }
         while (i<nums1.length) {
            mergerdArray[k]=nums1[i];
            i++;
            k++;
         }

         while (j<nums2.length) {
            mergerdArray[k]=nums2[j];
            j++;
            k++;            
         }

         if (mergerdArray.length%2!=0) {
            result = mergerdArray[mergerdArray.length/2];            
         }else{
            result = (mergerdArray[mergerdArray.length/2] + mergerdArray[(mergerdArray.length/2)-1] )/2.0; 
         }
       
        return result;
    }
    

   }
