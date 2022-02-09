package six_2;

public class student {
    private int eid,age,heigh;
    private String name,sex,place;

    public student() {
    }

    public student(int eid, int age, int heigh, String name, String sex, String place) {
        this.eid = eid;
        this.age = age;
        this.heigh = heigh;
        this.name = name;
        this.sex = sex;
        this.place = place;
    }

    public int getEid(int eid) {
        return this.eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
