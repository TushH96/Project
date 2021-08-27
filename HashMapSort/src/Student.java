



public class Student {
	String fname,Lname;
	int id;
	Phone p;
	Student(String fname,String Lname,int id,Phone p){
		this.fname=fname;
		this.Lname=Lname;
		this.id=id;
		this.p=p;
		}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", Lname=" + Lname + ", id=" + id + ", p=" + p + "]";
	}
	
	
}
