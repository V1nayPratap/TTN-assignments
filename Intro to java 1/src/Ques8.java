//. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
public class Ques8 {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("String after reverse :"+strBuffer.reverse());
        strBuffer.delete(4,10); //alternate strBuffer.replace(4,9,"");
        System.out.println("after removing characters from index 4 to 9: "+strBuffer);
    }
}
