public class Employee2 {
    
        String name;
        int id;
        double salary;
        long pno;
        public Employee2(String name,int id,double salary,long pno){
            this.name=name;
            this.id=id;
            this.salary=salary;
            this.pno=pno;
        }
        public void displayinfo(){
            System.out.println("Employee Id:" +id);
            System.out.println("Employee Name:" +name);
            System.out.println("Employee salary:" +salary);
            System.out.println("Employee phone no:" +pno);
        }
        public static void main(String []args){
            Employee2 emp1=new Employee2("XYZ",101,50000.0,7890678739L);
            emp1.displayinfo();
        }
    



    
}
