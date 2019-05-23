import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) throws ParseException {
		
//		String a = "1557284416458";
//		Date date = new Date(Long.parseLong(a));
//		
//		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
//		String result = df.format(date);
//		
//		String str_a = result.substring(0, 8);
//		String str_b = result.substring(8);
//		
//		System.out.println(date);
//		System.out.println(result);
//		System.out.println(str_a);
//		System.out.println(str_b);
		
//		
//		Map<String, Object> a = new HashMap<String, Object>();
//		Map<String, Object> b = new HashMap<String, Object>();
//		
//		String wer = "1553153139745";
//		
//		a.put("a1", "1111");
//		a.put("a2", Long.parseLong(wer));
//		a.put("a3", "3333");
//		a.put("b1", "4444");
//		a.put("b2", "5555");
//		a.put("b3", "6666");
//		
//		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
//		
//		list.add(a);
//		list.add(b);
//		
//		System.out.println(list.get(0).get("a2"));
		
		
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//		
//		cal.add(Calendar.DATE, 0);	
//		String SELECTDATE_S = sdf.format(cal.getTime());
//		cal.add(Calendar.DATE, -1);	
//		String SELECTDATE_E = sdf.format(cal.getTime());
//		
//		
//		System.out.println(SELECTDATE_E);
//		System.out.println(SELECTDATE_S);
		
		
		
//		================================================================================
		
		
		
//		String a = "   ababab   ";
//		String b = a.trim().replace("a", "C");
//		
//		System.out.println(b);
		
		
		
		
//		================================================================================
		
		
//		SimpleDateFormat fm1 = new SimpleDateFormat("yyyyMMddHHmmss");
//		SimpleDateFormat fm2 = new SimpleDateFormat("yyyyMMdd");
//		
//		String a = "20190523000000";
//		Date a_date = fm1.parse(a);
//		
//		String b = "20190524";
//		Date b_date = fm2.parse(b);
//		
//		long diff = b_date.getTime() - a_date.getTime();
//		long diffDays = diff / (24 * 60 * 60 * 1000);
//		
//		System.out.println(diffDays);
		
		
//		Date bb = new Date();
//		String cc = fm.format(bb);
//		
//		System.out.println(cc);
		
		
//		String a = "20190523";
//		
//		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd");
//		
//		Date aa = fm.parse(a);
//		Date bb = new Date();
//		
//		long diff = aa.getTime() - bb.getTime();
//		
//		System.out.println(aa.getTime());
//		System.out.println(bb.getTime());
//		
//		long diffDays = diff / (24 * 60 * 60 * 1000);
//		
//		System.out.println(diffDays);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
		String a = "2019052315000000";
		Date nowDate = sdf2.parse(a);
		
		String v_VALIDT_EDATE = "20190509";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date endDate = sdf.parse(v_VALIDT_EDATE);
		Calendar endDateCal = Calendar.getInstance();
		endDateCal.setTime(endDate);
		endDateCal.add(Calendar.DATE, 1);
		
//		Date nowDate = new Date();
		Calendar nowDateCal = Calendar.getInstance();
		nowDateCal.setTime(nowDate);
		
		endDate = new Date(endDateCal.getTimeInMillis());
		
		System.out.println(endDate);
		System.out.println(nowDate);
		
		long diff = endDate.getTime() - nowDate.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
//		
//		System.out.println(diff);
//		System.out.println(diffDays);
//		
//		
//		if(endDateCal.before(nowDateCal)) {
//			System.out.println("기간만료");
//		} else {
//			System.out.println("사용가능");
//			
//		}
		
		if(diff >= 0 && diffDays != 0) {
			System.out.println("D-" + diffDays);
		} else if(diff >= 0 && diffDays == 0) {
			System.out.println("D-Day");
		} else {
			System.out.println("기간만료");
		}
		
	}
	
}
