package five;

public class Student {
    private String sNo,sName,classNo,sex;
    //private char sex;

    public Student() {
    }

    public Student(String sNo, String sName, String classNo, String sex) {
        this.sNo = sNo;
        this.sName = sName;
        this.classNo = classNo;
        this.sex = sex;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
