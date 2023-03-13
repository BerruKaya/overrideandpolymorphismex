public class Main{
  public static void main(String[] args){
    BaseCreditManager[] creditmanagers=new BaseCreditManager[]
    {new TeacherCreditManager(), new StudentCreditManager()};
    
    for(BaseCreditManager creditmanager: creditmanagers){
      System.ou.prntln(creditmanager.calculate(12.000));
    }
