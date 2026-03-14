package MODULE8;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(result.indexOf(c) == -1)
                result += c;
        }

        System.out.println("After removing duplicates: "+result);
    }
}
