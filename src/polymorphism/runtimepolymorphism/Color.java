package polymorphism.runtimepolymorphism;

import java.util.Scanner;

class DefaultColor{
    void setcolor(String color){
        System.out.println("default color is black");
    }
}
class SetFavColor extends DefaultColor{
    @Override
    void setcolor(String color){
        System.out.println("Fav Color set to: "+color);
    }
}



public class Color extends SetFavColor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String color = in.nextLine();
        DefaultColor obj = new DefaultColor();
        obj.setcolor("");
        Color obj2 = new Color();
        obj2.setcolor(color);
    }
}
