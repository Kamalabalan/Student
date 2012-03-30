package smsstarter;

import java.util.ArrayList;

public class StudentManagementSystem {

	private StudentRepository repo;
        private SimpleStudentRepository ssr=new SimpleStudentRepository();
        ArrayList<Student> stud =new ArrayList<Student>();

        
        public void listAllStudents() {
            stud=(ArrayList<Student>) ssr.findAllStudents();
            for (int i= 0; i < stud.size(); i++) {
                Student s=stud.get(i);
                System.out.println(s.getFirstName()+  " " + s.getLastName());
            }
		//Get all the students from repository and print them in the screen
	}

	public void registerStudent(Student stu){		          
                ssr.saveStudent(stu);
            }
//Save the new student using repository
	
}
