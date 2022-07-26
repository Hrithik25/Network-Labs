import java.util.*;
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int difference(Date d2) {
		int dd = Math.abs(this.day - d2.day);
		int mm = Math.abs(this.month - d2.month);
		int yy = Math.abs(this.year - d2.year);

		return (dd*1 + mm*30 + yy*365);
	}
	
	public Date nextDate(int days) {
		Date d3 = new Date();
		int yy = 0, mm = 0;
		if(days >= 365) {
			yy = days % 365;
			days /= 365;
		}
		if(days >= 30) {
			mm = days % 30;
			days /= 30;
		}
		d3.day = this.day + days;
		d3.month = this.month + mm;
		d3.year = this.year + yy;
		
		return d3;
	}
}
