package MODULE6;

public class Largest_SmallestElement {
    public static void main(String[] args) {
        int a[] = {5, 2, 9, 1, 7};
        int max = a[0], min = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
