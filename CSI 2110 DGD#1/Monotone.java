public class Monotone {

    public static boolean findMonotone(int[] arr) {
        Boolean mono = false;
            int inc = 1;
            int dec = 1;
            int size =arr.length;

            for (int i = 1; i < arr.length; i ++) {
                if (arr[i -1] <= arr[i]) {
                    inc++;
                }
                else if (arr[i] <= arr[i - 1]) {
                    dec++;
                }
            }

            return (inc ==size || dec == size);
        }


        public static void main(String[] args) {
            int[] arr = {3,1,2};

            boolean mono = findMonotone(arr);

            System.out.println(mono);
        }
    }
