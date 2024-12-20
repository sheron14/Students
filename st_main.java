abstract class Student {  
    protected String fullName;  
    protected int course;  
    protected double lastExamScore;  
  
    public Student(String fullName, int course, double lastExamScore) {  
        this.fullName = fullName;  
        this.course = course;  
        this.lastExamScore = lastExamScore;  
    }  
    public abstract void writeExam();  
}  
  
class IUStudent extends Student {  
  
    public IUStudent(String fullName, int course, double lastExamScore) {  
        super(fullName, course, lastExamScore);  
    }  
  
    @Override  
    public void writeExam() {  
        System.out.println(fullName + " пишет экзамен по информатике.");  
    }  
}  
  
class MathStudent extends Student {  
  
    public MathStudent(String fullName, int course, double lastExamScore) {  
        super(fullName, course, lastExamScore);  
    }  
  
    @Override  
    public void writeExam() {  
        System.out.println(fullName + " пишет экзамен по математике.");  
    }  
}  
  
public class st_main {  
    public static void main(String[] args) {  
        Student iuStudent = new IUStudent("Иванов Иван Иванович", 2, 85.5);  
        Student mathStudent = new MathStudent("Петров Петр Петрович", 3, 92.0);  
  
        System.out.println(iuStudent);  
        iuStudent.writeExam();  
  
        System.out.println(mathStudent);  
        mathStudent.writeExam();  
    }  
}  
