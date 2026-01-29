package abstraction;

import java.util.ArrayList;
import java.util.Scanner;

class ShapeCreator extends Pen{
    ArrayList<String> shapes = new ArrayList<>();
    @Override
    void draw(String shape) {
        shapes.add(shape);
        System.out.println("Created a  "+shape);
    }
    @Override
    void erase(String shape) {
        if(shapes.contains(shape)){
            shapes.remove(shape);
            System.out.println("Erased "+shape);
        }
        else {
            System.out.println("Shape not found");
        }
    }
}

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ShapeCreator tool = new ShapeCreator();
        tool.DisplayMsg();
        System.out.println("Enter the number of shapes to be created");
        int num = in.nextInt();
        in.nextLine();
        System.out.println("Enter shapes");
        for(int i=0;i<num;i++){
            String shape = in.nextLine();
            tool.draw(shape);
        }
        System.out.println("Shapes drawn: "+tool.shapes);

        System.out.println("Enter the shape to erase");
        String element = in.nextLine();
        tool.erase(element);

        System.out.println("Shapes drawn: "+tool.shapes);
    }
}
