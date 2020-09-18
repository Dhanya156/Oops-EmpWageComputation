import java.util.Scanner;
import java.util.ArrayList;

public class EmpWageObjectOriented
{

                public static final int FULL_TIME=1;
                public static final int PART_TIME=0;
			
		public final String company;
		public final int wagePerHr;
		public final int numbOfWorkingDays;
		public final int numbWorkingHrs;	
		
		public EmpWageObjectOriented(String company,int wagePerHr,int numbOfWorkingDays,int numbWorkingHrs)
		{
			this.company=company;
			this.wagePerHr=wagePerHr;
			this.numbOfWorkingDays=numbOfWorkingDays;
			this.numbWorkingHrs=numbWorkingHrs;
		}
		public static void calculateEmpWage(EmpWageObjectOriented company)
		{
			int currentWorkingHour=0;
                        int currentWorkingday=0;
                        int salary,workingHr=0;
                        int totalSalary=0;

                        while( company.numbOfWorkingDays>=currentWorkingday && company.numbWorkingHrs>=currentWorkingHour )
                        {
                                int random=(int)Math.floor(Math.random()*10)%3;
                                switch(random)
                                {
                                        case FULL_TIME:
                                               // System.out.println("employee is present");
                                                workingHr=8;
                                                break;
                                        case PART_TIME:
                                                //System.out.println("Part Time");
                                                workingHr=4;
                                                break;
                                        default:
                                                workingHr=0;
                                 }
                                        currentWorkingday++;
                                        salary=workingHr*company.wagePerHr;
                                         totalSalary+=salary;
                                        //System.out.println("Wage: "+salary);
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
                	System.out.println("please enter numberofworkingdays:");
                	int numbOfWorkingDays=sc1.nextInt();
                	companyDetails.add(numbOfWorkingDays);

		}
		return companyDetails;
	}       
	public static void main(String[] args)
       	{
		
		ArrayList array=readInputsFromUser();
		int days=(int)array.get(1);
		int day=(int)array.get(3);


		EmpWageObjectOriented object=new EmpWageObjectOriented(array.get(0).toString(),days,20,30);
		object.calculateEmpWage(object);
		EmpWageObjectOriented MicrosoftObject=new EmpWageObjectOriented(array.get(2).toString(),day,34,23);

                MicrosoftObject.calculateEmpWage(MicrosoftObject);					
                }
}
