package Lec01JavaBasics;
//https://www.geeksforgeeks.org/problems/data-type-1666706751/1
public class DataTypes{
    public static void main(String[] args) {
        System.out.println(dataTypeSize("Integer"));
        
    }
    public static int dataTypeSize(String str) {
        int output = 0;
        if (str.equals("Character")) {
            output = 2; 
        }
        if (str.equals("Integer")) {
            output = 4; 
        }
        if (str.equals("Long")) {
            output = 8; 
        }
        if (str.equals("Float")) {
            output = 4; 
        }
        if (str.equals("Double")) {
            output = 8; 
        }
        return output;
    }
}