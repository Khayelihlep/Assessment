import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Emplyees: ");
		int n = sc.nextInt();
		Employee emp[] = new Employee[n];
		for(int i=0; i<n; i++) {
			emp[i] = new Employee();
			emp[i].getData();
		}
		System.out.print("Search (eg. Khaya or 20190907): ");
		String srch = sc.next();
		sc.close();
		int c=0;
		for(int i=0; i<n; i++) {
			if(emp[i].searchBot(srch)) {
				emp[i].displayData();
				c++;
			}
		}
		if(c==0)
			System.out.println("No such element found");
	}
}