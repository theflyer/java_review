
public class interface_practice {
	
	interface Student {
		int TOTAL_MAX_MARKS = 400;
		void calcPercentage();
		
	}
	
	public static class Intern implements Student{
		
		private int marksSecured;
		private int projectMarks;
		
		Intern (int marks, int proj_marks){
			this.marksSecured=marks;
			this.projectMarks=proj_marks;
		}
		
		public void calcPercentage(){
			int total = this.marksSecured + this.projectMarks;
			double percentage = (total*100)/TOTAL_MAX_MARKS;
			
			System.out.println("The total addregate percentage secured by the intern is "+ percentage);
		}
	}
	public static class Trainee implements Student{
		
		private int marksSecured;
		
		Trainee(int marks){
			this.marksSecured=marks;
		}
		
		public int getMarksSecured() {
			return marksSecured;
		}

		public void calcPercentage(){
			double perc = (this.marksSecured*100)/TOTAL_MAX_MARKS;
			//System.out.println( TOTAL_MAX_MARKS);
			System.out.println("The total addregate percentage secured by the trainee is "+ perc);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern in1 = new Intern(283,77);
		Trainee t1 = new Trainee (370);
		//System.out.println(t1.getMarksSecured()/400);
		//double n = (double)((377*100)/400);
		//System.out.println(n);
		in1.calcPercentage();
		t1.calcPercentage();
	}

}
