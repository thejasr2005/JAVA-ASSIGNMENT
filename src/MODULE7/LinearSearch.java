package MODULE7;

    public class LinearSearch {
        public static int FindElement(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {10, 2, 7, 1, 18, 20, 11};
            int target = 7;
            int result = FindElement(arr, target);
            if(result !=-1) {
                System.out.println("Element found at index:" + result);
            }else{
                System.out.println("element not found");
            }
        }
    }



