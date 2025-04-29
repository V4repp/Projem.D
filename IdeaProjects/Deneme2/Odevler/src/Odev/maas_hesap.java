package Odev;

public class maas_hesap {
    public static void main(String[] args) {
        /*4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year. ok

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0 */

        double hourlyRate = 70;
        int weeklyHours = 40;
        double stateTaxRate = 10;
        double federalTaxRate = 30;

        double gross_pay = hourlyRate * weeklyHours * 52;
        System.out.println("gross_pay = " + gross_pay);
        double federal = gross_pay * federalTaxRate / 100;
        System.out.println("federal = " + federal);
        double state = gross_pay * stateTaxRate / 100;
        System.out.println("state = " + state);
        double totalTaxRate = state + federal;
        //Yüzde Hesaplama Formülü : A Saysının % B'si = A x B / 100
        double netIncomeIs =gross_pay- totalTaxRate;

        System.out.println("netIncomeIs = " + netIncomeIs);


    }

}
