package com.java;

public class Length {
    public static void main(String[] args) {
        ComputationComparison computation = new ComputationComparison();
        computation.setFirstX1Coordinate(4);
        computation.setFirstX2Coordinate(6);
        computation.setFirstY1Coordinate(3);
        computation.setFirstY2Coordinate(8);
        computation.setSecondX1Coordinate(8);
        computation.setSecondX2Coordinate(10);
        computation.setSecondY1Coordinate(5);
        computation.setSecondY2Coordinate(9);
        System.out.println("The co-ordinates are : \n" + computation.toString());
        int length_of_First_Line = ((computation.getFirstX2Coordinate() - computation.getFirstX1Coordinate()) ^ 2 +
                (computation.getFirstY2Coordinate() - computation.getFirstY1Coordinate()) ^ 2);
        int length_of_Second_Line = ((computation.getSecondX2Coordinate() - computation.getSecondX1Coordinate()) ^ 2
                + (computation.getSecondY2Coordinate() - computation.getSecondY1Coordinate()) ^ 2);
        System.out.println("Length of the first line = " + length_of_First_Line + "\nLength of second line = " + length_of_Second_Line);

        //equality
        System.out.println("\nResult after equality check ===>");
        Boolean equality = checkEquality(length_of_First_Line, length_of_Second_Line);
        if (equality == true)
            System.out.println("Both lines are equal");
        else
            System.out.println("Lines are not equal\n");

        //comparison

        System.out.println("Result after comparison ===>");
        Integer result = comparison(length_of_First_Line, length_of_Second_Line);
        if (result == 0)
            System.out.println("Length of the first line = length of second line");
        else if (result < 0)
            System.out.println("Length of the first line < length of second line");
        else
            System.out.println("Length of the first line > length of second line");
    }
    public static Boolean checkEquality(Integer length_firstLine, Integer length_secondLine) {
        Boolean result = length_firstLine.equals(length_secondLine);
        return (result);
    }
    public static int comparison (Integer length_firstLine, Integer length_secondLine){
        Integer result = length_firstLine.compareTo(length_secondLine);
        return (result);
    }

 }

