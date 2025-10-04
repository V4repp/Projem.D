package SecondHomework;

public class EmployeeInfo {
    /*Declare the following variables:
			employeeName (String)
			age (int)
			gender (char)
			companyName (String)
			jobTitle (String)
			yearsOfExperience (double)
			salary (int)
			isFullTime (boolean)
			isMarried (boolean)
			employeeId (String)*/

    /*Display the full employee information in the following format.

            Example:
                employeeName = "Shay";
                age = 24;
                gender = 'F';
                companyName = "Apple Inc";
                jobTitle = "SDET";
                yearsOfExperience = 2.5;
                salary = 120_000;
                isFullTime = true;
                isMarried = false;
                employeeId = "B101";

            Output:
                Employee name: Shay
                Gender: F
                Age: 24
                Employee ID: B101
                Job title: SDET
                Company name: Apple Inc
                Full time: true
                Years of work experience: 2.5 years
                Salary: $120000.0
                Married: false*/
    public static void main(String[] args) {
        String empolyeeName="Muhammet Ali";
        System.out.println("Employee name = " + empolyeeName);

        int age = 25;
        System.out.println("Age = " + age);

        char gender = 'M';
        System.out.println("Gender = " + gender);

        String companyName = "Microsoft Inc";
        System.out.println("Company name = " + companyName);

        String jobTitle ="SDE";
        System.out.println("Job title = " + jobTitle);

        double yearsOfExperience = 5.5;
        System.out.println("Years of experience = " + yearsOfExperience);

        int salary = 143000;
        System.out.println("Salary = " + salary);

        boolean isFullTime= true ;
        System.out.println("Is full time = " + isFullTime);

        boolean isMarried = false ;
        System.out.println("Is married = " + isMarried);

        String employeeId="M043";
        System.out.println("Employee ID = " + employeeId);

    }
}
