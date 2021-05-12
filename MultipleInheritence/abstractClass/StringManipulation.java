package abstractClass;

import java.util.ArrayList;

public class StringManipulation {
	
	public static void returnValidStringFormat(String str)
	{
		ArrayList<String> listMarksCredentails = new ArrayList<String>();
		ArrayList<String> listMarks = new ArrayList<String>();
		
		String marks[] = str.split("\\|");
		
		String gradePoint[] = marks[0].split(",");
		
		int marksSum = 0;
		
		
		for(int i=0; i<gradePoint.length; i++)
		{
			//System.out.println(gradePoint[i]);
			String gradePointMarks[] = gradePoint[i].split(" ");
			for(int j=0; j<gradePointMarks.length; j++)
			{
				System.out.println(gradePointMarks[j]);
				if(j%2 != 0)
				{
					listMarksCredentails.add(gradePointMarks[j]);
				}
				else
				{
					listMarks.add(gradePointMarks[j]);
				}
			}
		}
		
		System.out.println(listMarksCredentails);
		System.out.println(listMarks);
		
		String NCC[] = marks[1].split(",");
		for(String s: NCC)
			System.out.println(s);
		
		
		if(NCC[0].equals("1"))
		{
			listMarks.add(NCC[1]);
			listMarksCredentails.add(NCC[2]);
		}
		
		System.out.println(listMarksCredentails);
		System.out.println(listMarks);
		
		//String aid = null;
		//String markCode[] = marks[0];
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnValidStringFormat("100 5,100 5,100 5|0,100,5|0,20,4");
	}

}
