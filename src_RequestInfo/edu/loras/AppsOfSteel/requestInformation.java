package edu.loras.AppsOfSteel;

import edu.loras.AppsOfSteel.R.id;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class requestInformation extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.request_information);
		
		int[] editTextIds = {R.id.nameField, R.id.preferredNameField, R.id.addressField, R.id.cityField, R.id.stateField, R.id.zipCodeField, R.id.DOBField, R.id.landlinePhoneField, R.id.cellPhoneField, R.id.emailField, R.id.highSchoolField, R.id.highSchoolCityStateField, R.id.highSchoolGraduationField, R.id.highSchoolGPAField, R.id.transferStudentCollegesField, R.id.academicInterestsField, R.id.collegeGPAField, R.id.collegiateAthleticsField, R.id.collegiateExtracurricularsField, R.id.citizenshipField};
		Bundle bundle = getIntent().getExtras();
		if (bundle != null)
		{
			boolean[] validityArray = bundle.getBooleanArray("validityArray");
		
			if(validityArray[0] == false)
			{
				TextView nameText = (TextView) findViewById(editTextIds[0]);
				nameText.setTextColor(Color.rgb(255, 0, 0));
				nameText.append("\nFull name required");
				nameText.setTypeface(null,Typeface.BOLD_ITALIC);
			}
			if(validityArray[1] == false)
			{
				TextView nameText = (TextView) findViewById(R.id.nameText);
				nameText.setTextColor(Color.rgb(255, 0, 0));
				nameText.append("\nFull name required");
				nameText.setTypeface(null,Typeface.BOLD_ITALIC);
			}
			if(validityArray[0] == false)
			{
				TextView nameText = (TextView) findViewById(R.id.nameText);
				nameText.setTextColor(Color.rgb(255, 0, 0));
				nameText.append("\nFull name required");
				nameText.setTypeface(null,Typeface.BOLD_ITALIC);
			}
			if(validityArray[0] == false)
			{
				TextView nameText = (TextView) findViewById(R.id.nameText);
				nameText.setTextColor(Color.rgb(255, 0, 0));
				nameText.append("\nFull name required");
				nameText.setTypeface(null,Typeface.BOLD_ITALIC);
			}
			if(validityArray[0] == false)
			{
				TextView nameText = (TextView) findViewById(R.id.nameText);
				nameText.setTextColor(Color.rgb(255, 0, 0));
				nameText.append("\nFull name required");
				nameText.setTypeface(null,Typeface.BOLD_ITALIC);
			}
		}
		
	}
	
	
	public void sendRequest(View button, int[] editTextIds) {  

		String titleIndicator = "";
		String startTerm = "";
		String usCitizen="";
		boolean[] valid = new boolean[9];

		for(int i = 0; i < valid.length ; i++)
		{
			valid[i] =  true;
		}
		
		RadioGroup title = (RadioGroup) findViewById(R.id.titleField);
		RadioButton titleSelected = (RadioButton) findViewById(title.getCheckedRadioButtonId());
		
		if(titleSelected != null)
		{
			titleIndicator = titleSelected.getText().toString();
		}
		
		
		RadioGroup intendedStartTerm = (RadioGroup) findViewById(R.id.intendedStartTerm);
		//selected = intendedStartTerm.getCheckedRadioButtonId();
		RadioButton startTermSelected = (RadioButton) findViewById(intendedStartTerm.getCheckedRadioButtonId());
		
		if(startTermSelected != null)
		{
			startTerm = startTermSelected.getText().toString();
		}
		else
		{
			valid[6] = false;
		}

		
		RadioGroup usCitizenGroup= (RadioGroup) findViewById(R.id.usCitizenGroup);
		//selected = usCitizenGroup.getCheckedRadioButtonId();
		RadioButton usCitizenSelected = (RadioButton) findViewById(usCitizenGroup.getCheckedRadioButtonId());
		
		if(usCitizenSelected != null)
		{
			usCitizen = usCitizenSelected.getText().toString();
		}
		
		
		final EditText nameField = (EditText) findViewById(editTextIds[0]);  
		String name = nameField.getText().toString();  
		if(name.equals(""))
		{
			valid[0] = false;
		}
		  
		final EditText preferredNameField = (EditText) findViewById(R.id.preferredNameField);  
		String preferredName = preferredNameField.getText().toString();  
		  
		final EditText addressField = (EditText) findViewById(R.id.addressField);  
		String address = addressField.getText().toString();
		if(address.equals(""))
		{
			valid[1] = false;
		}
		
		final EditText cityField = (EditText) findViewById(R.id.cityField);  
		String city = cityField.getText().toString();
		if(city.equals(""))
		{
			valid[2] = false;
		}
		
		final EditText stateField = (EditText) findViewById(R.id.stateField);  
		String state = stateField.getText().toString();
		if(state.equals(""))
		{
			valid[3] = false;
		}
		
		final EditText zipField = (EditText) findViewById(R.id.zipCodeField);  
		String zip = zipField.getText().toString();
		if(zip.equals(""))
		{
			valid[4] = false;
		}
		
		final EditText DOBField = (EditText) findViewById(R.id.DOBField);  
		String DOB = DOBField.getText().toString();
		if(DOB.equals(""))
		{
			valid[5] = false;
		}
		
		final EditText landlinePhoneField = (EditText) findViewById(R.id.landlinePhoneField);  
		String landlinePhone = landlinePhoneField.getText().toString();
		
		final EditText cellPhoneField = (EditText) findViewById(R.id.cellPhoneField);  
		String cellPhone = cellPhoneField.getText().toString();
		
		final EditText emailField = (EditText) findViewById(R.id.emailField);  
		String email = emailField.getText().toString();
		
		final EditText highSchoolField = (EditText) findViewById(R.id.highSchoolField);  
		String highSchool = highSchoolField.getText().toString();
		if(highSchool.equals(""))
		{
			valid[7] = false;
		}
		
		final EditText highSchoolCityStateField = (EditText) findViewById(R.id.highSchoolCityStateField);  
		String highSchoolCityState = highSchoolCityStateField.getText().toString();
		
		final EditText highSchoolGraduationField = (EditText) findViewById(R.id.highSchoolGraduationField);  
		String highSchoolGraduation = highSchoolGraduationField.getText().toString();
		if(highSchoolGraduation.equals(""))
		{
			valid[8] = false;
		}
		
		final EditText highSchoolGPAField = (EditText) findViewById(R.id.highSchoolGPAField);  
		String highSchoolGPA = highSchoolGPAField.getText().toString();
		
		final EditText transferStudentCollegesField = (EditText) findViewById(R.id.transferStudentCollegesField);  
		String transferStudentColleges = transferStudentCollegesField.getText().toString();
		
		final EditText academicInterestsField = (EditText) findViewById(R.id.academicInterestsField);  
		String academicInterests = academicInterestsField.getText().toString();
		
		final EditText collegeGPAField = (EditText) findViewById(R.id.collegeGPAField);  
		String collegeGPA = collegeGPAField.getText().toString();
		
		final EditText collegiateAthleticsField = (EditText) findViewById(R.id.collegiateAthleticsField);  
		String collegiateAthletics = collegiateAthleticsField.getText().toString();
		
		final EditText collegiateExtracurricularsField = (EditText) findViewById(R.id.collegiateExtracurricularsField);  
		String collegiateExtracurriculars = collegiateExtracurricularsField.getText().toString();
		
		final EditText citizenshipField = (EditText) findViewById(R.id.citizenshipField);  
		String citizenship = citizenshipField.getText().toString();
		
		boolean formValid = true;
		
		for(int i = 0; i < valid.length; i++)
		{
			formValid = formValid && valid[i];
		}
		
		if(formValid == false)
		{
			Bundle params = new Bundle();
			params.putBooleanArray("validityArray", valid);
			Class ourClass;
			try {
				ourClass = Class.forName("com.lorascollege.katie.requestInformation");
				Intent newIntent = new Intent(requestInformation.this,ourClass);
				newIntent.putExtras(params);
				startActivity(newIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
		Intent sendIntent = new Intent(android.content.Intent.ACTION_SEND);  
		
		String sendTo[] = {"katie.burke@loras.edu"};
		sendIntent.putExtra(android.content.Intent.EXTRA_EMAIL, sendTo);
		sendIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Prospective Student Information Request From "+name);
		sendIntent.setType("plain/text");
		
		String message = "Title:  "+titleIndicator+"\nName: "+name+"\nPreferred Name: "+preferredName+"\nStreet Address: "+address+"\nCity: "+city+"\nState: "+state+"\nDate of Birth: "+DOB+"\nLandline Phone Number: "+landlinePhone+"\nCell Phone Number:  "+cellPhone+"\nEmail Address:  "+email+"\nIntended Start Term:  "+startTerm+"\nHigh School:  "+highSchool+"\nHigh School City and State:  "+highSchoolCityState+"\nHigh School Graduation Year:  "+highSchoolGraduation+"\nHigh School Grade Point Average:  "+highSchoolGPA+"\nTransfer Student, please list colleges attended:  "+transferStudentColleges+"\nAcademic Interest:  "+academicInterests+"\nCollege/University Grade Point Average:  "+collegeGPA+"\nCollegiate Athletics:  "+collegiateAthletics+"\nCollegiate Extracurricular Activities:  "+collegiateExtracurriculars+"\nAre you a United States citizen?:  "+usCitizen+"\nIf not, please indicate Country of Citizenship:  "+citizenship;
		
		sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(Intent.createChooser(sendIntent, "Send your email in:"));  
		}
		
		
	}
	
}
