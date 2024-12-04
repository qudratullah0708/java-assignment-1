package Employee;

import javax.swing.JOptionPane;

public class Officer extends Employee{

    public Officer (String Name,String Father_name, int Emp_id,String NIC, int day,int month,int year, String Education, int pay_scale){
         super(Name, Father_name,  Emp_id, NIC,  day, month, year);
         this.job_category = "Officer";
         this.setEducation(Education);
         this.setPayScale(pay_scale);
    }
    public void set_officer_info(String Education, int pay_scale){
        this.setEducation(Education);
        this.setPayScale(pay_scale);
    }
    public void get_officer_information(){
        this.getEmpInformation();
    }
    @Override
    public void setEducation(String Education){
        while (true) {
            if(Education.equalsIgnoreCase("BS") || Education.equalsIgnoreCase("MS") ||  Education.equalsIgnoreCase("MS")){
                this.Education = Education;
                break;
            }
            else{
                  Education = JOptionPane.showInputDialog(
                "Invalid input! Labour must have at least an Fsc degree.\nEnter Education (Fsc/BS/MS):");
        }
            }
        }
    @Override
    public void setPayScale(int pay_scale){
        while(true){
            if(pay_scale>17){
                this.Pay_scale = pay_scale;
                break;
            }
            else{
                pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Pay scale must be at least 17.\nEnter Pay Scale (>=17):"));
            }
        }
    }
}
