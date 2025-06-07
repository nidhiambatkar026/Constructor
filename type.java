import java.lang.*;
import java.io.*;
class Rectangle{
    int length;
    int breadth;
    Rectangle()//default Constructor
    {
       length=10;
       breadth=20;
    }
    Rectangle(int l, int b)//parametrized constructor
    {
        length= l;
        breadth= b;
    }
    Rectangle(int x)//parametrized
    {
        length=x;
        breadth=x;
    }
    void area(){
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
class sample{
    public static void main(String args[]){
       Rectangle r1 = new Rectangle();
       Rectangle r2 = new Rectangle();
       Rectangle r3 = new Rectangle(5);
       Rectangle r4 = new Rectangle(5,10);
       r1.area();
       r2.area();
       r3.area();
       r4.area();
    }
}