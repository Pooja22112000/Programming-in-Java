//Display details of students using class
class Record{
	int id;
	String registration_number;
	String name;
	
	void details(){
		id=1;
		registration_number="18MIS0001";
		name="Stu";
		System.out.println("The student id:"+id+"\tregistration_number:"+registration_number+"\tName:"+name);
	}
	
	void display(int id,String registration_number,String name)
	{
		System.out.println("The student id:"+id+"\tregistration_number:"+registration_number+"\tName:"+name);
	}
	
}
	public class StudentRecord{
		public static void main(String[] args){
			Record r1=new Record();
			System.out.println("18MIS0232 A.POOJA");
			System.out.println(r1);
			r1.details();
			r1.display(2,"18MIS0232","Pooja");
		}
	}

	
		
		
		