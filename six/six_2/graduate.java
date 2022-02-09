package six_2;

public class graduate extends student {
    private String teacher;

    public graduate(String teacher) {
        this.teacher = teacher;
    }

    public graduate(int eid, int age, int heigh, String name, String sex, String place, String teacher) {
        super(eid, age, heigh, name, sex, place);
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
