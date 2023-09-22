public class LuckyNum {
    
    public static int luckyNum(int[] arr) {
        int lucky = 0;
        Boolean found = false;
        for (int i = 0; i < arr.length; i ++) {
            int count = 0;
            int var = arr[i]; 
            for (int j = i; j < arr.length; j ++) {
                int var2 = arr[j];
                if (var ==var2) {
                    count++;
                }
            }

            if (var ==count && var > lucky) {
                lucky = var;
                found = true;
            }
        }
        if (found) {
            return lucky;
        }
        else {
            return -1;
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,4,4};

        int val= luckyNum(arr);
        System.out.println(val);
    }
}