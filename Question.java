/*
*This class is going to help with having an organized question 
*and answers.
*/
import java.util.*;
public class Question
{   
    private char marker = 'A';
    private String theQuestion = "";
    private HashMap<Character, String> answers = new HashMap<Character, String>(); 

    Question(){}

    /*
    *Function to return the question teacher has asked
    */
    public String askQuestion()
    {
        return theQuestion;
    }
    /*
    *Function to get question and place it in a variable theQuestion
    */
    public void setQuestion(String teacherQuestion)
    {
        theQuestion = teacherQuestion;
    }
    /*
    *Function to print the value of theQuestion
    */
    public void getQuestion()
    {
        System.out.println(theQuestion);
    }

    /*
    *Function to assign answer and answer keys to a hashmap
    */
    public void setAnswers(String... teacherAnswer )
    {
        for(String i : teacherAnswer)
        {
            answers.put(marker,i);
            marker++; 
        }
    }
    /*
    *Function to return the size of hashmap
    */
    public int returnSize()
    {
        return answers.size();
    }
    /*
    *Function to return the hashmap which contains the answers and answers keys
    */
    public HashMap<Character, String> getTheMap()
    {
        return answers;
    }
}  