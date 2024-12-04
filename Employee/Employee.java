package Employee;
import javax.swing.JOptionPane;

import Client.*;
public abstract class Employee{
    protected static int employees = 0;
    private final int counter = 9000;
    protected String Name;
    protected String Father_name;
    protected int Emp_id;
    protected String NIC;
    protected String job_category;
    protected String Education;
    protected int Pay_scale;

    public Employee(String Name,String Father_name, int Emp_id,String NIC, int day,int month,int year){
        this.Name = Name;
        this.Father_name = Father_name;
        this.Emp_id = Emp_id + counter;
        this.NIC = NIC;   
         date_of_birth dob = new date_of_birth();
         dob.set_date_of_birth(day, month, year);
         employees++;
    }
   public void SetEmpInformation(String Name,String Father_name, int Emp_id,String NIC, int day,int month,int year ){
            this.Name = Name;
            this.Father_name = Father_name;
            this.Emp_id = Emp_id;
            this.NIC = NIC;   
             date_of_birth dob = new date_of_birth();
             dob.set_date_of_birth(day, month, year);

   }

   public int get_Emp_id(){
        return this.Emp_id;

   }

   public String getEmpName(){
     return this.Name;

}

public void updateJobCategory(String job_cat){
     this.job_category = job_cat;
}

// public int get_Emp_Age(){
//      return this.Age;

// }

public String get_Emp_JobCategory(){
     return this.job_category;

}


   public int totalEmployees(){
        return this.employees;
   }

  public abstract void setEducation(String Education);
  public abstract void setPayScale(int pay_scale);

   public void getEmpInformation(){
    System.out.println("Name: "+this.Name+" Father Name "+ this.Father_name+ "NIC: "+ this.NIC+" Emp_id "+this.Emp_id);
    System.out.println(" Job_category: "+this.job_category+" Education: "+this.Education+" Pay scale: "+this.Pay_scale);
   }

   public String display_Emp_info(){
     return ("Name: "+this.Name+" Father Name "+ this.Father_name+ "NIC: "+ this.NIC+" Emp_id "+this.Emp_id+" Job_category: "+this.job_category+" Education: "+this.Education+" Pay scale: "+this.Pay_scale);
    }
        
}







