import java.util.*;
import javax.swing.JOptionPane;

public class AssignGradeUsingStack {
    private Stack<Double> scoreStack = new Stack<Double>(); // Stack to hold scores
    private double best = 0;                    // The best score
    private double score = 0;                   // Raw score
    private char grade;                         // The grade
    
    /** Creates a new instance of AssignGradeUsingStack 
     * Read in various scores, find max, find max posn, print
     */
    public AssignGradeUsingStack() { 
        do{                 //Read scores and find the best score
            String scoreString = JOptionPane.showInputDialog(null,
                "Please enter a new score for student stack demo" + "\nA negative score terminates input",
                "Example Input", JOptionPane.QUESTION_MESSAGE);
            
            score = Double.parseDouble(scoreString);    //Convert string into double
            
            if (score >= 0 ){ 
                scoreStack.push(new Double(score));     //Add score to Stack
                if(score > best){best = score; }        //Find the best score
            }
        } while (score >= 0);
    
        //Prepare the output string
        String output = "There are a total " + scoreStack.size() + " students";
        
        // Find the position of the highest mark
        int bestPosn = scoreStack.search(best);
        output += "\nBest score is at posn " + bestPosn;

        int i = scoreStack.size();             // Get the stack size
        while (!scoreStack.empty())            // Assign and display grades
        {
            score = scoreStack.pop();   //Get mark from the Stack
            if(score >= best * 0.90)      grade = 'A';
            else if(score >= best * 0.80) grade = 'B';
            else if(score >= best * 0.70) grade = 'C';
            else if(score >= best * 0.60) grade = 'D';
            else                        grade = 'F';
            output += "\nStudent " + i-- + " score is " + score +
                    " and grade is " + grade;           // Add to string
        }
        JOptionPane.showMessageDialog(null, output, "Example Output",
                JOptionPane.INFORMATION_MESSAGE);
    }    
}