package Employee;

import javax.swing.JOptionPane;

public class Labour extends Employee{

    public Labour  (String Name,String Father_name, int Emp_id,String NIC, int day,int month,int year, String Education, int pay_scale){
          super(Name, Father_name,  Emp_id, NIC,  day, month, year);
          this.job_category = "Labour";
          this.setEducation(Education);
          this.setPayScale(pay_scale);
    }
    public void set_labour_info(String Education, int pay_scale){
        this.setEducation(Education);
        this.setPayScale(pay_scale);
    }
    public void get_labour_information(){
        this.getEmpInformation();
    }
    @Override
public void setEducation(String Education) {
    while (true) {
        if (Education.equalsIgnoreCase("Fsc") || 
            Education.equalsIgnoreCase("BS") || 
            Education.equalsIgnoreCase("MS")) {
            this.Education = Education;
            break; // Exit the loop when valid input is provided
        } else {
            Education = JOptionPane.showInputDialog(
                "Invalid input! Labour must have at least an Fsc degree.\nEnter Education (Fsc/BS/MS):");
        }
    }
}

@Override
public void setPayScale(int pay_scale) {
    while (true) {
        if (pay_scale >= 1 && pay_scale <= 10) {
            this.Pay_scale = pay_scale;
            break; // Exit the loop when valid input is provided
        } else {
            pay_scale = Integer.parseInt(JOptionPane.showInputDialog(
                "Invalid input! Labour pay scale must be between 1 and 10.\nEnter Pay Scale (1-10):"));
        }
    }
}


}
