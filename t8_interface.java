interface d {
    void getdata();
}
class data implements d{
    public void getdata(){
        System.out.println("Hello I'm in interface");
    }
}
public class t8_interface {
    public static void main(String[] args) {
        data obj = new data();
        obj.getdata();
    }
}
