package com.collectionsassignment.app;

import java.util.HashMap;
import java.util.Objects;

/*Element collision in HashMap is a situation where two or more key objects
	produce the same final hash value
	
	Based on the hashcode generated a particular key,value pair is assigned a bucket
	and every pair is assigned a different bucket as they should have a different hashcode
	but in element collision the two different pairs can be assigned the same bucket
	due to same hashcode values
*/

class Person{
	private int id;
	private String firstname;
	private String lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Person(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public int hashCode() {
		return 1;
		//return Objects.hash(firstname, id, lastname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstname, other.firstname) && id == other.id && Objects.equals(lastname, other.lastname);
	}
	
	
}

public class ElementCollision {

	public static void main(String[] args) {
		/*Demonstrating element collision */
		HashMap<Person,String> person_info=new HashMap<>();
		Person p1=new Person(1,"Shilp","Patel");
		Person p2=new Person(2,"Isha","Sachdeva");
		
		/*Both below key,value pair will go in the same bucket as hashcode method return same value*/
		person_info.put(p1,p1.getFirstname()+" "+p1.getLastname());
		person_info.put(p2,p2.getFirstname()+" "+p2.getLastname());
		
		System.out.println(person_info);
		
		
		

	}

}
