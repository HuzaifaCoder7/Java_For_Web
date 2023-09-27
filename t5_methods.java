public class t5_methods {
    //! Methods Syntax ==> static return-type name()
    static void greet(){
        System.out.println("Have a good day");
    }
    static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
        greet();
        System.out.println(factorial(5));
    }
}
