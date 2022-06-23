package task1;

public class AssociationMain {

	public static void main(String[] args) {
	Company cmp = new Company("Techouts");
	Employee emp = new Employee("Pavan","2022",4);
	Employee2 emp2 = new Employee2("Ram","2021",5);
	
	System.out.println(cmp.getCompanyName()+" "+emp.getName()+" "+emp.getYear()+" "+emp.getRating());
	System.out.println(cmp.getCompanyName()+" "+emp2.getName()+" "+emp2.getYear()+" "+emp2.getRating());
	
	

	}

}
