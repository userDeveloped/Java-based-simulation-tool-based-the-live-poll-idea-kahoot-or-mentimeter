/*
*This class is sub class of SuperStudent. The only additional
*functionalities it brings is multiple answer capability as
*well as allowing the student to resubmit their answers.
*/
import java.util.*;
public class Student extends SuperStudent
{
    private int difAns;
    /*
    *Basic constructor that calls the super class
    */
    public Student(int differentAnswers)
    {
        super(differentAnswers);
        difAns = differentAnswers;
    }
    /*
    *Function that generates multiple no repeating answer
    *for question with more than one answers.
    */
    public void setMultiAnswer()
    {   
        super.getAnswer().clear();
        Random rand = new Random();
        int multiAnswers = rand.nextInt(difAns - 1 + 1) + 1;
        for(int i =0 ; i < multiAnswers; i++)
          super.studentAnswer(difAns);
    }
    /*
    *Function allows for resubmission while the old answer
    *gets removed.
    */
    public void resubmit(String [] newAnswer)
    {
        super.getAnswer().clear();
        for(int i = 0 ; i < newAnswer.length ; i++)
            super.setAnswer(newAnswer[i]);
        
    }
}