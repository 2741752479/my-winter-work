package two_3_4;

public class SendAdmin extends Admin {
    public SendAdmin(String name, String address, String number, String email) {

        super(name, address, number, email);
    }

    @Override
    public String toString() {
        return super.toString()+"。谢谢";
    }
}
