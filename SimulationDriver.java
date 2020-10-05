public class SimulationDriver
{
    public static void main(String [] args)
    {

        
        // TYPE 1 QUESTION
        String [] answersFromTeacher2 = {"True","False"};
        System.out.println("\nTYPE 1 QUESTION\n");
        Question teacher1 = new Question();
        Student theStudents1 []  = new Student[20];
        VotingService vote1 = new VotingService();

        for(int i = 0 ; i < theStudents1.length ; i++)
        {
            theStudents1[i] = new Student(answersFromTeacher2.length);
        }
        
        teacher1.setQuestion("Can dogs fly? ");
        teacher1.setAnswers(answersFromTeacher2);
        teacher1.getQuestion();
        System.out.println(teacher1.getTheMap());
        vote1.Vote(theStudents1, teacher1);







        // TYPE 2 QUESTION
        String [] answersFromTeacher1 = {"15","23","31","30"};
        System.out.println("TYPE 2 QUESTION\n");
        Question teacher = new Question();
        Student theStudents []  = new Student[20];
        VotingService vote = new VotingService();

        for(int i = 0 ; i < theStudents.length ; i++)
        {
            theStudents[i] = new Student(answersFromTeacher1.length);
        }

        teacher.setQuestion("What is 15+15? ");
        teacher.setAnswers(answersFromTeacher1);
        teacher.getQuestion();
        System.out.println(teacher.getTheMap());
        vote.Vote(theStudents, teacher);





        

        // TYPE 3 QUESTION
        String [] answersFromTeacher3 = {"2","1","-2","0"};
        System.out.println("TYPE 3 QUESTION\n");
        Question teacher2 = new Question();
        Student theStudents2 []  = new Student[20];
        VotingService vote2 = new VotingService();

        for(int i = 0 ; i < theStudents2.length ; i++)
        {
            theStudents2[i] = new Student(answersFromTeacher3.length);
            theStudents2[i].setMultiAnswer();
        }

        teacher2.setQuestion("What is x? 2x+1=5 ");
        teacher2.setAnswers(answersFromTeacher3);
        teacher2.getQuestion();
        System.out.println(teacher2.getTheMap());
        vote2.Vote(theStudents2, teacher2);
        





        // EXAMPLE WITH RESUBMISSION
        String [] answersFromTeacher4 = {"Biden","Trump","Bruce Lee","Obama"};
        System.out.println("TYPE 4 QUESTION\n");
        Question teacher3 = new Question();
        Student theStudents3 []  = new Student[20];
        VotingService vote3 = new VotingService();

        for(int i = 0 ; i < theStudents3.length ; i++)
        {
            theStudents3[i] = new Student(answersFromTeacher4.length);
        }

        teacher3.setQuestion("What is the current president? ");
        teacher3.setAnswers(answersFromTeacher4);
        teacher3.getQuestion();
        System.out.println(teacher3.getTheMap());


        // First student wants to change the answer 
        System.out.println("The first student original answer is : " + theStudents3[0].getAnswer()); // the original answers
        String [] newA = new String[]{"D"};    // the new answers
        theStudents3[0].resubmit(newA);        // replacing the old answer
        System.out.println("The first student resubmission answer is : " + theStudents3[0].getAnswer()); // showing the new answer

        vote3.Vote(theStudents3, teacher3);



        
    }
}

