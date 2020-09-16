public class EmpWageComputation
{
        public static final int WAGE_PER_HR=20;
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static void main(String[] args)
        {
                int salary,workingHr=0;
                int random=(int)Math.floor(Math.random()*10)%3;
                System.out.println(random);
                switch(random){
                case FULL_TIME:
                        System.out.println("employee is present");
                        workingHr=8;
                        break;
                case PART_TIME:
                        System.out.println("Part Time");
                        workingHr=4;
                        break;
                default:
                        System.out.println("Absent");
                        workingHr=0;
                }
                salary=workingHr*WAGE_PER_HR;
                System.out.println("Wage: "+salary);
        }
}
