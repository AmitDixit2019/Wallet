package com.walletproject.corepackage.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="[WALLETUSER]")
public class User{
	
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userID")

	private String userID;

	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;

	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	void user(String userID, String firstName, String lastName) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
      
    }

	/*@Column(name = "TYPE", nullable = false)
	private String type;

	@Column(name = "BUSINESSNAME", nullable = false)
	private String businessName;

	@Column(name = "EMAILID", nullable = false)
	private String emailID;

	@Column(name = "MOBILE", nullable = false)
	private String mobile;

	@Column(name = "PARROWID", nullable = false)
	private String parRowID;

	@Column(name = "PAN", nullable = false)
	private String pan;

	@Column(name = "idProofType", nullable = false)
	private String idProoftype;

	@Column(name = "idProofNumber", nullable = false)
	private String idProoNumber;

	@Column(name = "kycDocuments", nullable = false)
	private String kycdocuments;

	@Column(name = "kycStatus", nullable = false)
	private String kycStatus;

	//private Address address;

	//private Balance balance;
	
	private Boolean isActive;
	
	private String registrationStatus;
	
	private Boolean isBlockUser;
	
	
*/
	
/*	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userID;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}
*/
	
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
*/
	
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	/*public Address getAddress() {
		return address;
	}*/

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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

	/*public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getParRowID() {
		return parRowID;
	}

	public void setParRowID(String parRowID) {
		this.parRowID = parRowID;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getIdProoftype() {
		return idProoftype;
	}

	public void setIdProoftype(String idProoftype) {
		this.idProoftype = idProoftype;
	}

	public String getIdProoNumber() {
		return idProoNumber;
	}

	public void setIdProoNumber(String idProoNumber) {
		this.idProoNumber = idProoNumber;
	}

	public String getKycdocuments() {
		return kycdocuments;
	}

	public void setKycdocuments(String kycdocuments) {
		this.kycdocuments = kycdocuments;
	}

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Boolean getIsBlockUser() {
		return isBlockUser;
	}

	public void setIsBlockUser(Boolean isBlockUser) {
		this.isBlockUser = isBlockUser;
	}
*/
	/*public void setAddress(Address address) {
		this.address = address;
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}
*/
}