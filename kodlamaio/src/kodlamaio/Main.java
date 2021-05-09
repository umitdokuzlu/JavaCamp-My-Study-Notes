package kodlamaio;

public class Main {

	public static void main(String[] args) {
				
		Student student2 = new Student();
		student2.setFirstName("ümit");
		student2.setLastName("Dokuzlu");
		
		User user=new User();
		user.setFirstName("melih");
		user.setLastName("yıldırım");
		
		Instructor instructor=new Instructor();
		instructor.setFirstName("engin");
		instructor.setLastName("demiroğ");
		
		PersonManager personManager = new PersonManager();
		
		BasePerson[] students={student2};
		BasePerson[] users={user};
		BasePerson[] instructors={instructor};

		personManager.registerMulti(users, new UserManager());
		personManager.registerMulti(students, new StudentManager());
		personManager.registerMulti(instructors, new InstructorManager());


	}

}
