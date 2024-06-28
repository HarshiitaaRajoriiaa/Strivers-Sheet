
public class Rough{
    public static void main(String args[]){
        System.out.println("hello from striver's sheet file");
        // int x = 20000;
        // String weight = x>200 ? "heavy" : "light";
        // System.out.println(weight);
        // int n  = Integer.MAX_VALUE;
        // System.out.println(n);
        String s = "A man, a plan, a canal: Panama";
        String s2 = s.replaceAll("[a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s2);

    }
}