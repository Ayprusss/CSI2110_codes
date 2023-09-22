public class rotate {
    
    public static void rotateNum(int[] arr, int k) {

        for (int i = 0; i < k; i ++) {
            arr[i %k]
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] newArr = rotateNum(arr, 3);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
