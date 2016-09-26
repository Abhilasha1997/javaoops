package in.ac.kletech;

public class University {
	final static String CETCODE="E30 and E241";
	school[] a=new school[8];
	static
	{
		System.out.println("kle tech university");
	}
	class school{
		private int programcode;
		private String schoolCoordinator;
		private int noofstud;
		private int noofstaff;
		public int  getProgramcode() {
			return programcode;
		}
		public String getSchoolCoordinator() {
			return this.schoolCoordinator;
		}
		public int getNoofstud() {
			return this.noofstud;
		}
		public int getNoofstaff() {
			return this.noofstaff;
		}
		public school(int programcode, String schoolCoordinator,
				int noofstud, int noofstaff) {
			super();
			this.programcode = programcode;
			this.schoolCoordinator = schoolCoordinator;
			this.noofstud = noofstud;
			this.noofstaff = noofstaff;
			
			
			
		}
	
	}
	void calculate(){
		int i=0;
		for(int j=0;j<8;j++){
			
		if(a[j].getNoofstud()>120)
			System.out.println("exceeded in "+a[j].getProgramcode());
		
		else{
			
			i=a[j].getNoofstud();
			System.out.println("total no student "+i+" in "+a[j].programcode);
		}
		}
	}
		void createSchool(){
			a[0]=new school(1, "aadil", 120, 20);
			a[1]=new school(2, "bb", 240,10);
			a[2]=new school(3,"ee",30,14);
			a[3]=new school(4,"qq",110,30);
			a[4]=new school(5, "aa", 190,40);
			a[5]=new school(6,"dd",247,12);
			a[6]=new school(7,"rr",210,13);
			a[7]=new school(8,"pp",110,14);
			
		}
	
		
	}

