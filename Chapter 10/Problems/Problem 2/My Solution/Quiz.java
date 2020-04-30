public class Quiz implements Measurable
{
  private double score;
  private String grade;
  public Quiz(double aScore, String aGrade)
  {
    score = aScore;
    grade = aGrade;
  }
  public double getScore()
  {
    return score;
  }
  public String getGrade()
  {
    return grade;
  }
  public double getMeasure()
  {
    return score;
  }
}
