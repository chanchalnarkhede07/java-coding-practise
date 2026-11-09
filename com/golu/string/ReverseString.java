package golu.string;

public class ReverseString {


    public static void main(String[] args){
        ReverseString rs= new ReverseString();
        rs.reverseString();
    }

    //1. Using  Inbuilt Mehtod
    // O(N) O(n)
    public void reverseString(){
        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }

    //2. Using for loop
    public void reverseStringForLoop(){
        String str="hello";
        String reversed="";

        for (int i = str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);

//            reversed.toString().append(str.charAt(i));
        }
    }

}
