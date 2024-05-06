public class Seminar_01_Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_length = 5;
        int result = arrayOutOfBoundsException(arr, min_length);
        System.out.println(result);
    }
    public static int arrayOutOfBoundsException(int[] arr, int min_length){
        if (arr.length < min_length) {
            return -1;
        }
        else {
            return arr.length;
        }
    }
}
