package in.aj.studentmanagement;


import java.util.ArrayList;
import java.util.Iterator;
import in.aj.student.Student;
public class StudentManagementSystem {
  private ArrayList<Student> students;

  public StudentManagementSystem() {
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
    System.out.println("Student added sucessfully");
  }

  public Student getStudentById(int id) {
    for (Student stu : students) {
      if (stu.getId() == id) {
        return stu;
      }
    }
    return null;
  }

  public void updateStudent(int id, Student updateStudent) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getId() == id) {
        students.set(i, updateStudent);
        System.out.println("Student updated sucessfully");
        return;
      }
    }
    System.out.println("Student with id" + id + "does not found");
  }

  public void deleteStudent(int id) {
    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      if (student.getId() == id) {
        iterator.remove();
        System.out.println("Student remove successfully");
        return;
      }
    }
    System.out.println("Student with id" + id + "does not found");
  }

  public void displayAllStudent() {
    if (!students.isEmpty()) {
      for (Student stu : students) {
        System.out.println(stu);
        System.out.println("------------------------------");
      }
    } else {
      System.out.println("Students records are empty");
      return;
    }
  }
}

