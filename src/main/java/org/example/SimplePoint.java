package org.example;

public class SimplePoint {

    private double x,y;

    public SimplePoint(double x1, double y1) {
        x = x1;
        y = y1;
    }

    public double distance(SimplePoint p) {
        return Math.sqrt( Math.pow(p.x - x,2) + Math.pow(p.y -y,2) );
    }

    public static void main(String[] args) {
        SimplePoint point1_line1= new SimplePoint(2,1);
        SimplePoint point2_line1= new SimplePoint(8,2);

        double line1 = point1_line1.distance(point2_line1);

        System.out.println(" First Line : " + line1);

        SimplePoint point1_line2= new SimplePoint(2,0);
        SimplePoint point2_line2= new SimplePoint(5,1);

        double line2 = point1_line2.distance(point2_line2);

        System.out.println(" Second Line : " + line2);


        if(Double.toString(line1).equals(Double.toString(line2)))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        Integer Value = (Double.toString(line1).compareTo(Double.toString(line2)));
        if(Value >= 1)
        {
            System.out.println("Line 1 is Greater");
        }
        else if (Value < 0 )
        {
            System.out.println("Line 2 is Greater");
        }
        else
        {
            System.out.println("Lines are Equal");
        }

    }

}
