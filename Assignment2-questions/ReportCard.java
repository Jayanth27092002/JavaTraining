package questions;
import java.util.*;

public class ReportCard {

    private String firstName;
    private String lastName;
    private String studentClass;
    private Map<String, Double> grades;

    public ReportCard(String firstName, String lastName, String studentClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentClass = studentClass;
        this.grades = new HashMap<>();
    }

    public void setGrade(String subject, Double grade) {
        grades.put(subject, grade);
    }

    public double getGrade(String subject) {
        return grades.getOrDefault(subject, 0.0);
    }

    public double avgGrades() {
        double total = 0;
        if (grades.isEmpty()) {
            return total;
        }

        for (double grade : grades.values()) {
            total += grade;
        }

        return total / grades.size();
    }

    public void printReport() {
        System.out.println("\n=============================");
        System.out.println("        Report Card");
        System.out.println("=============================");
        
        
        System.out.println(String.format("Name: %s %s", firstName, lastName));
        System.out.println("Class: " + studentClass);
        System.out.println("-----------------------------");

       
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Subject Grades:");
            for (Map.Entry<String, Double> entry : grades.entrySet()) {
                System.out.printf("%-15s : %.2f\n", entry.getKey(), entry.getValue());
            }
        }

       
        double avgGrade = avgGrades();
        System.out.println("\nAverage Grade: " + String.format("%.2f", avgGrade));
        printPerformance(avgGrade);
        
        System.out.println("=============================");
    }

    
    private void printPerformance(double avgGrade) {
        if (avgGrade > 90) {
            System.out.println("Outstanding performance. Keep it up!");
        } else if (avgGrade > 80) {
            System.out.println("Good performance.");
        } else if (avgGrade > 70) {
            System.out.println("Good. Can be improved.");
        } else if (avgGrade > 60) {
            System.out.println("Improvement is needed. Work hard.");
        } else {
            System.out.println("Very bad. Work harder.");
        }
    }

    
    public static ReportCard collectStudentDetails(Scanner sc) {
    	System.out.println("Enter first name:");
        String firstName = sc.next();
        System.out.println("Enter last name:");
        String lastName = sc.next();
        System.out.println("Enter class name:");
        String studentClass = sc.next();

        ReportCard student = new ReportCard(firstName, lastName, studentClass);

       
        System.out.println("Enter subject grades now:");

        System.out.println("Maths: ");
        Double gradeMaths = sc.nextDouble();
        student.setGrade("Maths", gradeMaths);

        System.out.println("Science: ");
        Double gradeScience = sc.nextDouble();
        student.setGrade("Science", gradeScience);

        System.out.println("English: ");
        Double gradeEnglish = sc.nextDouble();
        student.setGrade("English", gradeEnglish);

        return student;
    }

	
	public static void main(String[] args) {
		System.out.print("Enter number of students grades you want to enter: ");
		Scanner sc=new Scanner(System.in);
		int numStudents=sc.nextInt();
		List<ReportCard> students= new ArrayList<>();
		
		for (int i = 1; i <= numStudents; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Enter details for student " + i + ":");
            ReportCard student = collectStudentDetails(sc);
            students.add(student);
        }
		
		System.out.println("\nAll Student Report Cards:");
        for (ReportCard student : students) {
            student.printReport();
            System.out.println("-----------------------------------");
        }

        sc.close();
    
		
		
		
	}
	
	
	
	
	

}
