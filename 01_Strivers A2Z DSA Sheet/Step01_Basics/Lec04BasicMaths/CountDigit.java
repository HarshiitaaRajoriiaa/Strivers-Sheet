package Lec04BasicMaths;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(123));
    }
    public static int countDigit(int N){
        String digit = String.valueOf(N);
        int counter = 0 ;
        for(int i=0;i<digit.length();i++){
            int current = Character.getNumericValue(digit.charAt(i));
            if(current!=0 && N%current==0){
                counter++;
            }
        }
        return counter;
    }
}
