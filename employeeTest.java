class employee{
    private String FirstName;
    private String LastName;
    private double MonthlySalary;
   


public employee(String FirstName,String LastName,double MonthlySalary){
this.FirstName=FirstName;
this.LastName=LastName;
if (MonthlySalary>0.0){
this.MonthlySalary=MonthlySalary;
}
else
{
this.MonthlySalary=0.0;
}
}
//setters
public void setFirstName(String FirstName) {
     this.FirstName=FirstName;
}
public void setLastName(String LastName){
     this.LastName=LastName;
}
public void setMonthlySalary(double MonthlySalary){
if (MonthlySalary>0.0){
this.MonthlySalary=MonthlySalary;
}
else
{
this.MonthlySalary=0.0;
}
}

//getters
public String getFirstName() { return FirstName;}
public String getLastName() { return LastName;}
public double getMonthlySalary() { return MonthlySalary;}
public double getYearlySalary() { return MonthlySalary*12;}
}
public class employeeTest{
public static void main(String[] args){
employee em1=new employee("xyz","mno",9000.00);
employee em2=new employee("abc","pqr",7500.00);

System.out.println("---Employee Details and their initial monthly salaries---");
System.out.println(em1.getFirstName()+" "+em1.getLastName()+ ": "+em1.getYearlySalary());
System.out.println(em2.getLastName()+" "+em2.getLastName() + ": "+em1.getYearlySalary());

em1.setMonthlySalary(em1.getMonthlySalary()*1.10);
em2.setMonthlySalary(em2.getMonthlySalary()*1.10);

System.out.println("---After 10% raise---");
System.out.println(em1.getFirstName()+" "+em1.getLastName()+ ": "+em1.getYearlySalary());
System.out.println(em2.getFirstName()+" "+em2.getLastName() + ": "+em1.getYearlySalary());

}
}


