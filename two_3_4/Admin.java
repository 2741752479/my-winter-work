package two_3_4;

public class Admin {
    private String name;
    private String address;
    private String number;
    private String email;

    public Admin(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return "我的名字是"+name+",住在"+address+"，电话是"+number+"，邮箱是"+email;
    }
}

