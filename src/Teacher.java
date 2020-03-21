
public class Teacher {
	double totalMarks=0;
	double mathMarks=0;
	double scienceMarks = 0;
	double socialScienceMarks = 0;
	double englishMarks = 0;
	double HindiMarks = 0;
	double percentage = 0;
	
	public double totalMarks(String name)
	{
		switch (name)
		{
		case "Saurabh" :
			mathMarks = 98.5;
			scienceMarks = 92;
			socialScienceMarks = 89.5;
			englishMarks = 67;
			HindiMarks = 82;
			totalMarks = mathMarks+scienceMarks+socialScienceMarks+englishMarks+HindiMarks;
			break;
			
		case "Gaurav" :
			mathMarks = 91.5;
			scienceMarks = 72;
			socialScienceMarks = 99.5;
			englishMarks = 87;
			HindiMarks = 62;
			totalMarks = mathMarks+scienceMarks+socialScienceMarks+englishMarks+HindiMarks;
			break;
			
		default:
			System.out.println("No record found");
		
		}
		
		return totalMarks;
						
	}
	
	public double percentageCalculator(String name)
	{
		double marks = totalMarks(name);
		percentage=marks/5;
		return percentage;
	}
}
