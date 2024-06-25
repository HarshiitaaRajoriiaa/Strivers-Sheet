package Lec01JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class SwitchCase {
    public static void main(String[] args) {
        ArrayList<Double> measurements = new ArrayList<>();
        measurements.add(12.00);
        System.out.println(switchCase(1, measurements) );
        
    }
    static double switchCase(int choice, List<Double> arr){
        double output = 0;
        switch(choice){
            case 1:
                double R = arr.get(0);
                output = Math.PI*R*R;
                break;
            case 2:
                double L =arr.get(0);
                double B = arr.get(1);
                output = L*B;
                break;
        }
        return output;
    }
}
