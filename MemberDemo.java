package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;

public class MemberDemo {
	
	public static void main(String[] args) throws IOException{
		
		Member[] members={
				
				new Member("b1234","Justin",90),
				new Member("b5678","Monica",95),
				new Member("b9876","Irene",88),
		};
		for (Member member:members){
			
			member.save();
			
		}
		out.println(Member.load("b1234"));
		out.println(Member.load("b5678"));
		out.println(Member.load("b9876"));
	}
	

}
