package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i; j<n-1; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            System.out.println("Swapping done!");
        }
        for(int value : a) System.out.print(value + " ");
    }
}
