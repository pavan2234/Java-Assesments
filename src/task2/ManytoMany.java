package task2;

public class ManytoMany {
	/*Implement many-many association for Trainee and StudyMaterial.*/
	public static void main(String[] args) {
		StudyMaterial st = new StudyMaterial("CoreJava", "AdvJava", "Html", "Css");
		StudyMaterial st1 = new StudyMaterial("AdvJava","CoreJava",  "Html", "Css");
		StudyMaterial st2 = new StudyMaterial( "AdvJava", "Html","CoreJava", "Css");
		StudyMaterial st3 = new StudyMaterial("AdvJava", "Html", "Css","CoreJava");
		Trainee t1 = new Trainee("Pavan",1);
		Trainee t2 = new Trainee("Ram",2);
		Trainee t3 = new Trainee("Jokey",3);
		Trainee t4 = new Trainee("Lilly",4);
		System.out.println(t1.getName()+t1.getId()+st.Subject1+st.Subject2+st.Subject3+st.Subject4);
		System.out.println(t2.getName()+t2.getId()+st1.Subject1+st1.Subject2+st1.Subject3+st1.Subject4);
		System.out.println(t3.getName()+t3.getId()+st2.Subject1+st2.Subject2+st2.Subject3+st2.Subject4);
		System.out.println(t4.getName()+t4.getId()+st3.Subject1+st3.Subject2+st3.Subject3+st3.Subject4);

	}

}
