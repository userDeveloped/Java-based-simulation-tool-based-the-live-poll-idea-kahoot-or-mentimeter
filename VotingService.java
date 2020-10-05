/*
*This class will determine how many people chose different 
*answers as well as what answer they chose.
*/
import java.util.*;
public class VotingService
{
    VotingService(){}
   
    /*
    *A basic naive algorithm to find the occurences of answers
    *given the student array as well as a reference to the question.
    *Additionally it helps find the statistics.
    */
    public void Vote(Student [] student, Question teacher)
    {   
        boolean visited[] = new boolean[student.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < student.length; i++)
        { 
            if (visited[i] == true) 
                continue;       
            int count = 1;
            for (int j = i + 1; j < student.length; j++)
            {  
                if (student[i].getAnswer().equals(student[j].getAnswer()))
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(count + " people choose " + student[i].getAnswer()); 
        }
        System.out.println("\n");
    }
}
