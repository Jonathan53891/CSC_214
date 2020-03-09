public class Main 
{
  public static void main(String[] args) 
  {
    Student student = new Student("StudentName1");
    student.addQuiz(85);
    student.addQuiz(70);
    student.addQuiz(90);
    student.addQuiz(80);
    student.addQuiz(86);

    System.out.println("Student: "+student.getName());
    System.out.println("Total quiz score: "+student.getTotalScore());
    System.out.println("Average quiz score: "+student.getAverageScore());
  }
}
