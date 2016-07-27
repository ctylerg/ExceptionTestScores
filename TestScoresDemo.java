//java app for an exception
public class TestScoresDemo {
  public static void main(String[] args){

    double[] test = {80, 90, 70 ,60}; // array w/ all good scores
    double[] tests = {-80, 90, 70, 60}; // array w/ a bad test score
    double[] testa = {80, 101, 70, 60}; // array w/ a bad test score

    try{
      TestScores grade = new TestScores(test);
      System.out.println("The average grade is: " + grade.getAvg());
    }
    catch(IllegalArgumentException e){
      System.out.println("An invalid test score was found.\n" + e.getMessage());
    }

    try{
      TestScores grade = new TestScores(tests);
      System.out.println("The average grade is: " + grade.getAvg());
    }
    catch(IllegalArgumentException e){
      System.out.println("An invalid test score was found.\n" + e.getMessage());
    }

    try{
      TestScores grade = new TestScores(testa);
      System.out.println("The average grade is: " + grade.getAvg());
    }
    catch(IllegalArgumentException e){
      System.out.println("An invalid test score was found.\n" + e.getMessage());
    }

  }

}
