
public class Inheritance {
	
	public static class Employee {
		
		private int EmpID;
		private String name;
		private double salary;
		
		public Employee(int empID2, String name2) {
			this.EmpID =empID2;
			this.name = name2;
			System.out.println("imup");
			//this.salary = salary2;
			// TODO Auto-generated constructor stub
		}

		public int getEmpID(){
			return this.EmpID;
		}
		
		public String getname(){
			return this.name;
		}
		
		public double getsalary(){
			return this.salary;
		}
		
		public void setEmpID (int n){
			this.EmpID = n;
		}
		
		public void setname (String n){
			this.name = n;
		}
		
		public void setsalary (double s){
			this.salary =s;
		}
		
		
		
	}
	
	public static class ParmanentEmployee extends Employee {
		private double basePay;
		private double hra;
		private int experience;
		
		ParmanentEmployee(int EmpID, String name,double basePay, double hra, int ex){
			super(EmpID, name);
			this.basePay = basePay;
			this.hra = hra;
			this.experience = ex;
			
		}
		
		public double getbasePay(){
			return this.basePay;
		}
		public double gethra(){
			return this.hra;
		}
		public int getexperience(){
			return this.experience;
		}
		
		public void setbasePay( double basePay){
			this.basePay= basePay;
		}
		public void sethra( double hra){
			this.hra = hra;
		}
		public void setexperience( int ex){
			this.experience = ex;
		}
		
		public void calculateSalary(){
			double v_component ; // variable component. 
			
			if (this.experience < 3){
				v_component = 0 ;
			}else if (this.experience >=3 && this.experience < 5){
				v_component = this.basePay * 0.05;
			}else if(this.experience >=5 && this.experience < 10){
				v_component = this.basePay * 0.07;
			}else {
				v_component = this.basePay * 0.10;
			}
			
			double sal= v_component + this.basePay + this.hra;
			super.setsalary(sal);
			System.out.println("Parmanent Employee: your salary is: "+ super.getsalary());
		}
	}
	
	public static class ContractEmployee extends Employee{
		private double wage;
		private int hours;
		
		ContractEmployee(int EmpID, String name, double wage, int hours){
			super(EmpID, name);
			this.wage = wage;
			this.hours = hours; 
			
		}
		public double getwage(){
			return this.wage;
		}
		public  int gethours(){
			return this.hours;
		}
		public void setwatge(double w){
			this.wage = w;
		}
		public void sethours(int hours){
			this.hours = hours;
		}
		
		public void calculateSalary(){
			double sal= this.hours*this.wage;
			super.setsalary(sal);
			
			System.out.println("contractEmployee: you salary is: "+ super.getsalary());
		}
	}
	

		
		public static void main(String[] args) throws Exception {
			
			// Creating stocks of products
			ContractEmployee e = new ContractEmployee(101,"asif",10,200);
			//Employee e = new Employee(101,"asif");
			e.calculateSalary();
			
			ParmanentEmployee a = new ParmanentEmployee(102,"asif", 10000,1500,3);
			a.calculateSalary();
			
		}
	

}
