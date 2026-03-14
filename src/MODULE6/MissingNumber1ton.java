package MODULE6;

public class MissingNumber1ton {
    public static void main(String[] args) {
        int a[] = {1,2,3,5};
        int n = 5;

        int sum = n*(n+1)/2;
        int arrSum = 0;

        for(int i=0;i<a.length;i++)
            arrSum += a[i];

        System.out.println("Missing Number = " + (sum - arrSum));
    }
}
