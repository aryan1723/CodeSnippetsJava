package encapsulation;

public class ValidAge {
    private String content = "This is the secured content";
    private int age;

    public  void setAge(int value){
        this.age=value;
    }

    private String getContent(){
        return content;
    }

    public void validate(){
        if(age>18){
            System.out.println(getContent());
        }
        else{
            System.out.println("Age is not valid.");
        }
    }
}

