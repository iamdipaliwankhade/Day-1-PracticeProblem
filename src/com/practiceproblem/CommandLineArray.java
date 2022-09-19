package com.practiceproblem;
/**
 * 
 * @author Dipali
 *
 */
public class CommandLineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0,num,count=0;
		
		for(int i=0; i<args.length;i++) {
			System.out.println("args["+i+"]="+args[i]);
		
			try {
				num = Integer.parseInt(args[i]);
				sum+=num;
			}
			catch(NumberFormatException nfe)
			{
				System.out.println(nfe.getMessage());
				 count++;
			}
	System.out.println("Sum of command line argument ="+sum);
	System.out.println("Number of invalid integers entered="+count);
			}
		

	}

}
