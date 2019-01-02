package Assignment4;

public class CrashCourseCertification extends RRTechnicalCertification {

	CrashCourseCertification(String name, String course, int marks){
		super(name,course,marks);
	}
	
	@Override
	public void generateRegistrationId(){
		super.counter += 2;
		super.setReg_id(super.counter);
		
	}
	@Override
	public double calculateFee(){
		double discount = 0.0;
		double service_tax = 12.36/100;
		if(super.getAdmissionTestMark() > 90){
			discount = (10/100);
		}else if (super.getAdmissionTestMark() >=75 && super.getAdmissionTestMark() <= 89){
			discount= (5/100);
		}
		double total = CRASH_COURSE_FEE*2 + CRASH_COURSE_FEE*service_tax - CRASH_COURSE_FEE*discount;
		return total;
	}
	
	public void display(){
		double fee = calculateFee();
		this.generateRegistrationId();
		System.out.println("*****************Crash Course Registration Details *******************");
		System.out.println("Student Name:" + super.getStudentName());
		System.out.println("Course Name: "+ super.getCourseName());
		System.out.println("Course Duration: 2 months.");
		System.out.println("Registration ID: " + super.getReg_id());
		System.out.println("Fees: "+ fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
