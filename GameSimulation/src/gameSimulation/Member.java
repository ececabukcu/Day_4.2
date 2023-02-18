package gameSimulation;

public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private int nationaltyId;
	private int dateOfBirth;
	
	
	public Member(int id, String firstName, String lastName, int nationaltyId, int dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = nationaltyId;
		this.dateOfBirth = dateOfBirth;
	}


	public int getNationaltyId() {
		return nationaltyId;
	}


	public void setNationaltyId(int nationaltyId) {
		this.nationaltyId = nationaltyId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	

}
