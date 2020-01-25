package SelfStudy;

public class SelfStudyArrays2 {

	public static void main(String[] args) {
	    int sum=0;
		int salary[]= {2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900};
for (int empSalary : salary) {
	sum=sum+empSalary;
	
}
	System.out.println(sum);
	}

}
