public class EmpWageComputation
{
        public static final int WAGE_PER_HR=20;
        public static void main(String[] args)
        {
                int IS_PRESENT=1;
                int salary,workingHr=0;
                double empCheck=Math.floor(Math.random()*10)%2;
                if (empCheck==IS_PRESENT)
                {
                        System.out.println("Employee is Present");
                        workingHr=8;
                }
                else
                {
                        System.out.println("Employee is Absent");
                }
                salary=workingHr*WAGE_PER_HR;
                System.out.println("Employee Wage: "+salary);
        }

}
