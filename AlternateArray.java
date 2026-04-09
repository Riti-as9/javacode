// Java program to print alternate elements in an array
public class AlternateArray {
    public static void main(String[]args){
        int arr[] = {10 , 20, 30 , 40, 50, 60,} ;

        
        System.out.println("Alternate elements in the array: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }

}
