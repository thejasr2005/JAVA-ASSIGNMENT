package MODULE7;

public class TimeComplexity {
    static int linear(int a[], int key){
        for(int i=0;i<a.length;i++)
            if(a[i]==key) return i;
        return -1;
    }

    static int binary(int a[], int key){
        int l=0,h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==key) return m;
            else if(a[m]<key) l=m+1;
            else h=m-1;
        }
        return -1;
    }

    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        int key=30;

        System.out.println("Linear Search index: "+linear(a,key));
        System.out.println("Binary Search index: "+binary(a,key));
    }
}

