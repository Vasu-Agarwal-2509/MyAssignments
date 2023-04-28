package IntermediateOOPSAssignment;

class Rectangle5 extends Shape5{
    @Override
    public String draw(){
        return "Rectangle";
    }
}
class Line5 extends Shape5{
    @Override
    public String draw(){
        return "Line";
    }
}
class Cube5 extends Shape5{
    @Override
    public String draw(){
        return "Cube";
    }
}
abstract class Shape5{
    abstract public String draw();
}
public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape5 rectangleObj = new Rectangle5();
        Shape5 lineObj = new Line5();
        Shape5 cubeObj = new Cube5();
        System.out.println(rectangleObj.draw());
        System.out.println(lineObj.draw());
        System.out.println(cubeObj.draw());
    }
}
