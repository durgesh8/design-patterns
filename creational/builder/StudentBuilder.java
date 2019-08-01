package creational.builder;

public class StudentBuilder {

	public static void main(String[] args) {
	    Student.Builder builder=new Student.Builder();
	    builder.id(1).address("Bangalore");
	    Student st=new Student(builder);
	    System.out.println(st.getId());
	    System.out.println(st.getName());
	    builder.address("kAR");
	    System.out.println(st.getAddress());
	    st=new Student(builder);
	    System.out.println(st.getAddress());
	    
	   
	}
}
