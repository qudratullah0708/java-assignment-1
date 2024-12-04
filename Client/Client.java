
package Client;
import Employee.*; // Import all classes in the Employee package
import javax.swing.JOptionPane;

public class Client {

    private Employee[] employees = new Employee[50];
    private static int employeeCount = 0;  //shared by all objs

     public  void addEmployee(){

        if(employeeCount<50){
        int choice = -1;
        while (choice < 1 || choice > 3) {
            try {
                choice = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Type of Employee.\n1. Teacher\n2. Officer\n3. Labour")
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }

        String name = JOptionPane.showInputDialog("Enter Emp Name:");
        String fatherName = JOptionPane.showInputDialog("Enter Father Name:");
        String cnic = JOptionPane.showInputDialog("Enter Your CNIC:");
        int empId = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp_ID:"));
        String dobInput = JOptionPane.showInputDialog("Enter your Date of Birth (DD-MM-YYYY):");
        String[] dobParts = dobInput.split("-");
        int day = Integer.parseInt(dobParts[0]);
        int month = Integer.parseInt(dobParts[1]);
        int year = Integer.parseInt(dobParts[2]);

       // Employee employee = null;

        if (choice == 1) {
            String education = JOptionPane.showInputDialog("Enter Education:");
            int payScale = Integer.parseInt(JOptionPane.showInputDialog("Enter Pay scale:"));
            employees[employeeCount] = new Teacher(name, fatherName, empId, cnic, day, month, year, education, payScale);
        } else if (choice == 2) {
            String education = JOptionPane.showInputDialog("Enter Education:");
            int payScale = Integer.parseInt(JOptionPane.showInputDialog("Enter Pay scale:"));
            employees[employeeCount] = new Officer(name, fatherName, empId, cnic, day, month, year, education, payScale);
        } else if (choice == 3) {
            String education = JOptionPane.showInputDialog("Enter Education:");
            int payScale = Integer.parseInt(JOptionPane.showInputDialog("Enter Pay scale:"));
            employees[employeeCount] = new Labour(name, fatherName, empId, cnic, day, month, year, education, payScale);
        }
        employeeCount++;
        JOptionPane.showMessageDialog(null, "Teacher Added Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Employee list is full! Cannot add more teachers.");
        }

       // employees[i] = employee; // Adding record in the array
     }
//      public void updateEmployee(){
//         int Emp_id = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp_ID to update:"));
//         int index = searchByEmpId(Emp_id);
    
//     if (index!=-1) {

//         int choice = Integer.parseInt(JOptionPane.showInputDialog(
//                 "1. Update Education\n"+
//                 "2. Update Pay Scale\n"+
//                 "3. Update Job Category\n"+
//                 "4. Update All\n"+
//                 "Cancel\n"+
//                 "5. Invalid Choice\n\n" +
//                 "Enter your choice to proceed:"
//             ));
//         switch (choice) {
//             case 0: // Update Education
//             String education = JOptionPane.showInputDialog("Enter updated Education:");
//             employees[Emp_id].updateEducation(education);    
//                 break;
//             case 1: // Update Pay Scale
//             int pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Enter pay scale to update:"));
//             employees[Emp_id].updatePayscale(pay_scale); 
//                 break;
//             case 2: // Update Job Category
//             String category = JOptionPane.showInputDialog("Enter Job Category:");
//             employees[Emp_id].updateJobCategory(category);   
//                 break;
//             case 3: // Update All
//              education = JOptionPane.showInputDialog("Enter updated Education:");
//             employees[Emp_id].updateEducation(education);  
//              pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Enter pay scale to update:"));
//             employees[Emp_id].updatePayscale(pay_scale);  
//             category = JOptionPane.showInputDialog("Enter Job Category:");
//             employees[Emp_id].updateJobCategory(category);  
//                 break;
//             case 4: // Cancel
//                 JOptionPane.showMessageDialog(null, "Update canceled.");
//                 break;
//             default:
//                 JOptionPane.showMessageDialog(null, "Invalid choice.");
//         }
//     } else {
//         JOptionPane.showMessageDialog(null, "Employee with ID " + Emp_id + " not found.");
//     }

//   }


public void updateEmployee(){
    int Emp_id = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp_ID to update:"));
    int index = searchByEmpId(Emp_id);

if (index!=-1) {

    int choice = Integer.parseInt(JOptionPane.showInputDialog(
            "1. Update Education\n"+
            "2. Update Pay Scale\n"+
            "3. Update Job Category\n"+
            "4. Update All\n"+
            "Cancel\n"+
            "5. Invalid Choice\n\n" +
            "Enter your choice to proceed:"
        ));
        Employee  emp = employees[index];
    switch (choice) {

        case 0: // Update Education
         
        String education = JOptionPane.showInputDialog("Enter updated Education:"); 
          if(emp instanceof Teacher){
            ((Teacher)emp).setEducation(education);
          }else if(emp instanceof Officer){
            ((Officer)emp).setEducation(education);
          }else if(emp instanceof Labour){
            ((Labour) emp).setEducation(education);
          }else{
            JOptionPane.showMessageDialog(null, "Invalid Employee Type");
          }
       
            break;
        case 1: // Update Pay Scale
      //  Employee  emp = employees[index];
        int pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Enter pay scale to update:"));
        if(emp instanceof Teacher){
            ((Teacher)emp).setPayScale(pay_scale);
          }else if(emp instanceof Officer){
            ((Officer)emp).setPayScale(pay_scale);
          }else if(emp instanceof Labour){
            ((Labour) emp).setPayScale(pay_scale);
          }else{
            JOptionPane.showMessageDialog(null, "Invalid Employee Type");
          }
            break;
        case 2: // Update Job Category
        String category = JOptionPane.showInputDialog("Enter Job Category:");
        employees[Emp_id].updateJobCategory(category);   
            break;
        case 3: // Update All
         education = JOptionPane.showInputDialog("Enter updated Education:");
         if(emp instanceof Teacher){
            ((Teacher)emp).setEducation(education);
          }else if(emp instanceof Officer){
            ((Officer)emp).setEducation(education);
          }else if(emp instanceof Labour){
            ((Labour) emp).setEducation(education);
          }else{
            JOptionPane.showMessageDialog(null, "Invalid Employee Type");
          }  
         pay_scale = Integer.parseInt(JOptionPane.showInputDialog("Enter pay scale to update:"));
         if(emp instanceof Teacher){
            ((Teacher)emp).setPayScale(pay_scale);
          }else if(emp instanceof Officer){
            ((Officer)emp).setPayScale(pay_scale);
          }else if(emp instanceof Labour){
            ((Labour) emp).setPayScale(pay_scale);
          }else{
            JOptionPane.showMessageDialog(null, "Invalid Employee Type");
          }  
        category = JOptionPane.showInputDialog("Enter Job Category:");
        employees[Emp_id].updateJobCategory(category);  
            break;
        case 4: // Cancel
            JOptionPane.showMessageDialog(null, "Update canceled.");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid choice.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Employee with ID " + Emp_id + " not found.");
}

}
     public void deleteEmployee(){
        int Emp_id = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp_ID to update:"));
        int index = searchByEmpId(Emp_id);
        if(index!=-1){
                         for(int j=index;j<employeeCount-1;j++){
                                employees[j] = employees[j+1];
                         }
                         employees[employeeCount -1]  = null;
                         employeeCount--;
                         JOptionPane.showMessageDialog(null, "Employee Deleted Successfully");
        }
        else{
                    JOptionPane.showMessageDialog(null, "Employee with id "+Emp_id+" not found.");
        }
    }




     public int searchByEmpId(int Id){    
           
            for(int i=0;i<employeeCount;i++){
                     if(employees[i].get_Emp_id()==Id){
                JOptionPane.showMessageDialog(null, employees[i].display_Emp_info());
                        return i;
                     }
            }
            JOptionPane.showMessageDialog(null, "Employee With Emp_id "+Id+" not Found.");
            return -1;
     }

     public void searchByName(){
        String name = JOptionPane.showInputDialog("Enter Employee Name to Search:");
        boolean found = false;
        for(int i=0;i<employeeCount;i++){
            if(employees[i].getEmpName().equalsIgnoreCase(name)){
                found = true;
                JOptionPane.showMessageDialog(null, employees[i].display_Emp_info());
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No Employee found with name " + name);
        }
     }
  
     public void searchByJobCategory(){
        String job_cat = JOptionPane.showInputDialog("Enter Employee Job Category to Search:");
        boolean found = false;
        for(int i=0;i<employeeCount;i++){
            if(employees[i].get_Emp_JobCategory().equalsIgnoreCase(job_cat)){
                found = true;
                JOptionPane.showMessageDialog(null, employees[i].display_Emp_info());
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No Employee found with category " + job_cat);
        }
     }


    public static void main(String[] args) {

      

        Client client = new Client();


        while (true) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Add New Employee\n" +
                "2. Update Employee Information\n" +
                "3. Delete Employee Record\n" +
                "4. Search & View Employee by Emp ID\n" +
                "5. Search & View Employee by Name\n" +
                "6. Search & View Employee by Age\n" +
                "7. Search & View Employee by Job Category\n" +
                "8. Exit\n\n" +
                "Enter your choice to proceed:"
            ));
            
            
            
            switch (choice) {
                case 1:
                    client.addEmployee();
                    break;
                case 2:
                client.updateEmployee();
                    break;
                case 3:
                client.deleteEmployee();
                    break;
                case 4:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Emp_ID to update:"));
                client.searchByEmpId(id);
                    break;
                case 5:
                client.searchByName();
                    break;
                case 6:
              //  client.searchByAge();
                    break;
                case 7:
                client.searchByJobCategory();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    System.exit(0);
                default:
                   JOptionPane.showMessageDialog(null, "Invlid Choice. Please select between 1-8");
                    break;
            }
        }
       
           
        }


}

