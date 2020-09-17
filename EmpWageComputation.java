public class EmpWageComputation {

	        public static final int FULL_TIME=1;
	        public static final int PART_TIME=2;

		public static void calculateEmpWage(String company,int wagePerHr,int numbOfWorkingDays,int numbWorkingHrs)
		{
			int currentWorkingHour=0;
			int currentWorkingDay=0;
			int salary,workingHr;
			int totalSalary=0;
			
			while(numbOfWorkingDays>=currentWorkingDay && numbWorkingHrs>=currentWorkingHour)
			{
			int random=(int)Math.floor(Math.random()*10)%3;
                        //System.out.println(random);
                        switch(random)
                        {
                        case FULL_TIME:
                                //System.out.println("Full time Employee");
                                workingHr=8;
                                break;
                        case PART_TIME:
                                //System.out.println("Part time Employee");
                                workingHr=4;
                                break;
                        default:
                                //System.out.println("Absent");
                                workingHr=0;
                        }
				currentWorkingDay++;
				salary=workingHr*wagePerHr;
				totalSalary+=salary;
                        }
			System.out.println("Total computed salary for "+company+" "+totalSalary);
			}


	        public static void main(String[] args)
	        {
		calculateEmpWage("Dell",20,30,20);
		calculateEmpWage("Microsoft",30,20,20);

	        }

}
