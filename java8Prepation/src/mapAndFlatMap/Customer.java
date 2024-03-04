package mapAndFlatMap;

import java.util.List;

public class Customer
{
	
	private int id;
	private String name;
	private String mail;
	private List<String> phoneNo;
	
	public Customer(int id, String name, String mail, List<String> phoneNo) 
	{
		
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", mail=" + mail + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
	

}
