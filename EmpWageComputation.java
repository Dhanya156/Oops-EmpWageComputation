import java.util.Scanner;
import java.util.ArrayList;

public class EmpWageComputation {

	        public static final int FULL_TIME=1;
	        public static final int PART_TIME=2;
		
		public final String company;
		public final int wagePerHr;
		public final int numbOfWorkingDays;
		public final int numbWorkingHrs;

		public EmpWageComputation(String company,int wagePerHr,int numbOfWorkingDays,int numbWorkingHrs)
		{
			this.company=company;
			this.wagePerHr=wagePerHr;
			this.numbOfWorkingDays=numbOfWorkingDays;
			this.numbWorkingHrs=numbWorkingHrs;
		}



		public static void calculateEmpWage(EmpWageComputation company)
		{
			int currentWorkingHour=0;
			int currentWorkingDay=0;
			int salary,workingHr=0;
			int totalSalary=0;
			
			while(company.numbOfWorkingDays>=currentWorkingDay && company.numbWorkingHrs>=currentWorkingHour)
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
				salary=workingHr*company.wagePerHr;
				totalSalary+=salary;
                        }
			System.out.println("Total computed salary for "+company.company+" "+totalSalary);
		}


			public static ArrayList readInputsFromUser()
			{
				ArrayList companyDetails = new ArrayList();
				System.out.println("please enter number of companies");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();

				for(int i=0;i<n;i++)
				{
					Scanner sc1=new Scanner(System.in);
                			System.out.println("please enter company name:");
                			String company=sc1.nextLine();
                			companyDetails.add(company);
                			System.out.println("please enter wagePerHr:");
                			int wagePerHr=sc1.nextInt();
                			companyDetails.add(wagePerHr);
					System.out.println("please enter numberofworkingDays:");
                                        int numbOfWorkingDays=sc1.nextInt();
                                        companyDetails.add(numbOfWorkingDays);
					System.out.println("please enter numberofworkingHour:");
                                        int numbOfWorkingHour=sc1.nextInt();
                                        companyDetails.add(numbOfWorkingHour);

				}
				return companyDetails;
			}       
		
	        public static void main(String[] args)
	        {
		ArrayList array=readInputsFromUser();
		int days=(int)array.get(1);
		int day=(int)array.get(3);
		EmpWageComputation object=new EmpWageComputation(array.get(0).toString(),days,20,30);
		object.calculateEmpWage(object);
		EmpWageComputation MicrosoftObject=new EmpWageComputation(array.get(2).toString(),day,34,23);

                MicrosoftObject.calculateEmpWage(MicrosoftObject);					
                }
}



