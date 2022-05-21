package org.samp;

public class Sample {
public void employeeId (String name) {
System.out.println(name);
System.out.println(name);
	
}
public void employeeId (String address , int pincode ) {
System.out.println(address);
System.out.println(pincode);
}
public void employeeId (String mail , long phone, int age  ) {
System.out.println(mail);
System.out.println(phone);
System.out.println(age);
}
public static void main (String [] arg) {
	Sample s = new Sample();
	s.employeeId("kiran panduru");
	s.employeeId("APHB COLONY", 530044);
	s.employeeId("kiranpanduru@1994", 8919002596l, 26);
}
}
