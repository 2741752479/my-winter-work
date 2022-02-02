package two;

public class student {
    String name;
    boolean signStatus;
    public student(String name, boolean signStatus)
    {
        this.name=name;
        this.signStatus=signStatus;
    }
    public student(){ };
    public void printStudent(){
        System.out.println("名字:"+ name );
        System.out.println("签到状态:"+ signStatus );
    }
}

