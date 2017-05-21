package com.sravan.connection;

public class PersonKey {
private String name;
private String lname;
 private int id;
 
 public PersonKey(String name, String lname, int id) {
	// TODO Auto-generated constructor stub
	 this.name=name;
	 
	 this.lname=lname;
	 
	 this.id=id;
}
public static void main(String[] args) {
	PersonKey p1=new PersonKey("sravan","aef",123);
	PersonKey p2=new PersonKey("sraafafa","aafafaef",12003);

	PersonKey p1_copy=new PersonKey("sravan","aef",123);

	PersonKey p1_dupe=p1;
	System.out.println("P1="+p1.hashCode());//P1=366712642
	//P2=1829164700

	System.out.println("P2="+p2.hashCode());
	System.out.println("P1_Copy="+p1_copy.hashCode());
	System.out.println("P1_Dupe="+p1_dupe.hashCode());
	
	System.out.println((p1==p2)+"P1==p2");
	
	System.out.println((p1==p1_copy)+"P1==p1_copy");
	
	
	System.out.println((p1==p1_dupe)+"P1==p1dupe");
	
	
	
	System.out.println((p1.equals(p2))+"P1equalsp2");

	System.out.println((p1.equals(p1_copy))+"P1equalsp1_copy");
	
	
	System.out.println((p1.equals(p1_dupe))+"P1equalsp1dupe");

}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((lname == null) ? 0 : lname.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return 366712642;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonKey other = (PersonKey) obj;
	if (id != other.id)
		return false;
	if (lname == null) {
		if (other.lname != null)
			return false;
	} else if (!lname.equals(other.lname))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
