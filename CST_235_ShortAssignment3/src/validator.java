import java.io.Serializable;
import java.util.regex.Pattern;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")


public class validator implements Serializable {
	
	private String firstName;
    private String firstNameFail;
    private String lastName;
    private String lastNameFail;
    private String address;
    private String addressFail;
    private String city;
    private String cityFail;
    private String state;
    private String stateFail;
    private String zip;
    private String zipFail;
    private String cardNumber;
    private String cardNumberFail;
    private String expMonth;
    private String expYear;
    private String expDateFail;
    private String securityCode;
    private String securityCodeFail;
    private String cardFail;
    private String cardPass;
    
    /**
     * No-Argument Constructor
     */
    public validator() {}
    
    /**
     * doValid()
     * 
     * Method runs on submit
     */
    public void doValid() {
    	
    	// Check all fields for validation
    	boolean allValid = checkAllFileds();
    	
    	// if all fields are valid check for credit cards match
    	if(allValid){
    	String csvFile = "/Users/xxx/Desktop/creditCards.csv";
        String line = "";
        String cvsSplitBy = ",";

      
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	boolean Valid = false;
            while ((line = br.readLine()) != null) {

                // use comma as separator check if card info is in file
                String[] card = line.split(cvsSplitBy);
                if( card[0].toLowerCase().equals( firstName.toLowerCase()) 
                	&& card[1].toLowerCase().equals(lastName.toLowerCase())
                	&& card[2].toLowerCase().equals(address.toLowerCase())
                	&& card[3].toLowerCase().equals(city.toLowerCase())
                	&& card[4].toLowerCase().equals(state.toLowerCase())
                	&& card[5].toLowerCase().equals(zip.toLowerCase())
                	&& card[6].toLowerCase().equals(cardNumber.toLowerCase())
                	&& card[7].toLowerCase().equals(expMonth.toLowerCase())
                	&& card[8].toLowerCase().equals(expYear.toLowerCase())
                	&& card[9].toLowerCase().equals(securityCode.toLowerCase())
                	){ Valid = true;}
            }
            
            if(Valid){
            	setCardPass("Congratulations the Credit Card entered is valid");
            	setCardFail("");
            } else { setCardPass("");
            		 setCardFail("The Credit Card entered does not match our database."); 
            		 }

        } catch (IOException e) {
            e.printStackTrace();
        }

    	}
    }

    // method to check all fields
	private boolean checkAllFileds() {
		
		boolean Valid = true;
        
        // Setup regex to include numbers, letters, and hyphens
        String regularCharacterPattern = "[^a-zA-Z0-9-]";
        String numberPattern = "[^0-9]";
        
        // Check First Name
        if (firstName.equals("")) {
            firstNameFail = "Please enter a First Name";
            Valid = false;
        } else if (Pattern.compile(regularCharacterPattern).matcher(firstName).find()) {
            firstNameFail = "Please use only Letters";
            Valid = false;
        } else{firstNameFail = "";}
        
        // Check Last Name
        if (lastName.equals("")) {
            lastNameFail = "Please enter a Last Name";
            Valid = false;
        } else if (Pattern.compile(regularCharacterPattern).matcher(lastName).find()) {
            lastNameFail = "Please use only Letters";
            Valid = false;
        } else{lastNameFail = "";}
        
        // Check Address
        if (address.equals("")) {
        	addressFail = "Please enter street address";
            Valid = false;
        } else{addressFail = "";}
        
        // Check City
        if (city.equals("")) {
        	cityFail = "Please enter City";
            Valid = false;
        } else if (Pattern.compile(regularCharacterPattern).matcher(city).find()) {
        	cityFail = "Please use only Letters in City name";
            Valid = false;
        } else{cityFail = "";}
        
     // Check State
        if (state.equals("")) {
        	stateFail = "Please enter State";
            Valid = false;
        } else if (state.length() > 2 || Pattern.compile(regularCharacterPattern).matcher(state).find()) {
        	stateFail = "Please enter 2 digit state";
            Valid = false;
        } else{stateFail = "";}
        
     // Check Zip
        if (zip.equals("")) {
        	zipFail = "Please enter Zip";
            Valid = false;
        } else if (zip.length() != 5) {
        	zipFail = "Please use a 5 digit Zip";
            Valid = false;
        } else if (Pattern.compile(numberPattern).matcher(zip).find()){
        	zipFail = "Please use only Numbers in the Zip";
        } else{zipFail = "";}
        
     // Check card
        if (cardNumber.equals("")) {
        	cardNumberFail = "Please enter a card number";
            Valid = false;
        } else if (cardNumber.length() != 16) {
        	cardNumberFail = "Please use a 16 digit card number";
            Valid = false;
        } else if (Pattern.compile(numberPattern).matcher(cardNumber).find()){
        	cardNumberFail = "Please use only Numbers in the credit card";
        } else{cardNumberFail = "";}
        
        // Check Expiration Date
        if (expMonth.length() != 2 || expYear.length() != 2) {
            expDateFail = "Please enter a valid Expiration Date";
            Valid = false;
        } else{ expDateFail = ""; }
        
		
		return Valid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstNameFail() {
		return firstNameFail;
	}

	public void setFirstNameFail(String firstNameFail) {
		this.firstNameFail = firstNameFail;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastNameFail() {
		return lastNameFail;
	}

	public void setLastNameFail(String lastNameFail) {
		this.lastNameFail = lastNameFail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressFail() {
		return addressFail;
	}

	public void setAddressFail(String addressFail) {
		this.addressFail = addressFail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityFail() {
		return cityFail;
	}

	public void setCityFail(String cityFail) {
		this.cityFail = cityFail;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateFail() {
		return stateFail;
	}

	public void setStateFail(String stateFail) {
		this.stateFail = stateFail;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZipFail() {
		return zipFail;
	}

	public void setZipFail(String zipFail) {
		this.zipFail = zipFail;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardNumberFail() {
		return cardNumberFail;
	}

	public void setCardNumberFail(String cardNumberFail) {
		this.cardNumberFail = cardNumberFail;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public String getExpDateFail() {
		return expDateFail;
	}

	public void setExpDateFail(String expDateFail) {
		this.expDateFail = expDateFail;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getSecurityCodeFail() {
		return securityCodeFail;
	}

	public void setSecurityCodeFail(String securityCodeFail) {
		this.securityCodeFail = securityCodeFail;
	}

	public String getCardFail() {
		return cardFail;
	}

	public void setCardFail(String cardFail) {
		this.cardFail = cardFail;
	}

	public String getCardPass() {
		return cardPass;
	}

	public void setCardPass(String cardPass) {
		this.cardPass = cardPass;
	}
	
}
