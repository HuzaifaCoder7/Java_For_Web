abstract class d{
    abstract void getdata();
    
}
class data extends d{
    void getdata(){
        System.out.println("Hello I m in abstraction");
    }
}

public abstract class t7_abstraction {
    public static void main(String[] args) {
        data obj = new data();
        obj.getdata();
    }
}
