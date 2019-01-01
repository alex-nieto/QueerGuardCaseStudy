package qg.models;

/**
 * <h1>User Class</h1>
 * <p>Holds the info for a user</p>
 * @author Alex Nieto
 * @version 1.0
 * @since 2018-11-20
 */
public class User extends Person{

	//Private data members:
	private String email;
	private String password;;
	
	//Constructors:
	
	/**
	 * Default constructor
	 */
	public User() {
	    super();
		email = "";
		password = "";
	}
	
	/**
	 * Constructor initializer - takes all user info individually
	 * @param ID - User ID
	 * @param email - User email
	 * @param password - User password
	 * @param fname - User first name
	 * @param lname - User last name
	 * @param username - User username
	 */
	public User(int ID, String email, String password, String fname, String lname, String username) {
		super(ID,fname,lname,username);
		this.email = email;
		this.password = password;
	}
	
	//Setters:
	
	/**
	 * setEmail(String email) - method to set email value
	 * @param email - User email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * setPassword(String password) - method to set password value
	 * @param password - User password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Getters:
	
	/**
	 * getEmail() - method returns user email
	 * @return user email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * getPassword() - method returns user password
	 * @return user password
	 */
	public String getPassword() {
		return password;
	}
}
