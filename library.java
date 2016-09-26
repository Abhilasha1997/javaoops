package com.library;

 public class library {
	 	int refrence_tym;
	 	int lending_tym;
	 	int digital_tym;
	 	
	 	
	 	public int getRefrence_tym() {
			return refrence_tym;
		}

		public int getLending_tym() {
			return lending_tym;
		}

		public int getDigital_tym() {
			return digital_tym;
		}

		

		

 	public library(int refrence_tym, int lending_tym, int digital_tym) 
 	{
			
			this.refrence_tym = refrence_tym;
			this.lending_tym = lending_tym;
			this.digital_tym = digital_tym;
			
		}

	void refrencebook()
 	{
 		if(refrence_tym<4)
 			System.out.println("can sit");
 		else
 			System.out.println("cannot");
 	}
	
	void lendingbook()
	{
		if(lending_tym<15)
			System.out.println("can lend book");
		else
		{
			if(lending_tym>15&&lending_tym<21)
				System.out.println("penalty 20");
			else if(lending_tym>22&&lending_tym<29)
				System.out.println("penalty 50");
			else if(lending_tym>29&&lending_tym<30)
				System.out.println("penLTY 150");
			else
				System.out.println("penalty 300");
		}
	}
	void digitallibrary()
	{
		if(digital_tym>4&&digital_tym<6)
			System.out.println("allowed");
		else
			System.out.println("not allowed");
	}
	
	}
	
		
	
