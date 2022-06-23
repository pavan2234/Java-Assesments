package task1;

public class Employee2 {
	String name;
	String year;
	int rating;
	Employee2(String name,String year,int rating){
		this.name=name;
		this.year=year;
		this.rating=rating;
	}
	public String getName() {
		return this.name;
	}
	public String getYear() {
		return this.year;
	}
	public Integer getRating() {
		return this.rating;
	}
}