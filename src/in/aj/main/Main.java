package in.aj.main;

import java.util.Scanner;

import in.aj.student.Student;
import in.aj.studentmanagement.StudentManagementSystem;

public class Main {
	  public static void main(String[] args) {
	    StudentManagementSystem sms = new StudentManagementSystem();
	    Scanner sc = new Scanner(System.in);
	    int choice;
	    do {
	      System.out.println("--STUDENT MANAGEMENT SYSETM");
	      System.out.println("1.Add Student");
	      System.out.println("2.Show details of all students");
	      System.out.println("3.Search Studnet by Id");
	      System.out.println("4.Update Student");
	      System.out.println("5.Delete Student");
	      System.out.println("0.Exit");
	      System.out.println("Enter your choice");
	      choice = sc.nextInt();
	      sc.nextLine();
	      switch (choice) {
	        case 1:
	          System.out.println("Enter Student Id");
	          int id = sc.nextInt();
	          System.out.println("Enter Student name");
	          String name = sc.next();
	          System.out.println("Enter Student marks");
	          float marks = sc.nextFloat();
	          sms.addStudent(new Student(id, name, marks));
	          break;
	        case 2:
	          sms.displayAllStudent();
	          break;
	        case 3:
	          System.out.println("Enter student id for search");
	          int searchId = sc.nextInt();
	          Student foundStudent = sms.getStudentById(searchId);
	          if (foundStudent == null) {
	            System.out.println("Student with id " + searchId + " does not found");
	          } else

	            System.out.println(foundStudent);
	          break;
	        case 4:
	          System.out.println("Enter student id for search");
	          int updateId = sc.nextInt();
	          if (sms.getStudentById(updateId) != null) {
	            System.out.println("Enter new Student name");
	            String updateName = sc.next();
	            System.out.println("Enter new student marks");
	            float updatedmarks = sc.nextFloat();
	            sms.updateStudent(updateId, new Student(updateId, updateName, updatedmarks));
	          } else {
	            System.out.println("Student with id " + updateId + " does not found");
	          }
	          break;
	        case 5:
	          System.out.println("Enter student id to delete");
	          int deleteId = sc.nextInt();
	          sms.deleteStudent(deleteId);
	          break;
	        case 0:
	          System.out.println("Exiting student management system.Goodbye!");
	          break;
	        default:
	          System.out.println("Invalid choice.Please try again");
	          break;
	      }
	    } while (choice != 0);
	  }
	}

