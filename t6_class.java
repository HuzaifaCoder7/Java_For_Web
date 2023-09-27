import t6_packageclass.*;
//! Class name should always start with capital letter.
class Employee{
      int empId = 43;
      int salary = 50000;
      void printSalary(){
        System.out.println(salary+"$");
      }
}
public class t6_class {
    public static void main(String[] args) {
        //! Before using class methods we have to create class object
        Employee engineer = new Employee();

        //! Basically by using package we are using class from other package.In this way we are reusing the code and this is the beauty of OOP
        sum s = new sum();
        System.out.println(s.add(3,2));
        
        //! We are using getter to get private value if we don't use private then anybody can easily overwrite it and update it.
        System.out.println(s.getph());
        // System.out.println(s.ph); --> Not accessible bcz of Private 
        engineer.printSalary();

    }
}
