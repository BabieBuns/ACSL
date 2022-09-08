import java.util.*;

public class IN_1112_C1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] annualSalary = new double[10];
		double[] salaryPerGame16 = new double[10];
		double[] salaryPerGame18 = new double[10];
		for (int i = 0; i < 10; i++) {
			String[] str = in.nextLine().split(", ");
			int year = Integer.parseInt(str[0]);
			double salary = Double.parseDouble(str[1]) * 1000000.0;
			annualSalary[i] = salary / year;
			salaryPerGame16[i] = annualSalary[i] / 16;
			salaryPerGame18[i] = annualSalary[i] / 18;
		}
		in.close();

		
		
		// 1:
		double averageAnnualSalary = 0;
		for (int i = 0; i < 10; i++) {
			averageAnnualSalary += annualSalary[i];
		}
		averageAnnualSalary /= 10;
		System.out.println((int) averageAnnualSalary);

		
		
		// 2:
		double largestAnnualSalary = 0;
		int index = 0;
		for (int i = 0; i < 10; i++) {
			if (annualSalary[i] > largestAnnualSalary) {
				largestAnnualSalary = annualSalary[i];
				index = i;
			}
		}
		System.out.println((int) largestAnnualSalary + " by #" + (index + 1));

		
		
		// 3:
		double highestSalaryPerGame16 = Double.MIN_VALUE;
		double lowestSalaryPerGame16 = Double.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			if (salaryPerGame16[i] > highestSalaryPerGame16) {
				highestSalaryPerGame16 = salaryPerGame16[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			if (salaryPerGame16[i] < lowestSalaryPerGame16) {
				lowestSalaryPerGame16 = salaryPerGame16[i];
			}
		}
		System.out.println((int) (highestSalaryPerGame16 - lowestSalaryPerGame16));

		
		
		// 4:
		double highestSalaryPerGame18 = Double.MIN_VALUE;
		double lowestSalaryPerGame18 = Double.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			if (salaryPerGame18[i] > highestSalaryPerGame18) {
				highestSalaryPerGame18 = salaryPerGame18[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			if (salaryPerGame18[i] < lowestSalaryPerGame18) {
				lowestSalaryPerGame18 = salaryPerGame18[i];
			}
		}
		System.out.println((int) ((highestSalaryPerGame18 + lowestSalaryPerGame18) / 2));

		
		
		// 5:
		double averageSalaryPerGame16 = 0.0;
		double averageSalaryPerGame18 = 0.0;
		for (int i = 0; i < 10; i++) {
			averageSalaryPerGame16 += salaryPerGame16[i];
		}
		for (int i = 0; i < 10; i++) {
			averageSalaryPerGame18 += salaryPerGame18[i];
		}
		averageSalaryPerGame16 /= 10;
		averageSalaryPerGame18 /= 10;
		System.out.println((int) (averageSalaryPerGame16 - averageSalaryPerGame18));
	}
}
