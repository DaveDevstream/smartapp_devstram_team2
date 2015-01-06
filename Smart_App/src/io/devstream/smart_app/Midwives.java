package io.devstream.smart_app;

public abstract class Midwives {

	private int id;
	private String name;
	private String username;
	private String email;
	private String password;
	private boolean active;
	private boolean admin;
	private String job_occupation;
	private String job_level;
	private int primary_phone;
	private int secondary_phone;
	
	public Midwives(int theid, String theName,String theUsername,String theEmail, String thePassword, boolean isActive,
			boolean isAdmin, String thejob_occupation, String thejob_level, int theprimary_phone, int thesecondary_phone) {
		// TODO Auto-generated constructor stub
		this.name= theName;
		this.id= theid;
		this.username=theUsername;
		this.email=theEmail;
		this.password=thePassword;
		this.active=isActive;
		this.admin=isAdmin;
		this.job_occupation=thejob_occupation;
		this.job_level=thejob_level;
		this.primary_phone=theprimary_phone;
		this.secondary_phone=thesecondary_phone;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getJob_occupation() {
		return job_occupation;
	}
	public void setJob_occupation(String job_occupation) {
		this.job_occupation = job_occupation;
	}
	public String getJob_level() {
		return job_level;
	}
	public void setJob_level(String job_level) {
		this.job_level = job_level;
	}
	public int getPrimary_phone() {
		return primary_phone;
	}
	public void setPrimary_phone(int primary_phone) {
		this.primary_phone = primary_phone;
	}
	public int getSecondary_phone() {
		return secondary_phone;
	}
	public void setSecondary_phone(int secondary_phone) {
		this.secondary_phone = secondary_phone;
	}
	public String toString()
	    {
		   return String.format( "%s %s\n:%s",getId(),getName(),getEmail(),getPassword(),isActive(),isAdmin(),getJob_occupation(),getJob_level(),getPrimary_phone(),getSecondary_phone());
	    } 
}


