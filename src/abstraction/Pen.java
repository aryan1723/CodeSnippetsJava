package abstraction;

abstract  class Pen {
    abstract void draw(String shape);
    abstract void erase(String shape);

    public void DisplayMsg(){
        System.out.println("This is a pen tool");
    }
}
