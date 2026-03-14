package MODULE6;

public class SecondLargestElement {
    public static void main(String[] args) {
        int a[] = {10,20,5,40,30};
        int largest = a[0], second = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > largest){
                second = largest;
                largest = a[i];
            }
            else if(a[i] > second && a[i] != largest)
                second = a[i];
        }

        System.out.println("Second Largest = " + second);
    }
}
