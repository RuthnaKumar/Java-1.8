import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaNew {
	
	public static void main(String arg[])
	{
		int A[]= {115,113,114,120};
		long[] B =new long[A.length];
		int K=0;
		for(int i:A) {
			if(i%2==0) { 
			B[K]=i;
			K+=1;		
			}			
		}
		String s = ("" +B[0]+B[1]);
		
		System.out.println(s);
		
for(int i=0;i<s.length();i++) {
	int d=s.charAt(i)-'0';
	if(d%2==0) {
	System.out.println(d);
	
}
	}

ArrayList<Integer> a= new ArrayList<Integer>();
a.add(40);
a.add(20);
a.add(35);
a.add(70);
a.add(70);
a.add(20);
a.add(-50);
a.add(39);
System.out.println(a);
List<Integer> f = a.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(f);
List<Integer> m = a.stream().map(i->i+5).collect(Collectors.toList());
System.out.println(m);
List<Integer> fail = a.stream().filter(i->i<35).collect(Collectors.toList());
System.out.println(fail);
List<Integer> pass = fail.stream().map(i->i+20).collect(Collectors.toList());
System.out.println(pass);
long NoF = a.stream().filter(i->i<35).count();
System.out.println(NoF);
List<Integer> sort = a.stream().sorted().collect(Collectors.toList());
System.out.println(sort);
List<Integer> dsort = a.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
System.out.println(dsort);
List<Integer> csort = a.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
System.out.println(csort);
int min = a.stream().min((i1,i2)->i1.compareTo(i2)).get();
System.out.println(min);
List<Integer> dis = a.stream().distinct().collect(Collectors.toList());
System.out.println(dis);
long c =dis.stream().count();
System.out.println(c);
String str =(dis.toString());
System.out.println(str);
for(int f1 :dis) {
	if(f1%2==0)
	System.out.println(f1);
	
}
String ar =a.toString();
System.out.println("Positive");
for(int po:a) {
	if(po>0 & po<40) {
System.out.println(po);
	}
}
System.out.println("TVM");


    String r = "D-0000000000000378.CES";
    String rs = r.replace('0',' ');
    String tr = rs.replaceAll("\\s", "");
	System.out.println(tr);
    
	ArrayList<String> al =new ArrayList<String>();
	al.add("D-00000758.CSE");
	al.add("D-000398.ECE");
	al.add("D-000000000000000978.EEE");
	for(String values:al) {
		String r1 = values;
		String rs1 = r1.replace('0', ' ' );
		String tr1 = rs1.replaceAll("\\s", "");
		System.out.println(tr1);
	}
	
	
	
	LocalDate date = LocalDate.now();
	int DY = date.getYear();
	int DM = date.getMonthValue();
	int DD = date.getDayOfMonth();
	System.out.printf("%d-%d-%d \n",DD,DM,DY);
	System.out.println("DATE:" +date);
	LocalTime time = LocalTime.now();
	int TH = time.getHour();
	int TM = time.getMinute();
	int TS = time.getSecond();
	int TN = time.getNano();
	System.out.printf("%d:%d:%d:%d \n",TH,TM,TS,TN);
	System.out.println("TIME:"+time);
	
	LocalDateTime DT = LocalDateTime.now();
	System.out.println(DT);
	
	LocalDateTime DTP = LocalDateTime.of(2000,04,19,10,15);
	System.out.println(DTP);
	System.out.println(DTP.plusYears(23).getDayOfWeek());
	LocalDate age = LocalDate.of(2000, 04, 19);
	LocalDate today = LocalDate.now();
	Period p = Period.between(age, today);
	System.out.printf("YOUR AGE IS %d YEAR %d MONTH %d DAY",p.getYears(),p.getMonths(),p.getDays());

	
	
	
	}	
} 
 




