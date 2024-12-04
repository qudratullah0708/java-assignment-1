package Employee;

import javax.swing.JOptionPane;

public class Teacher extends Employee{

    public Teacher(String Name,String Father_name, int Emp_id,String NIC, int day,int month,int year,String Education, int pay_scale){
          super(Name, Father_name,  Emp_id, NIC,  day, month, year);
          this.job_category = "Teacher";
          this.setEducation(Education);
          this.setPayScale(pay_scale);
    }
    public void set_teacher_info(String Education, int pay_scale){
        this.setEducation(Education);
        this.setPayScale(pay_scale);
    }
    public void get_Teacher_information(){
        this.getEmpInformation();
    }
   @Override
public void setEducation(String Education) {
    while (true) {
        if (Education.equalsIgnoreCase("MS") || Education.equalsIgnoreCase("Phd")) {
            this.Education = Education;
            break; // Exit the loop when a valid value is provided
        } else {
            Education = JOptionPane.showInputDialog("Invalid input! Teacher must have at least an MS degree.\nEnter Education (MS/Phd):");
        }
    }
}

@Override
public void setPayScale(int pay_scale) {
    while (true) {
        if (pay_scale >= 18) {
            this.Pay_scale = pay_scale;
            break; // Exit the loop when a valid value is provided
        } else {
            pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Pay scale must be at least 18.\nEnter Pay Scale (>=18):"));
        }
    }
}

}
