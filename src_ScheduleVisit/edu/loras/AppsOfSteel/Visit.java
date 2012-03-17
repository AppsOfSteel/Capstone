package edu.loras.AppsOfSteel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;





public class Visit extends Activity {
	String visit="", fam="", present="";
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		setContentView(R.layout.visit);

		Button submit = (Button) findViewById(R.id.btnSub);
		Button clear = (Button) findViewById(R.id.btnClear);
		final TextView text1 = (TextView)findViewById(R.id.textView33);
		final TextView text2 = (TextView)findViewById(R.id.textView34);
		final TextView text3 = (TextView)findViewById(R.id.textView35);
		final TextView text4 = (TextView)findViewById(R.id.textView36);
		final EditText name = (EditText)findViewById(R.id.txtName);
		final EditText lastname = (EditText)findViewById(R.id.txtLast);
		final EditText email = (EditText)findViewById(R.id.txtEmail);
		final EditText phone = (EditText)findViewById(R.id.txtPhone);
		final EditText address = (EditText)findViewById(R.id.txtAddress);
		final EditText city = (EditText)findViewById(R.id.txtCity);
		final Spinner state = (Spinner)findViewById(R.id.spnPerState);
		final EditText zip = (EditText)findViewById(R.id.txtZip);
		final EditText HighSchool = (EditText)findViewById(R.id.txtHighSchoolName);
		final EditText HighSchoolCity = (EditText)findViewById(R.id.txtHSCity);
		final EditText HighSchoolGPA = (EditText)findViewById(R.id.txtGPA);
		final EditText ACT = (EditText)findViewById(R.id.txtAct);
		final EditText SAT = (EditText)findViewById(R.id.txtSat);
		final EditText Major = (EditText)findViewById(R.id.txtMajor);
		final EditText ExtraCurricular = (EditText)findViewById(R.id.txtExtra);
		final EditText Athletics = (EditText)findViewById(R.id.txtAthletic);
		final EditText CollegesAttended = (EditText)findViewById(R.id.txtColleges);
		final EditText CollegeGpa = (EditText)findViewById(R.id.txtCollegeGPA);
		final EditText Departure = (EditText)findViewById(R.id.txtDepTime);
		final EditText VisitFac = (EditText)findViewById(R.id.txtDpFac);
		final EditText VisitAth = (EditText)findViewById(R.id.txtAthCoaches);
		final EditText AlumniName = (EditText)findViewById(R.id.txtNameAlum);
		final RadioGroup Alumni = (RadioGroup)findViewById(R.id.rdGrAlumni);
		final RadioGroup Present = (RadioGroup)findViewById(R.id.rdGrPresent);
		final RadioButton AlmYes = (RadioButton)findViewById(R.id.radAlmYes);
		final RadioButton AlmNo = (RadioButton)findViewById(R.id.radAlmNo);
		final RadioButton PrYes = (RadioButton)findViewById(R.id.radPresentYes);
		final RadioButton PrNo = (RadioButton)findViewById(R.id.radPresentNo);
		final CheckBox MeetFac = (CheckBox)findViewById(R.id.chkFaculty);
		final CheckBox Lunch = (CheckBox)findViewById(R.id.chkLunch);
		final CheckBox TraditionalVisit = (CheckBox)findViewById(R.id.chkTrdVisit);
		final CheckBox CoachMeeting = (CheckBox)findViewById(R.id.chkMeetWithCoach);
		String[] items = new String[] {"Make your selection...","Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		state.setAdapter(adapter);
		final Spinner HighSchoolState = (Spinner)findViewById(R.id.spnState);
		items = new String[] {"Make your selection...","Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		HighSchoolState.setAdapter(adapter);
		
		
		
		final Spinner GraduationYear = (Spinner)findViewById(R.id.spnGradYear);
		items = new String[] {"Make your selection...","2012","2013","2014","2015","2016"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		GraduationYear.setAdapter(adapter);

		final Spinner Date =(Spinner)findViewById(R.id.spnDate);
		items = new String[] {"Make your selection...","3/5/2012","3/6/2012","3/7/2012","3/8/2012","3/9/2012","3/12/2012","3/13/2012","3/14/2012","3/15/2012","3/16/2012","3/19/2012","3/20/2012","3/21/2012","3/22/2012","3/23/2012","3/26/2012","3/27/2012","3/28/2012","3/29/2012","3/30/2012","4/2/2012","4/3/2012","4/4/2012","4/10/2012","/11/2012","4/12/2012","4/13/2012","4/16/2012","4/17/2012","4/18/2012","4/19/2012","4/20/2012","4/23/2012","4/24/2012","4/25/2012","4/26/2012","4/27/2012","4/30/2012","5/1/2012","5/2/2012","5/3/2012","5/4/2012","5/7/2012","5/8/2012","5/9/2012","5/10/2012","5/11/2012","5/21/2012","5/22/2012","5/23/2012","5/24/2012","5/25/2012","5/29/2012","5/30/2012","5/31/2012"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Date.setAdapter(adapter);

		final Spinner Time =(Spinner)findViewById(R.id.spnTime);
		items = new String[] {"Make your selection...","9:00am","10:30am","1:00pm","3:00pm"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Time.setAdapter(adapter);

		final Spinner Visitors =(Spinner)findViewById(R.id.spnVisitors);
		items = new String[] {"Make your selection...","1","2","3","4","5+"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Visitors.setAdapter(adapter);

		final Spinner RelationshipToStudent =(Spinner)findViewById(R.id.spnStudentRelationship);
		items = new String[] {"Make your selection...","Parent","Grandparent","Step Parent","Sibiling","Step Sibiling", "Other"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		RelationshipToStudent.setAdapter(adapter);
		
		final Spinner YearGraduatedLoras =(Spinner)findViewById(R.id.spnAttendedLoras);
		items = new String[] {"Make your selection...","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012"};
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		YearGraduatedLoras.setAdapter(adapter);
		
		final Spinner gender = (Spinner)findViewById(R.id.spnGender);

		final Spinner type = (Spinner)findViewById(R.id.spnType);

		items = new String[] {"Make your selection...","Male", "Female"};
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		gender.setAdapter(adapter);

		String[] items1 = new String[] {"Make your selection...","Freshman", "Transfer"};
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items1);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		type.setAdapter(adapter1);
		AlmYes.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RelationshipToStudent.setVisibility(0);
				Present.setVisibility(0);
				AlumniName.setVisibility(0);
				YearGraduatedLoras.setVisibility(0);
				text1.setVisibility(0);
				text2.setVisibility(0);
				text3.setVisibility(0);
				text4.setVisibility(0);
				
			}
		});
		AlmNo.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				RelationshipToStudent.setVisibility(RelationshipToStudent.INVISIBLE);
				Present.setVisibility(Present.INVISIBLE);
				AlumniName.setVisibility(AlumniName.INVISIBLE);
				YearGraduatedLoras.setVisibility(YearGraduatedLoras.INVISIBLE);
				text1.setVisibility(text1.INVISIBLE);
				text2.setVisibility(text2.INVISIBLE);
				text3.setVisibility(text3.INVISIBLE);
				text4.setVisibility(text4.INVISIBLE);
				
			}
		});
		clear.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				name.setFocusable(true);
				name.setText("");
				email.setText("");
				phone.setText("");
				address.setText("");
				zip.setText("");
				state.setSelection(0);
				lastname.setText("");
				city.setText("");
				HighSchool.setText("");
				HighSchoolCity.setText("");
				HighSchoolGPA.setText("");
				ACT.setText("");
				SAT.setText("");
				Major.setText("");
				ExtraCurricular.setText("");
				Athletics.setText("");
				CollegesAttended.setText("");
				CollegeGpa.setText("");
				Departure.setText("");
				VisitFac.setText("");
				VisitAth.setText("");
				AlumniName.setText("");
				HighSchoolState.setSelection(0);
				GraduationYear.setSelection(0);
				Date.setSelection(0);
				type.setSelection(0);
				gender.setSelection(0);
				Time.setSelection(0);
				YearGraduatedLoras.setSelection(0);
				RelationshipToStudent.setSelection(0);
				Visitors.setSelection(0);
				Alumni.check(-1);
				Present.check(-1);
				present="";
				fam="";
				visit="";
				AlmYes.setChecked(false);
				AlmNo.setChecked(false);
				PrYes.setChecked(false);
				PrNo.setChecked(false);
				MeetFac.setChecked(false);
				CoachMeeting.setChecked(false);
				TraditionalVisit.setChecked(false);
				Lunch.setChecked(false);
				name.requestFocus();



			}
		});

		submit.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String error ="";
				boolean errors=false;
				// TODO Auto-generated method stub
				if(name.getEditableText().length()==0){
					
						error+="Input valid first name"+"\n";
					
						errors=true;

				}
				if(lastname.getEditableText().length()==0){
					if(error.equals(""))
						error="Input valid last name"+"\n";
					else
						error+="Input valid last name"+"\n";
					errors=true;
				}
				if(address.getEditableText().length()==0){
					if(error.equals(""))
						error="Input valid address name"+"\n";
					else
						error+="Input valid address name"+"\n";
					errors=true;
				}
				if(city.getEditableText().length()==0){
					if(error.equals(""))
						error="Input valid city name"+"\n";
					else
						error+="Input valid city name"+"\n";
					errors=true;
				}
				if(state.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select valid state"+"\n";
					else
						error+="Select valid state"+"\n";
					errors=true;
				}
				if(zip.getEditableText().length()!=5){
					if(error.equals(""))
						error="Input valid zipcode"+"\n";
					else
						error+="Input valid zipcode"+"\n";
					errors=true;
				}
				if(gender.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select your gender!"+"\n";
					else
						error+="Select your gender!"+"\n";
					errors=true;
				}
				if(type.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select valid student type."+"\n";
					else
						error+="Select valid student type."+"\n";
					errors=true;
				}
				String valid_email = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
				CharSequence inpemail = email.getEditableText();  
				Pattern pattern = Pattern.compile(valid_email,Pattern.CASE_INSENSITIVE);  
				Matcher matcher = pattern.matcher(inpemail);  
				if(!matcher.matches()){  
					if(error.equals(""))
						error="Input valid email address"+"\n";
					else
						error+="Input valid email address"+"\n";
					errors=true;
				}  
				String valid_phone = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
				CharSequence inpphone = phone.getEditableText();  
				pattern = Pattern.compile(valid_phone);  
				matcher = pattern.matcher(inpphone);  
				if(!matcher.matches()){  
					if(error.equals(""))
						error="Input valid phone number!"+"\n";
					else
						error+="Input valid phone number!"+"\n";
					errors=true;
				}
				if(HighSchool.getEditableText().length()==5){
					if(error.equals(""))
						error="Input valid High School Name"+"\n";
					else
						error+="Input valid High School Name"+"\n";
					errors=true;
				}
				if(HighSchoolCity.getEditableText().length()==5){
					if(error.equals(""))
						error="Input valid High School City"+"\n";
					else
						error+="Input valid High School City"+"\n";
					errors=true;
				}
				if(HighSchoolState.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select Valid High School State"+"\n";
					else
						error+="Select Valid High School State"+"\n";
					errors=true;
				}
				if(GraduationYear.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select Valid Graduation Year"+"\n";
					else
						error+="Select Valid Graduation Year"+"\n";
					errors=true;
				}
				if(Date.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select Valid Visit Date!"+"\n";
					else
						error+="Select Valid Visit Date!"+"\n";
					errors=true;
				}
				if(Time.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select Valid Visit Time!"+"\n";
					else
						error+="Select Valid Visit Time!"+"\n";
					errors=true;
				}
				if(Visitors.getSelectedItemId()==0){
					if(error.equals(""))
						error="Select Valid Number of Visitors!"+"\n";
					else
						error+="Select Valid Number of Visitors!"+"\n";
					errors=true;
				}
				if(AlmYes.isChecked()&&AlumniName.getEditableText().length()==0){
					if(error.equals(""))
						error="Please enter a valid name for the alumni!"+"\n";
					else
						error+="Please enter a valid name for the alumni!"+"\n";
					errors=true;
				}
				if(AlmYes.isChecked()&&RelationshipToStudent.getSelectedItemId()==0){
					if(error.equals(""))
						error="Please select valid relationship between student and alumni!"+"\n";
					else
						error+="Please select valid relationship between student and alumni!"+"\n";
					errors=true;
				}
				if(AlmYes.isChecked()&&YearGraduatedLoras.getSelectedItemId()==0){
					if(error.equals(""))
						error="Please select valid year when the alumni graduated from Loras!"+"\n";
					else
						error+="Please select valid year when the alumni graduated from Loras!"+"\n";
					errors=true;
				}
				if(AlmYes.isChecked()&&!PrYes.isChecked()&&!PrNo.isChecked()){
					if(error.equals(""))
						error="Please indicate if the alumni will be present during your visit!"+"\n";
					else
						error+="Please indicate if the alumni will be present during your visit!"+"\n";
					errors=true;
				}
				if(errors)
				{
					show_alert(error);
				}
				else{
					Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);


					emailIntent.setType("plain/text");
					emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"aserafimoski@gmail.com"});
					emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Schedule a visit day for: "+name.getText().toString());

					if(AlmYes.isChecked()){
						fam="Yes";
					}
					else if(AlmNo.isChecked()){		
						fam="No";
					}

					if(PrYes.isChecked()){
						present="Yes";
					}
					else if(PrNo.isChecked()){		
						present="No";
					}

					if(MeetFac.isChecked()){
						if(visit.equals(""))
							visit+="Meet with Faculty";
						else
							visit+=", Meet with Faculty";


					}
					if(Lunch.isChecked()){	
						if(visit.equals(""))
							visit+="Enjoy a Complimentary Launch(If visiting between 11:10am and 1:30pm)";
						else
							visit+=", Enjoy a Complimentary Launch(If visiting between 11:10am and 1:30pm)";

					}
					if(TraditionalVisit.isChecked()){	
						if(visit.equals(""))
							visit+="Traditional Visit";
						else
							visit+=", Traditional Visit";



					}
					if(CoachMeeting.isChecked()){	
						if(visit.equals(""))
							visit+="Meeting with a Coach";
						else
							visit+=", Meeting with a Coach";

					}

					String content = "Personal Information"+"\n"+"\n"
							+"Student First Name: "+name.getText().toString()+"\n"
							+"Student Last Name: "+lastname.getText().toString()+"\n"
							+"Address: "+address.getText().toString()+"\n"
							+"City: "+city.getText().toString()+"\n"
							+"State: "+state.getSelectedItem().toString()+"\n"
							+"Zipcode: "+zip.getText().toString()+"\n"
							+"Gender: "+gender.getSelectedItem().toString()+"\n"
							+"Student Type: "+type.getSelectedItem().toString()+"\n"
							+"Email: "+email.getText().toString()+"\n"
							+"Phone Number: "+phone.getText().toString()+"\n"
							+"\n"+"\n"
							+"Academic Information"+"\n"+"\n"
							+"High School Name: "+HighSchool.getText().toString()+"\n"
							+"High School City: "+HighSchoolCity.getText().toString()+"\n"
							+"High School State: "+HighSchoolState.getSelectedItem().toString()+"\n"
							+"Graduation Year: "+GraduationYear.getSelectedItem().toString()+"\n"
							+"High School GPA: "+HighSchoolGPA.getText().toString()+"\n"
							+"ACT Score: "+ACT.getText().toString()+"\n"
							+"SAT Score: "+SAT.getText().toString()+"\n"
							+"Intended Major: "+Major.getText().toString()+"\n"
							+"Extra Curricular Interests in College: "+ExtraCurricular.getText().toString()+"\n"
							+"Intercollegiate Atheltic Interests: "+Athletics.getText().toString()+"\n"
							+"Colleges Attended: "+CollegesAttended.getText().toString()+"\n"
							+"College GPA: "+CollegeGpa.getText().toString()+"\n"
							+"\n"+"\n"
							+"Visit Details"+"\n"+"\n"
							+"Desired Visit Date: "+Date.getSelectedItem().toString()+"\n"
							+"Time: "+Time.getSelectedItem().toString()+"\n"
							+"Departure Time: "+Departure.getText().toString()+"\n"
							+"Visitors: "+Visitors.getSelectedItem().toString()+"\n"
							+"List of academic deparments/faculty that you want to visit: "+VisitFac.getText().toString()+"\n"
							+"List of athletic deparments/coaches that you want to visit: "+VisitAth.getText().toString()+"\n"
							+"List of athletic deparments/coaches that you want to visit: "+VisitAth.getText().toString()+"\n"
							+"What would you like to include in your visit: "+visit+"\n"
							+"\n"+"\n"
							+"Alumni Details"+"\n"+"\n"
							+"Is anyone in your family an alumunus/alumna of Loras?"+fam+"\n"
							+"If so, will they be present for the visit? "+present+"\n"
							+"Relationship to Student: "+RelationshipToStudent.getSelectedItem().toString()+"\n"
							+"Year graduated or attended Loras? "+YearGraduatedLoras.getSelectedItem().toString()+"\n";
					// Put the message into the Intent as more extra information,                   
					emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, content );

					// Start the Intent, which will launch the user's email 
					// app (make sure you save any necessary information in YOUR app
					// in your onPause() method, as launching the email Intent will
					// pause your app). This will create what I discussed above - a
					// popup box that the user can use to determine which app they would like
					// to use in order to send the email.
					startActivity(Intent.createChooser(emailIntent, "Send an email to Loral College Admissions."));
				}
			}
		});
	}


	private void show_alert(String msg) {
		// TODO Auto-generated method stub
		AlertDialog.Builder alert_box=new AlertDialog.Builder(this);
		alert_box.setTitle("Information is missing");
		alert_box.setMessage(msg);

		alert_box.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// Do whatever you wish, i am show Toast
				Toast.makeText(getApplicationContext(), "Provide valid information!", Toast.LENGTH_LONG).show();
			}
		});

		alert_box.show();
	}

}

