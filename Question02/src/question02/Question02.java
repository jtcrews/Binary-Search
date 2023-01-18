
package question02;

/**
 * Question02
 * @author Jacob Crews
 */
public class Question02 {

    /**
     * This program searches arrays for a specific value and returns the index
     * of that value
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = {17, 22, 38, 55, 68, 93, 111, 130};
        
        int check = binarySearch(a1, 2);
        int check2 = binarySearch(a1, 11);
        int check3 = binarySearch(a2, 130);
        int check4 = binarySearch(a2, 27);
        
        if (check == -1) {
            System.out.println("2 is not present in array 1.");
        } else {
            System.out.println("2 was found at index location " + (check + 1));
        }
        if (check2 == -1) {
            System.out.println("11 is not present in array 1.");
        } else {
            System.out.println("11 was found at index location " + (check2+1));
        }
        if (check3 == -1) {
            System.out.println("130 is not present in array 2.");
        } else {
            System.out.println("130 was found at index location " + (check3+1));
        }
        if (check4 == -1) {
            System.out.println("27 is not present in array 2.");
        } else {
            System.out.println("27 was found at index location " + (check4+1));
        }
    }
    
    /**
     * This method takes an array and an integer and searches the array for the specific number and returns the 
     * index of that number, or negative 1 if the number is not found
     * @param a
     * @param key
     * @return index of key if found, or negative one
     */
    public static int binarySearch(int[] a, int key) {
        int mid = a.length/2;
        int max = a.length - 1;
        int min = 0;
        while(max > min) {
            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                min = mid + 1;
                mid = max;
            } else if (key < a[mid]) {
                max = mid - 1;
                mid = min;
            }
        }
        return -1;
    }
}
