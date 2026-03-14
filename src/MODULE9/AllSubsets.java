package MODULE9;

public class AllSubsets {
    static void subset(int[] a, int index, String current){
        if(index == a.length){
            System.out.print(current + " ");
            return;
        }

        subset(a, index+1, current);          // exclude
        subset(a, index+1, current + a[index]);// include
    }

    public static void main(String[] args){
        int a[] = {1,2,3};
        subset(a,0,"");
    }
}
