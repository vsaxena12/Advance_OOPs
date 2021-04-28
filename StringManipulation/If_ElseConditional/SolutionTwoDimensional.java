package If_ElseConditional;

import java.io.*;
import java.math.*;
import java.util.*;


class Result {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */

    public static String[] calculateGrade(int[][] students_marks) {
        int[] sum = new int[students_marks.length];
        String[] retst = new String[students_marks.length];
        int[] ret = new int[students_marks.length];
        int currSum=0;
        for(int i=0;i<students_marks.length;i++){
            currSum=0;
            for(int j=0;j<students_marks[0].length;j++){
                currSum+=students_marks[i][j];
            }
            sum[i]=currSum;
            System.out.println(sum[i]);
        }
        for(int i=0;i<students_marks.length;i++){
        //sum[i]/5;
            if(sum[i]/5>=90) retst[i]="A+";
            else if(sum[i]/5 >= 80 && sum[i]/5 <90) retst[i]="A";
            else if(sum[i]/5 >= 70 && sum[i]/5 <80) retst[i]="B";
            else if(sum[i]/5 >= 60 && sum[i]/5 <70) retst[i]="C";
            else if(sum[i]/5 >= 50 && sum[i]/5 <60) retst[i]="D";
            else retst[i]="F";
        }
        // for(int i=0;i<students_marks.length;i++){
        // }
        return retst;
    }

}

public class SolutionTwoDimensional {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());
		
		
		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for(int i = 0; i < students_marksRows; i++)
        {
			for(int j = 0; j < students_marksColumns; j++)
			{
				students_marks[i][j] = Integer.parseInt(sc.next().trim());				
			}
        }

        String[] result = Result.calculateGrade(students_marks);
		
		for(int i = 0; i < result.length; i++)
        {
			System.out.println(result[i]);
            bufferedWriter.write(result[i]+"\n");
        }       
        bufferedWriter.close();
    }
}

