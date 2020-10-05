/*
*This class is representing the super class. This class has the 
*capability to submit single answer.
*/
import java.util.*;
public class SuperStudent{
    
    private String id = "";
    private Set<String> set =  new HashSet<String>();

    public SuperStudent(int differentAnswers)
    {
        generateID();
        studentAnswer(differentAnswers);
    }
    /*
    *Function to return the id of the student
    */
    public String getId()
    {
        return id;
    }
    /*
    *Function to return the set that represent the students answer
    */
    public Set<String> getAnswer()
    {
        return set;
    }
    /*
    *Function to help future subclass change the value of set
    */
    protected void setAnswer(String value)
    {
        set.add(value);
    }
    /*
    *Function that generates an letter that is going to represent
    *the possible options of the question. Then assigns the value 
    *to a set. Making this protected because only subclass would 
    *need this at most.
    */
    protected void studentAnswer(int differentAnswers)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(); 
        int index = (int)((differentAnswers) * Math.random()); 
        sb.append(AlphaNumericString .charAt(index)); 
        set.add(sb.toString());
    }
    /*
    *Function that generates random ID and associates it
    *with the student ID. Helps with identifying different
    * student answers.
    */
    private void generateID() 
    { 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"+ "abcdefghijklmnopqrstuvxyz"; 
        StringBuilder sb = new StringBuilder(20); 
        for (int i = 0; i < 20; i++)
        {  
            int index = (int)(AlphaNumericString.length() * Math.random()); 
            sb.append(AlphaNumericString .charAt(index)); 
        } 
        this.id = sb.toString(); 
    } 
    /*
    *Function to prints all data of an student. 
    */
    public void printInfo()
    {  
        System.out.println("Student ID: " + id + "\nAnswer " + set);
    }
}