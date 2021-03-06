package model;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
public class User {
	
	@Id
	@GeneratedValue()
	private int userid;
	private String username;
	private String mobile_no;
	private String email;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "Street", column = @Column(name = "HOME_STREET_NAME")),
			@AttributeOverride(name = "pincode", column = @Column(name = "HOME_PINCODE")) })
	private Address home_address;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "Street", column = @Column(name = "OFFICE_STREET_NAME")),
			@AttributeOverride(name = "pincode", column = @Column(name = "OFFICE_PINCODE")) })
	private Address office_address;

	//Default Constructor
	public User() {

	}

	//Parameterized Constructor
	public User(String username, String mobile_no, String email, Address home_address, Address office_address) {
		super();
		this.username = username;
		this.mobile_no = mobile_no;
		this.email = email;
		this.home_address = home_address;
		this.office_address = office_address;
	}

	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}