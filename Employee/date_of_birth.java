package Employee;

public class date_of_birth{

    private int day;
    private int month;
    private int year;

    public  void set_date_of_birth(int d,int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void get_date_of_birth(){
        System.out.println("Date of birth of Emp_id is: " + this.day + "-" + this.month+ "-"+this.year);
    }
}