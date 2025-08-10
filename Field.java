public class Field {
    double length, width, a, p;


    void area(){
        a = length * width;
        System.out.println("Area: "+a);
    }

    void perimeter(){
        p = 2 * (length + width);
        System.out.println("Perimeter: "+p);
    }

    Field(double Length, double Width){
        length = Length;
        width = Width;
    }

}
