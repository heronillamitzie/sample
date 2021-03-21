public class Studentdetails

public static void main(string[]args){

	Student students[] = new Student[3];
	//method 1
	students[0] = new Student();
	students[0].name = " Allan ";
	//method 2 
	students[0].marks = 80;
	//method 3
	students[0].section = 'A';
         //method 7
        students[2] = new Student();
        students[2].name = "Mitzie";
         //method 8
        students[2].marks = 85;
         //method 9
        students[2].section = 'A';



for (int a = 0; a < students.length; i++){
	System.out.println(students[a].name + " in section " + students[a].section + " got " + students[a].marks + " marks. ");
}
}
}
class Student{
	string name;
	int marks;
	char section;
}
