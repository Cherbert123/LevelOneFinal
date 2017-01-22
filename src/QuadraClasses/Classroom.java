package QuadraClasses;

public class Classroom {
	int classes;
	int bookpg;
	int students;
	int endtime;
	public Classroom(int classes, int bookpg, int students, int endtime ){
		this.classes = classes;
		this.bookpg = bookpg;
		this.students = students;
		this.endtime = endtime;
		
	}
		
	public void startClass(){
	System.out.println("Sit Down, we have " + students + " kids here today");
		
	}
	public void teachClass(){
	System.out.println("Turn to page " + bookpg + " now");
	}
	
	public void leaveClass(){
		System.out.println("Class ends at " +  endtime + " Today");
	}
	
	public static void main(String[] args) {
	Classroom dc = new Classroom(2, 125, 20, 12);
	dc.startClass();
	dc.teachClass();
	dc.leaveClass();
		
	}
}
