package eu.trentorise.smartcampus.citizenportal.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user_data_final")
public class UserDataFinal {

	@Id
	private String id;
	private String ricTaxCode;
	private String ric;
	private String practiceId;
	private String mail;
	private String phone;
	private String address;
	private String city;
	private String position;
	private String mailResult;
	private String manualEdited;
	
	public UserDataFinal() {
		// TODO Auto-generated constructor stub
	}

	public UserDataFinal(String ricTaxCode, String ric, String practiceId,
			String mail, String phone, String address, String city, String position) {
		super();
		this.ricTaxCode = ricTaxCode;
		this.ric = ric;
		this.practiceId = practiceId;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.position = position;
	}
	
	public String getId() {
		return id;
	}

	public String getRicTaxCode() {
		return ricTaxCode;
	}

	public String getRic() {
		return ric;
	}

	public String getPracticeId() {
		return practiceId;
	}

	public String getMail() {
		return mail;
	}

	public String getPhone() {
		return phone;
	}

	public String getPosition() {
		return position;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setRicTaxCode(String ricTaxCode) {
		this.ricTaxCode = ricTaxCode;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMailResult() {
		return mailResult;
	}

	public void setMailResult(String mailResult) {
		this.mailResult = mailResult;
	}
	
	public String getManualEdited() {
		return manualEdited;
	}

	public void setManualEdited(String manualEdited) {
		this.manualEdited = manualEdited;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "UserDataFinal [id=" + id + ", ricTaxCode=" + ricTaxCode
				+ ", ric=" + ric + ", practiceId=" + practiceId + ", mail="
				+ mail + ", phone=" + phone + ", address=" + address
				+ ", city=" + city + ", position=" + position + ", mailResult="
				+ mailResult + ", manualEdited=" + manualEdited + "]";
	}

	public String toJSONString(){
		String correctedMail = mail;
		String correctedPhone = phone;
		String correctedMailResult = mailResult;
		String correctedManualEdited = manualEdited;
		String correctedCity = city;
		String correctedAddress = address;
		if (correctedMail != null){
			correctedMail = "\"" + correctedMail + "\"";
		}
		if (correctedPhone != null){
			correctedPhone = "\"" + correctedPhone + "\"";
		}
		if (correctedMailResult != null){
			correctedMailResult = "\"" + correctedMailResult + "\"";
		}
		if (correctedManualEdited != null) {
			correctedManualEdited = "\"" + correctedManualEdited + "\"";
		}
		if(correctedCity != null){
			correctedCity = "\"" + correctedCity + "\"";
		}
		if(correctedAddress != null){
			correctedAddress = "\"" + correctedAddress + "\"";
		}
		return "{" +
				"  \"practiceId\": \"" + practiceId  + "\"," +
				"  \"ric\": \"" + ric  + "\"," +
				"  \"ricTaxCode\": \"" + ricTaxCode  + "\"," +
				"  \"mail\": " + correctedMail  + "," +
				"  \"phone\": " + correctedPhone  + "," +
				"  \"city\": " + correctedCity + "," +
				"  \"address\": " + correctedAddress + "," +
				"  \"position\": " + position + "," +
				"  \"mailResult\": " + correctedMailResult + "," +
				" \"manualEdited\": " + correctedManualEdited +
				"}";
//		return "{" +
//		"  practiceId: \"" + practiceId  + "\"," +
//		"  ric: \"" + ric  + "\"," +
//		"  ricTaxCode: \"" + ricTaxCode  + "\"," +
//		"  mail: \"" + mail  + "\"," +
//		"  phone: \"" + phone  + "\"" +
//		"}";
	}

}
