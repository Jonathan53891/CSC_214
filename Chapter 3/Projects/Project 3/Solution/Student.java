public class Student 
{
  public Student(String name){
    super();
    this.name=name;
    this.quizNumber=0;
    this.quizScore=0;
}
public String getName()
{
  return name;
}
public void addQuiz(int score)
{
  this.quizScore+=score;
  quizNumber++;
}
public int getTotalScore()
{
  return quizScore;
}
public double getAverageScore()
{
  return (double)quizScore/quizNumber;
}

private String name;
private int quizScore;
private int quizNumber;

}
