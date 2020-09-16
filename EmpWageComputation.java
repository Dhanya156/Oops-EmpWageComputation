public class EmpWageComputation {

	        public static final int WAGE_PER_HR=20;
	        public static final int FULL_TIME=1;
	        public static final int PART_TIME=2;
	        public static final int NUMBER_OF_WORKING_DAYS=20;
	        public static void main(String[] args)
	        {
	                int salary,workingHr=0;
	                int totalSalary=0;
	                for(int day=0;day<NUMBER_OF_WORKING_DAYS ;day++) {
	                int random=(int)Math.floor(Math.random()*10)%3;
	                System.out.println(random);
	                switch(random)
	                {
	                case FULL_TIME:
	                        System.out.println("Full time Employee");
	                        workingHr=8;
	                        break;
	                case PART_TIME:
	                        System.out.println("Part time Employee");
	                        workingHr=4;
	                        break;
	                default:
	                        System.out.println("Absent");
	                        workingHr=0;
	                }
	                salary=workingHr*WAGE_PER_HR;
	                totalSalary+=salary;
	                System.out.println("Wage: "+salary);
	                }
	                System.out.println(totalSalary);
	        }

}
