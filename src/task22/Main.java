package task22;

public abstract class Main implements Company{

	public static void main(String[] args) {
		Company c =(sp,cp,name)->{
			int profit = sp-cp;
			return profit+ " "+name;
		};
		System.out.println(c.getCompanyDetails(600,79,"Pavan"));
	}
}
