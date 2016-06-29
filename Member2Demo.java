package cc.openhome;

import static java.lang.System.out;

public class Member2Demo {
	
	public static void main(String[] args) throws Exception{
		
		Member2[] members={
				new Member2("b1234","justin",90),
				new Member2("b5678","Minica",95),
				new Member2("b9876","irene",88)
		};
				
		for(Member2 member:members)	{
			member.save();
			
		}	
		out.println(Member2.load("b1234"));		
		out.println(Member2.load("b5678"));	
		out.println(Member2.load("b9876"));
		}
		
	}
	


