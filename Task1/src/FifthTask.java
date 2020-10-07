public class FifthTask {
    public static void reverse(int[] arr, int k) {
        int l = arr.length;
        if (k>l) {
            System.out.println("Invalid k");
        } else {
            for (int i=0; i<k-1; i++,k--) {
                int temp = arr[i];
                arr[i] = arr[k-1];
                arr[k-1] = temp;
            }
        }
    }
    public static void sort(int[] arr) {
        int l = arr.length;
        int[] newArray = new int[2];
        for (int i=0; i<l; i++) {
            for (int j=1; j<(l-i); j++) {
                if (arr[j-1]>arr[j]) {
                    newArray[0]=arr[j-1];
                    newArray[1]=arr[j];
                    reverse(newArray,2);
                    arr[j-1]=newArray[0];
                    arr[j]=newArray[1];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = {7,1,9,6,5,3};
        //reverse(myArray, 2);
        sort(myArray);
        for (int i=0; i< myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
