package ac.in.kletech;

public class cricketplayer{
	private String sname;
	private int noofinnings;
	private int totalRuns;
	private float bataverage;
	cricketplayer[] c=new cricketplayer[5];
	public String getSname() {
		return sname;
	}
	public int getNoofinnings() {
		return noofinnings;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public float getBataverage() {
		return bataverage;
	}
	public cricketplayer(String sname, int noofinnings, int totalRuns,
			float bataverage) {
		super();
		this.sname = sname;
		this.noofinnings = noofinnings;
		this.totalRuns = totalRuns;
		
		this.bataverage = bataverage;
		
	}
	void createCricketplayer(){
		c[0]=new cricketplayer("MSDhoni",2,100,65.7f);
		c[1]=new cricketplayer("Gayle",2,150,90.7f);
		c[2]=new cricketplayer("Suresh Raina",2,80,80.7f);
		c[3]=new cricketplayer("yuvraj",2,80,50.7f);
		c[4]=new cricketplayer("virat",2,150,55.7f);
		
	}
	static void sortplayer(cricketplayer[] c )
	{
		cricketplayer temp=new cricketplayer(null, 0, 0, 0);
		temp=null;
		for(int j=0;j<c.length;j++)
		{
		for(int k=1;k<=(c.length-1);k++)
		{
			if(c[k-1].totalRuns<c[k].totalRuns)
			{
				temp=c[k-1];
				c[k-1]=c[k];	
				c[k]=temp;
			}
		}
		
		System.out.println(c[j-1].toString());
		}
	}
	public void print(){
		for(int j=0;j<c.length;j++)
		{
			System.out.println("crickter name"+sname);
			System.out.println("no of innings"+noofinnings);
			System.out.println("total runs"+totalRuns);
			System.out.println("batavg"+bataverage);
			
			
		}
		
		
		
	}
	
	
}
