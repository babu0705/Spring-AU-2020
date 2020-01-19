package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class datetime {

public long diffnano(String dt1,String dt2)
{
	try {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dt1);  
        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(dt2);  
        System.out.println(date1);
        long diffInMillies = Math.abs(date1.getTime() - date2.getTime());

        return(TimeUnit.MILLISECONDS.toNanos(diffInMillies));  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	return 0;
}
public void diffzones()
{
	String dateInString1 = "2015-08-15T15:23:01Z";
	String dateInString2 = "2015-08-20T15:23:01Z";

    Instant instant1 = Instant.parse(dateInString1);
    Instant instant2 = Instant.parse(dateInString2);


    //get date time only
    LocalDateTime result = LocalDateTime.ofInstant(instant1, ZoneId.of(ZoneOffset.UTC.getId()));

    //get localdate

    //get date time + timezone
    ZonedDateTime zonedDateTime = instant1.atZone(ZoneId.of("Europe/Athens"));

    //get date time + timezone
    ZonedDateTime zonedDateTime2 = instant2.atZone(ZoneId.of("Europe/Athens"));
    long diff = Duration.between(zonedDateTime, zonedDateTime2).toDays();
    System.out.println("difference between the static given days  "+diff);
	

}
public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Your DOB(dd/MM/yyyy)");
	String mydob = in.next();
	System.out.println("Enter Your Sibling/Parents DOB (dd/MM/yyyy)");
	String sibdob = in.next();
	datetime dt=new datetime();
	long nano=dt.diffnano(mydob,sibdob);
	
	System.out.println("diffference in Nano Seconds    "+nano);
	dt.diffzones();
	
	
	
	
	
}
}
