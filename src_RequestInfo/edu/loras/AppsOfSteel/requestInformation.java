package edu.loras.AppsOfSteel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	int[] editTextIds = {R.id.nameField, R.id.preferredNameField, R.id.addressField, R.id.cityField, R.id.stateField, R.id.zipCodeField, R.id.DOBField, R.id.landlinePhoneField, R.id.cellPhoneField, R.id.emailField, R.id.highSchoolField, R.id.highSchoolCityStateField, R.id.highSchoolGraduationField, R.id.highSchoolGPAField, R.id.transferStudentCollegesField, R.id.academicInterestsField, R.id.collegeGPAField, R.id.collegiateAthleticsField, R.id.collegiateExtracurricularsField, R.id.citizenshipField};
	int[] editTextViewIds = {R.id.nameText, R.id.preferredNameText, R.id.addressText, R.id.cityText, R.id.stateText, R.id.zipCodeText, R.id.DOBText, R.id.landlinePhoneText, R.id.cellPhoneText, R.id.emailText, R.id.highSchoolText, R.id.highSchoolCityStateText, R.id.highSchoolGraduationText, R.id.highSchoolGPAText, R.id.transferStudentCollegesText, R.id.academicInterestsText, R.id.collegeGPAText, R.id.collegiateAthleticsText, R.id.collegiateExtracurricularsText, R.id.citizenshipText};
	int[] radioIds = {R.id.titleGroup, R.id.intendedStartTermGroup,R.id.usCitizenGroup};
	int[] radioTextIds = {R.id.titleText, R.id.intendedStartTermText,R.id.usCitizenText};

	
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.request_information);
		
		Bundle bundle = getIntent().getExtras();
		if (bundle != null)
		{
			boolean[] validEditText = bundle.getBooleanArray("validEditText");
			String[] editTextEntries = bundle.getStringArray("editTextEntries");
			boolean[] validRadio = bundle.getBooleanArray("validRadio");
			int[] radioEntriesIds = bundle.getIntArray("radioEntriesIds");
			String[] radioEntries = bundle.getStringArray("radioEntries");
			
			checkRadioButtons(validRadio, radioEntriesIds, radioEntries, radioTextIds);
			
			for(int i = 0; i < validEditText.length; i++)
			{
				EditText temp = (EditText) findViewById(editTextIds[i]);
				
				if(!validEditText[i])
				{
					TextView tempText = (TextView) findViewById(editTextViewIds[i]);
					tempText.setTextColor(Color.rgb(255, 0, 0));
					tempText.setTypeface(null,Typeface.BOLD_ITALIC);
					
					switch(i)
					{
						case 0: 
							
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField requires at least a first and last name and contain only letters and spaces.");
									temp.setText("");
								}
								break;
						case 1:
								tempText.append("\nField may only contain letters and spaces.");
								temp.setText("");
								break;
						case 2:
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField may only contain letters, numbers, spaces, and periods");
									temp.setText("");
								}
								break;
						case 3:
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField may only conain letters and spaces");
									temp.setText("");
								}
								break;
						case 4:
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField must contain a valid state or state abbreviation");
									temp.setText("");
								}
								break;
						case 5:
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField must be strictly 5 integers in length");
									temp.setText("");
								}
								break;
						case 6:
								if(!isRequired(editTextEntries[i]))
								{
									tempText.append("\nField is required");
								}
								else
								{
									tempText.append("\nField contains illegal characters.");
									temp.setText("");
								}
								break;
					}
					
				}
				else
				{
					temp.setText(editTextEntries[i]);
				}
			}
			
		}
		
	}
	
	
	public void sendRequest(View button) {  

		boolean[] validEditText = new boolean[20];
		String[] editTextEntries = new String[20];
		
		boolean[] validRadio = new boolean[3];
		int[] radioEntriesIds = new int[3];
		String[] radioEntries = new String[3];
		
		for(int i = 0; i < validEditText.length ; i++)
		{
			validEditText[i] =  true;
		}
		
		for(int i = 0; i < validRadio.length; i++)
		{
			RadioGroup temp = (RadioGroup) findViewById(radioIds[i]);
			RadioButton tempString = (RadioButton) findViewById(temp.getCheckedRadioButtonId());
			
			if(tempString != null)
			{
				radioEntries[i] = tempString.getText().toString();
				radioEntriesIds[i] = temp.getCheckedRadioButtonId();
				validRadio[i] = true;
			}
			else
			{
				if(i == 1)
				{
					validRadio[1]  = false;
				}
				else
				{
					radioEntries[i] = "";
					validRadio[i] = true;
				}
			}
		}
		
		for(int i = 0; i < validEditText.length; i++)
		{
			EditText temp = (EditText) findViewById(editTextIds[i]);
			editTextEntries[i] = temp.getText().toString();
			
			switch (i)
			{
				case 0: 
						validEditText[i] = isRequired(editTextEntries[i]) && nameCheck(editTextEntries[i]);
						break;
				case 1:
						validEditText[i] = simpleTextEntry(editTextEntries[i]);
						break;
				case 2:
						validEditText[i] = streetAddressCheck(editTextEntries[i]) && isRequired(editTextEntries[i]);
						break;
				case 3:
						validEditText[i] = simpleTextEntry(editTextEntries[i]) && isRequired(editTextEntries[i]);
						break;
				case 4:
						validEditText[i] = isRequired(editTextEntries[i]) && stateCheck(editTextEntries[i]);
						break;
				case 5:
						validEditText[i] = isRequired(editTextEntries[i]) && zipcodeCheck(editTextEntries[i]);
						break;
				case 6:
						validEditText[i] = isRequired(editTextEntries[i]) && DOBCheck(editTextEntries[i]);
						break;
						
			}

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
			validEditText[7] = false;
		}
		
		final EditText highSchoolCityStateField = (EditText) findViewById(R.id.highSchoolCityStateField);  
		String highSchoolCityState = highSchoolCityStateField.getText().toString();
		
		final EditText highSchoolGraduationField = (EditText) findViewById(R.id.highSchoolGraduationField);  
		String highSchoolGraduation = highSchoolGraduationField.getText().toString();
		if(highSchoolGraduation.equals(""))
		{
			validEditText[8] = false;
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
		
		boolean editTextValid = true;
		boolean radioValid = true;
		
		for(int i = 0; i < validEditText.length; i++)
		{
			editTextValid = editTextValid && validEditText[i];
		}
		
		for(int i = 0; i < validRadio.length; i++)
		{
			radioValid = radioValid && validRadio[i];
		}
		
		if(!radioValid && !editTextValid)
		{
			Bundle params = new Bundle();
			params.putBooleanArray("validEditText", validEditText);
			params.putBooleanArray("validRadio", validRadio);
			params.putIntArray("radioEntriesIds", radioEntriesIds);
			params.putStringArray("radioEntries", radioEntries);
			params.putStringArray("editTextEntries", editTextEntries);
		
			Class ourClass;
			try {
				ourClass = Class.forName("edu.loras.AppsOfSteel.requestInformation");
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
		sendIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Prospective Student Information Request From "+editTextEntries[0]);
		sendIntent.setType("plain/text");
		
		String message = "Title:  "+radioEntries[0]+"\nName: "+editTextEntries[0]+"\nPreferred Name: "+editTextEntries[1]+"\nStreet Address: "+editTextEntries[2]+"\nCity: "+editTextEntries[3]+"\nState: "+editTextEntries[4]+"\nZip Code: "+editTextEntries[5]+"\nDate of Birth: "+editTextEntries[6]+"\nLandline Phone Number: "+landlinePhone+"\nCell Phone Number:  "+cellPhone+"\nEmail Address:  "+email+"\nIntended Start Term:  "+radioEntries[1]+"\nHigh School:  "+highSchool+"\nHigh School City and State:  "+highSchoolCityState+"\nHigh School Graduation Year:  "+highSchoolGraduation+"\nHigh School Grade Point Average:  "+highSchoolGPA+"\nTransfer Student, please list colleges attended:  "+transferStudentColleges+"\nAcademic Interest:  "+academicInterests+"\nCollege/University Grade Point Average:  "+collegeGPA+"\nCollegiate Athletics:  "+collegiateAthletics+"\nCollegiate Extracurricular Activities:  "+collegiateExtracurriculars+"\nAre you a United States citizen?:  "+radioEntries[2]+"\nIf not, please indicate Country of Citizenship:  "+citizenship;
		
		sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(Intent.createChooser(sendIntent, "Send your email in:"));  
		}
		
		
	}
	
	public void checkRadioButtons(boolean[] valid, int[] entryIds, String[] entries, int[] textIds)
	{
	for(int i = 0; i < valid.length; i++)
	{
		if(valid[i] == false)
		{
			TextView temp = (TextView) findViewById(textIds[i]);
			temp.setTextColor(Color.rgb(255, 0, 0));
			temp.setTypeface(null,Typeface.BOLD_ITALIC);
			
			if(i == 1)
			{
				temp.append("\nThis field is required.");
			}
		}
		else
		{
			if(entries[i] != "")
			{
				RadioGroup temp = (RadioGroup) findViewById(radioIds[i]);
				temp.check(entryIds[i]);
			}
		}
	}
	}
	
	boolean isRequired(String entry)
	{
		if(entry.equals(""))
		{
			return false;
		}
		
		return true;
	}
	
	boolean nameCheck(String name)
	{
		Pattern p = Pattern.compile("^[A-Za-z]+ [A-Za-z][A-Za-z ]+$");
		Matcher m = p.matcher(name);
		
		if(m.matches())
		{
			if(name.length() > 100)
			{
				return false;
			}
			
			return true;
		}
		
		return false;
	}
	
	boolean simpleTextEntry(String entry)
	{
		Pattern p = Pattern.compile("[A-Za-z ]+");
		Matcher m = p.matcher(entry);
		
		if(m.matches() || entry.equals(""))
		{
			if(entry.length() > 100)
			{
				return false;
			}
			
			return true;
		}
		
		return false;
	}
	
	boolean streetAddressCheck(String address)
	{
		Pattern p = Pattern.compile("[A-Za-z0-9 \\.]+");
		Matcher m = p.matcher(address);
		
		if(m.matches())
		{
			if(address.length() > 100)
			{
				return false;
			}
			
			return true;
		}
		
		return false;
	}
	
	boolean stateCheck(String state)
	{
		String[] stateArray = {"Alabama","AL","Montana","MT","Alaska","AK","Nebraska","NE","Arizona","AZ","Nevada","NV","Arkansas","AR","New Hampshire","NH","California","CA","New Jersey","NJ","Colorado","CO","New Mexico","NM","Connecticut","CT","New York","NY","Delaware","DE","North Carolina","NC","Florida","FL","North Dakota","ND","Georgia","GA","Ohio","OH","Hawaii","HI","Oklahoma","OK","Idaho","ID","Oregon","OR","Illinois","IL","Pennsylvania","PA","Indiana","IN","Rhode Island","RI","Iowa","IA","South Carolina","SC","Kansas","KS","South Dakota","SD","Kentucky","KY","Tennessee","TN","Louisiana","LA","Texas","TX","Maine","ME","Utah","UT","Maryland","MD","Vermont","VT","Massachusetts","MA","Virginia","VA","Michigan","MI","Washington","WA","Minnesota","MN","West Virginia","WV","Mississippi","MS","Wisconsin","WI","Missouri","MO","Wyoming","WY"};
		
		int begin = 0;;
		
		if(state.length() == 2)
		{
			begin = 1;
		}
		else
		{
			begin = 0;
		}
		
		for(int i = begin; i < stateArray.length; i=i+2)
		{
			if(stateArray[i].equals(state))
			{
				return true;
			}
		}
		
		return false;
	}
	
	boolean zipcodeCheck(String zipcode)
	{
		Pattern p = Pattern.compile("[0-9][0-9][0-9][0-9][0-9]");
		Matcher m = p.matcher(zipcode);
		
		if(m.matches())
		{
			return true;
		}
		
		return false;
	}
	
	boolean DOBCheck(String DOB)
	{
		Pattern p = Pattern.compile("[0-9A-Za-z\\-\\,\\ ]+");
		Matcher m = p.matcher(DOB);
		
		if(m.matches())
		{
			if(DOB.length() > 20)
			{
				return false;
			}
			
			return true;
		}
		
		return false;
	}
	
}

