public class t3_ex {
    public static int factorial(int num){
        int formula = num * factorial(num - 1);
        if(formula == 1 || formula == 0){
            return 1;
        }
        return formula;
    } 
    public static void main(String[] args) {
        factorial(5);
    }
   
}
