public class EmpWageComputation
{
        public static final int WAGE_PER_HR=20;
        public static final int PART_TIME=2;
        public static final int FULL_TIME=1;


        public static void main(String[] args)
        {
                int salary,workingHr=0;
                int random=(int)Math.floor(Math.random()*10)%3;
                System.out.println(random);

                if(FULL_TIME==random)
                {
                	System.out.println("Full time Employee");
		        workingHr=8;
                }
                else if(PART_TIME==random)
                {
                         
			System.out.println("Part time Employee");
			workingHr=4;
                }
		else
		{
			System.out.println("Employee is absent");
		}
                salary=workingHr*WAGE_PER_HR;
                System.out.println("Employee Wage: "+salary);
        }
}


