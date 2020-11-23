import org.joda.time.DateTime;


/**
 *
 * @author tgord
 */
public class Main {
    public static void main(String[] args) {
       
                // Creating mock courses
		Course course1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-30T00:00:00Z"));
		Course course2 = new Course("3BP", new DateTime("2015-08-01T00:00:00Z"), new DateTime("2021-07-1T00:00:00Z"));
                
                // Creating mock modules
		Module module1 = new Module("Software Engineering 3", "CT417");
		Module module2 = new Module("Machine Learning", "CT418");
		Module module3 = new Module("System on Chip", "CT419");
		Module module4 = new Module("Digital Signal Processing", "CT420");
		Module module5 = new Module("Telecommunications Software Applications", "CT421");
                Module module6 = new Module("BE Project", "CT422");
                
                //setting module IDs
                
                
		// Creating mock students
		Student student1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		Student student2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		Student student3 = new Student("MikeTyson", 22, "02-02-98", 19823746);
		Student student4 = new Student("JoeRogan", 22, "04-04-98", 00001111);
		Student student5 = new Student("JohnDelaney", 22, "05-05-98", 00000002);

		// Adding modules to a course
		course1.addModules(module1);
		course1.addModules(module2);
		course1.addModules(module3);
		course2.addModules(module4);
		course2.addModules(module5);
		course2.addModules(module6);

		// Registering Students to Courses
                student1.setCourses(course1);
                student2.setCourses(course1);
                student3.setCourses(course1);
                student4.setCourses(course2);
                student5.setCourses(course2);

		// Adding students to modules

		// Printing out results.
                System.out.println("Course_1:");
		System.out.println(course1.toString());
		System.out.println("*********************************");
                System.out.println("Course_2:");
		System.out.println(course2.toString());
                System.out.println("*********************************");
                System.out.println("Students:");
                System.out.println(student1.toString());
                System.out.println("*********************************");
                System.out.println(student2.toString());
                System.out.println("*********************************");
                System.out.println(student3.toString());
                System.out.println("*********************************");
                System.out.println(student4.toString());
                System.out.println("*********************************");
                System.out.println(student5.toString());

	}
    
}
