package cc.openhome;

import java.io.*;

public class Member {
	
	private String number;
	private String name;
	private int age;
	
	public Member(String number,String name,int age){
		
		this.number= number;
		this.name=name;
		this.age=age;
		
	}

	public String toString(){
		
		return String.format("(%s,%s,%d)",number,name,age);	
	}
	
	public void save() throws IOException{
		try(DataOutputStream output=new DataOutputStream(new FileOutputStream(number))){
			output.writeUTF(number);
			output.writeUTF(name);
		    output.writeInt(age);
		}
		
	}
	public static Member load(String number) throws IOException{
		Member member;
		try(DataInputStream input=new DataInputStream(new FileInputStream(number))){
			member=new Member(input.readUTF(),input.readUTF(),input.readInt());
		}
		return member;
	}
	
	
}
