import java.util.Scanner;
public class GradeCalculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subject(less than 10) : ");
        int subjectNum = sc.nextInt();

        int[] marks = new int[subjectNum];
        int totalmarks = 0;
        System.out.println("Enter marks obtain in each subject(Out of 100)");

        for (int i=0 ;i<subjectNum ;i++)

         {
            System.out.println("Enter marks in subject"+(i+1)+" :");
            marks[i]= sc.nextInt();
            totalmarks = totalmarks + marks[i];
        }
        System.out.println("The Total marks of each subject is :" + totalmarks);
        sc.close();

        double avgper = (double) totalmarks/(subjectNum * 100)*100;
        System.out.println("Your Average percentage is = "+ avgper + "%");

        System.out.print("The Student grade is: ");
        if(avgper>=80)
        {
            System.out.print("A");
        }
        else if(avgper>=60 && avgper<80)
        {
           System.out.print("B");
        } 
        else if(avgper>=40 && avgper<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
    
    
    



