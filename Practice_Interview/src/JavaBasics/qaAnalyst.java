package JavaBasics;

public class qaAnalyst {
	static int dp=1;
	static int i,j;
	static int addOn=1;
	
	static double cost=(dp*i)+(addOn*j);
	static int insuranceTotal=1;
	static int vatper=1;
	static int insurance=1;
	static int returndeliveryfee=1;
	static int deliveryfee=1;
	static int promocode=10;
	static double netTotal=78.95;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	while(vatper>0&&insurance>0&&returndeliveryfee>0&&i>=0&&addOn>0&&j>=0&dp>0&&deliveryfee>0) {	
		
		
for ( i= 0;  i<= 5;i++) {
	for ( j= 0;  j<= 5-i;i++) {
	if (insurance>0 && vatper>0 && returndeliveryfee >0&&((i+j)>=2)&&((i+j)<=5))
		
	cost=cost*(i+j) +	insurance*(i+j);
	
	
	insuranceTotal=insurance*(i+j);
	cost=cost*(vatper+100)/100;
	
	
	
	//cost=cost+returndeliveryfee;
	cost=cost+deliveryfee+insuranceTotal;
	Double aDouble=10.0;
	  netTotal=cost-promocode;	
	

System.out.println(cost);
System.out.println(dp);
System.out.println(i);
System.out.println(j);
System.out.println(addOn);
System.out.println(insuranceTotal);
System.out.println(insurance);
System.out.println(vatper);
System.out.println(deliveryfee);
System.out.println(returndeliveryfee);
System.out.println(deliveryfee);

System.out.println("*************************");
	}
}
vatper++;
insurance++;
returndeliveryfee++;}

}
}
