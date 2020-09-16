public class EmpWageComputation {

	        public static final int WAGE_PER_HR=20;
	        public static final int FULL_TIME=1;
	        public static final int PART_TIME=2;
		public static final int MAX_WORKING_DAYS=20;
		public static final int MAX_WORKING_HRS=100;
	        public static void main(String[] args)
	        {
	                int salary,totalWorkingHr=0,totalWorkingDays=0;
	                int totalSalary=0,workingHr;
	                while(totalWorkingHr < MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS){
			totalWorkingDays++;
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
			totalWorkingHr=totalWorkingHr+workingHr;
	                }
			totalSalary=totalWorkingHr*WAGE_PER_HR;
			System.out.println("totalWorkingHr" +totalWorkingHr);
	                System.out.println("totalSalary" +totalSalary);
	        }

}
