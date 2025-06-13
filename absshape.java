abstract class Shape{
    abstract void area();

}
class Circle extends Shape{
    int r = 17;
    void area(){
        double A = 3.14 *r*r;
        System.out.println("Area of Circle" + A);
    }
}
class Rectangle extends Shape{
    int l = 7;
    int b = 9;
    void area(){
        int B = l*b;
        System.out.println("Area of Rectangle" + B);
    }
}

class absshape{
    public static void main(String[] args){
        Shape obj = new Circle();
        obj.area();
        Shape obj1 = new Rectangle();
        obj1.area();
    }
}



