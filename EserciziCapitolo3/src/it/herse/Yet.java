package it.herse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Yet {
	static { add(2); }
	static void add(int num) { System.out.print(num + " "); }
	Yet() { add(5); }
	static { add(4); }
	{ add(6); }
	static { new Yet(); }
	static { add(8); }
	
	public static void main(String[] args) { 
		
	} 
		
}

