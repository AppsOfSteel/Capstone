package edu.loras.AppsOfSteel;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.Gravity;

import android.view.View;
import android.view.ViewGroup;

import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import android.widget.TextView;




/**
 * Demonstrates expandable lists using a custom {@link ExpandableListAdapter}
 * from {@link BaseExpandableListAdapter}.
 */
public class ExpandableList1 extends ExpandableListActivity {

	ExpandableListAdapter mAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Set up our adapter
		mAdapter = new MyExpandableListAdapter();
		setListAdapter(mAdapter);
		registerForContextMenu(getExpandableListView());
	}



	@Override
	public boolean onChildClick(ExpandableListView parent, View v,
			int groupPosition, int childPosition, long id) {
		// TODO Auto-generated method stub
		super.onChildClick(parent, v, groupPosition, childPosition, id);
		//setContentView(R.layout.expandable);
		//final TextView title = (TextView)findViewById(R.id.textView1);
		
		int pos_child = childPosition;
		int pos_group = groupPosition;
		String name = null;
		String info = null;
		if(pos_group==0)
		{
			switch(pos_child){
			case 0: 
				name="Accounting Club";
				info="Accounting Club provides its members personal and professional development opportunities through education, association with business professionals, and certificationin management accounting and financial managementskills. Accounting Club practices as a respected institution influencing the concepts and ethical practicesof management accounting and financial management.Accounting Club also takes local business tours, invites individuals working in the accounting field to speak atmeetings, performs community service, raises funds for club activities and sponsors social gatherings. Accounting Club also provides résumé and interviewing tips as well as networking opportunities.";
				break;
			case 1: 
				name="Advertising and Marketing Association";
				info="The Advertising and Marketing Association (AMA) providesan opportunity for individuals to learn more about business,especially in the areas of advertising and marketing.The club takes local tours, invites individuals working inadvertising and marketing to speak at meetings, takes field trips to advertising and marketing organizations outsideof the Dubuque area, performs community service, raisesfunds for club activities and sponsors social gatherings. Their activities allow AMA members to learn companyand industry information, job descriptions, strategies forfinding jobs and internships, résumé and interviewing tips and much more. Besides simply informing membersabout the business world, the interaction the organizationhas with business professionals also provides networkingopportunities for student";
				break;
			case 2: 
				name="American Chemical Society";
				info="The American Chemical Society (ACS) is the world’s largest scientific society, with more than 155,000 members. The Loras College student affiliate of the ACS is open to all students interested in the field of chemistry. The goals of this organization are to give students the opportunity to become better acquainted with the field of chemistry, to foster a professional spirit among members, to instill a professional pride in the sciences and to foster an awareness of the responsibilities and challenges that modern chemists and scientists encounter. Activities include several social events, a volunteer chemistry tutoring program, Boy Scout Chemistry Merit Badge Day, field trips to chemical companies, chemistry shows given to local young people and trips to ACS local section and ACS national meetings. For more information, contact Dr. David Oostendorp at (563) 588-7259.";
				break;
			case 3: 
				name="Association for Computing Machinery";
				info="The Association for Computing Machinery (ACM) is a student chapter of the international scientific and educational organization of ACM. The Loras chapter and international organization are dedicated to education and informing members and non-members of issues in computers, information technology and the arts and sciences. The main area of focus for the Loras chapter is to increase the knowledge of and interest in modern computers, and to allow a means of communication between the student members, Loras community and local businesses. For more information, contact Dr. David Oostendorp at (563) 588-7259.";
				break;
			case 4: 
				name="Athletic Training Club";
				info="Athletic Training Club is an organization that helps promote the profession of athletic training and the importance of athletic trainers in the allied health care field. Throughout the year, our club participates in athletic training related events such as volunteer medical staff at the Chicago Marathon and Preseason Prep Bowl hosted at Soldier Field. In addition, the club does several fundraisers to raise money to attend athletic training conferences, such as the National Athletic Training Association Annual Convention. Overall, Athletic Training Club helps to further the athletic training education and opportunities for athletic training experiences.";
				break;
			case 5: 
				name="Delta Epsilon Sigma";
				info="Delta Epsilon Sigma (DES) is a national honor society that is in place at Catholic colleges and universities, whose mission is to recognize academic accomplishments, foster scholarly activities, and encourage a sense of intellectual community among its members, though members need not be Catholic. Students are invited to join if they are juniors or seniors and have a GPA of at least 3.7. Faculty is invited on the basis of a nomination process, length of service to Loras and contributions to the lives of students and to the academic atmosphere. Loras’ chapter, Alpha, provides peer tutoring, assists with the Multicultural Family Center, co-sponsors a literary publication with the English program (The Limestone Review), and sponsors a writing contest each year. In addition, the national office offers several scholarships and other awards to qualified members. For more information about The Limestone Review, contact Dr. Elizabeth Raschke at (563) 588-7200. For other matters pertaining to the society, contact Dr. Matthew Garrett at (563) 588-7165.";
				break;
			case 6: 
				name="Economics Club";
				info="The Economics Club is an organization for economics majors, minors and anyone interested in how economics affects local, national and international issues. The club brings the teaching of economics at Loras to the world around Dubuque. Activities include speakers and discussions on current economic topics, field trips and social gatherings plus a variety of campus functions. Members of the Economic Club also volunteer as tutors for students in the introductory economics courses. For more information, contact Dr. Laddie Sula, faculty advisor, at (563) 588-7507. Please also consult the Economics Club webpage.";
				break;
			case 7: 
				name="Engineering and Physics Club";
				info="The Engineering and Physics Club is an organization open to all members of the Loras College community. A focus of the club is to aid engineering and physics students with their yearly projects. The club tours local companies that might employ Loras College graduates as well as other campuses that are of interest to members of the club. Additional activities include recruiting presenters for lectures of interest for the group as well as fundraising. The club members attempt to enter at least one engineering design contest each year for the students to gain real-world engineering experience. The club maintains an eLearn site with member information and a schedule of events. For more information or to be added to the eLearn site, contact the club advisor, Dr. Clark Merkel, at Clark.Merkel@loras.edu.";
				break;
			case 8: 
				name="Financial Management Association";
				info="The Financial Management Association (FMA) was created to: (1) assist in the professional, development of college students interested in finance, banking and investments; (2) provide networking opportunities for students interested in these fields with business professionals, faculty and other students; and (3) enhance knowledge about and provide opportunities relating to careers in finance. This is accomplished through activities including regular organization meetings, on and off campus speakers, trips and company tours and social and professional gatherings. For more information contact John Upstrom at John.Upstrom@loras.edu. ";
				break;
			case 9: 
				name="Future Educators of Loras College";
				info="The Future Educators of Loras College provides students interested in becoming educators with information and support as they go through the program as well as offering resources and advice within the Dubuque Community School District. We offer multiple opportunities for students to learn about the requirements to be accepted, when to start sending out your resume, job fair information, as well as offering a student teaching panel to provide first-hand knowledge to student questions.";
				break;
			case 10: 
				name="Health Science Club";
				info="The Health Science Club is a campus organization open to everyone, especially those interested in the health sciences. The Health Science Club holds monthly meetings during which service, social, fundraising and educational programs are discussed. Service activities include volunteering with Dance Marathon, Hills and Dales, the Dubuque Regional AIDS Coalition, MDA, March of Dimes, blood drives and blood pressure checks. Fundraising opportunities range from selling t-shirts to candy bars. The programming committee arranges speakers to talk to students. Ophthalmologists, optometrists, chiropractors, radiologists, podiatrists, veterinarians, medical students, medical researchers, physician assistants, physical therapists, dentists and other health care professionals have come to campus to talk about their jobs, training and lifestyles. Furthermore, there are a variety of social activities. The Health Science Club aims to provide information and answer questions for important career decisions in the health field. For more information, contact Dr. Tom Davis at (563) 588-7767.";
				break;
			case 11: 
				name="Loras Alternative Dispute Resolution Society";
				info="Loras Alternative Dispute Resolution Society (LADRS) is a chapter of the International Alternative Dispute Resolution Society, an organization for professional mediators across the globe. LADRS members make up the Loras College Mediation Team which competes in regional and national tournaments as well as several invitational tournaments throughout the fall semester. The goal of LADRS is to educate students about negotiation, a necessary skill in the workplace environment. LADRS members are trained in mediation and dispute resolution techniques and are taught a number of times during the year to maintain skills and also observe professional mediators in their trade. For more information, contact Ron.Collins@loras.edu.";
				break;
			case 12: 
				name="Loras College Mediation Team";
				info="The Loras College Mediation Team works on peaceful conflict resolution and attends a regional conference and tournament in October in Wisconsin and the National Conference and Intercollegiate Championship Tournament in mid-November in Chicago. Loras is currently ranked among the top ten teams in the U.S. in the past five years. For more information, contact Professor Mary Lynn Neuhaus, J.D., 421 Hoffmann Hall.";
				break;
			case 13: 
				name="Loras College Mock Trial Team";
				info="Loras College Mock Trial Team, currently nationally ranked, is an intercollegiate trial advocacy competition. The season begins after Labor Day with a national case release, tournaments in October through December in the Midwest, continues to a national season in the winter ending in April at the National Championship Tournament. Loras has two teams, a varsity and a novice team. If you have experience in acting or forensics, you may want to try out for a witness role. If you are pre-law or an experienced high school debater, forensic competitor or high school mocker, an attorney role could be yours. Loras pays for travel expenses. Academic credit is available by registering for COM 259. For more information, see Professor Mary Lynn Neuhaus, pre-law advisor, 421 Hoffmann Hall.";
				break;
			case 14: 
				name="Loras College Moot Court Team";
				info="Student teams participate in simulation of a legal argument before an appellate court. Teams prepare a legal brief on the real constitutional issues presented in the hypothetical case and present it in oral argument before a panel of judges at a regional and national intercollegiate tournament. The regional tournament takes place in November, with the national championship tournament in January. Moot Court emphasizes understanding and applying legal reasoning and argumentation, and it also refines persuasive writing and speaking skills. Students interested in law are encouraged to participate. For more information, see Professor Christopher Budzisz, Ph.D., 540 Hoffmann Hall, christopher.budzisz@loras.edu.";
				break;
			case 15: 
				name="Loras Philosophy Club";
				info="The Loras Philosophy Club provides students an opportunity to engage in critical thinking about philosophical issues. In today’s society, there is more need than ever to develop one’s mind and ability to reason. Complicated issues arise constantly in the form of ethical dilemmas about abortion, euthanasia, genetics, politics and education; and many ancient metaphysical questions remain debated on topics such as truth, existence, human nature, art and God. To be knowledgeable and conversant in these and other fields and issues is the hallmark of a well-educated person. The Loras Philosophy Club provides opportunities for participating in informal discussions (often spirited), viewing films, lectures and field trips, all in the interest of learning more about philosophical issues relevant to the times and situations in which students find themselves. For more information, contact Brandon Schetgen at Brandon.Schetgen@loras.edu.";
				break;
			case 16: 
				name="Loras Students for Inclusive Education";
				info="Loras Students for Inclusive Education is an active, professional group of students who are interested in expanding their knowledge of current issues in special education with a focus on educational practices to fully include all students in the general education setting. The purpose of LSIE is for students who plan to become teachers specializing in early childhood, elementary, secondary, or special education to explore educational issues and apply what is learned in the community to promote inclusion. LSIE is also a scholarly and service based organization. Interested students may get in touch with our president, Chrissy Fischer, at Christine.Fischer@loras.edu or our advisor, Janine Kane, at Janine.Kane@loras.edu";
				break;
			case 17: 
				name="Loras Math Club";
				info="The Loras Math Club is an organization of students and faculty/staff members who enjoy the same love for mathematics. During the school year, the Math Club is involved in a number of social events, including Thursday Nights at the Heidenreich’s, where we study, snack and play games at our professor’s home. The Club is also involved in t-shirt fundraisers, and has done several service projects with children of the Dubuque community. The Math Club travels to math conferences to see what others are studying and to present their own topics. The Club also holds a “Regressive Dinner” each semester at the homes of various professors and students. The members are able to go on trips related to their interest. The Math Club is not just for math majors, but is for anyone who enjoys math. For more information, contact Dr. Jacob Heidenreich at Jacob.Heidenreich@loras.edu or (563) 588-7793.";
				break;
			case 18: 
				name="Paideia";
				info="Paideia is the name of the organization for students and faculty who participate in the Honors Program. Paideia seeks to build community within the Honors Program through social activities and community service, as it contributes to the life of the College through a range of campus programming. Paideia brings in speakers, hosts movie and book discussions, organizes student research presentations and facilitates the participation of students in off-campus academic events such as conferences. For more information, contact John Eby at (563) 588-4929 or john.eby@loras.edu.";
				break;
			case 19: 
				name="Phi Beta Lambda";
				info="Phi Beta Lambda is an education association with a quarter million students preparing for careers in business and business-related fields. PBL is the largest business career student organization in the world. The postsecondary division reaches over 11,000 college students. Through state-based competition at the spring State Leadership Conferences, students compete in events testing their business knowledge and skills. Top state winners then are eligible to compete for honors at the National Leadership Conference each summer. Contact Professor Mathew Keyes for more information at Mathew.Keyes@loras.edu.";
				break;
			case 20: 
				name="Physical Education & Sports Studies Majors Club ";
				info="The club’s mission is to join students of the Athletic Training, Physical Education, Sport Management and Sport Science majors within the Physical Education and Sport Studies Division. Learning is not just done in the classroom, so we offer this club as an outside learning tool through social activities, meetings, service projects, speakers and conventions. During the 2009/2010 school year the club ran a successful Monday Night Football bags tournament, had members go to Cleveland, Ohio, and Chapel Hill, N.C., for case study competitions, and held a Grassroots Soccer Tournament to support the cause against AIDS in Africa. The club aims to help student funding throughout the program in the upcoming year with hopes to send students to the IAHPERD conference in November and case study competitions in New Orleans, La., and Chapel Hill, N.C. These outside learning programs will further enhance the total physical education/sport experience. Our club is here to help Loras College produce multifaceted educated students. The club will incorporate current issues, past ideas from alumni and records to help our students’ learning process here at Loras College. As reads in the Loras College Student Handbook, “extracurricular activities and clubs are here to better the total development and growth of the student.” We intend to offer added knowledge to the students in a fun, energetic and exciting manner. For more information, contact Matt Garrett at (563) 588-7165.";
				break;
			case 21: 
				name="Social Work Club";
				info="The Social Work Club is a way for all students to become involved in a wide variety of service opportunities. We strive to create change both on campus and in the community. The club helps sponsor activities such as Sleepout Dubuque and the Giving Tree program. Other activities we are involved in include the Candlelight Vigil for domestic violence, Special Olympics, the Big Brother/Big Sister Program, serving meals at Hope House, poverty simulations, visiting nursing homes and much more. In this organization, there are not simply opportunities to complete service, but also chances to meet new people, learn leadership skills and have fun at the same time! This organization is open to non-majors as well. For more information contact the Social Work Club’s advisor, Nancy Zachar Fett, at (563) 588-7029.";
				break;
			case 22: 
				name="The St. Thomas More Pre-Law Society";
				info="The St. Thomas More Pre-Law Society is a student organization intended for those students who are considering law school in the future. The Pre-Law Society provides opportunities to attend law school visits in the surrounding area, brings speakers from law school admissions boards to talk to students about the application process, and also offers many networking opportunities with legal professionals in the Loras and Dubuque communities. The society has volunteered for the Dubuque Mental Health Association and participated in the Clean-Up Dubuque project in the past years. The objectives of the St. Thomas More Pre-Law Society are to:- Help members make informed decisions about whether or not to attend law school- Help members choose which law schools to apply- Decode the law school admissions process- Expose members to various legal fields and introduce them to different options they have with a law degree- Help members register for the Law School Admissions Test (LSAT)The advisor for the Pre-Law Society is Deone Merkel, please contact deone.merkel@loras.edu.";
				break;
			case 23: 
				name="Writers’ Ink";
				info="Writers’ Ink is a group for those interested in writing anything, including poetry, novels, and anything in between. The group provides feedback, strategies, and critique for anyone who may have writer’s block, and it also tries to help young writers get editing and publishing information, so that one day they may see their works in print. Writers’ Ink has regular workshops and meetings, poetry and short story readings, and visiting authors and speakers, who share tips about getting started and the writing process. The group also participates in multiple community service projects, including book drives and reading events. For more information contact Susan Stone at susan.stone@loras.edu.";
				break;
			}
		}
		else if(groupPosition==1)
		{
			switch(childPosition){
			case 0: 
				name="Loras College Cheerleading";
				info="The Loras College Cheerleading Squad performs at home football games and home basketball games for the men and women. Membership is open to first year students, sophomores, juniors and seniors and is determined through a “try-out” selection process. Students who participate in the Cheerleading program must maintain the minimum GPA established by the Student Life Office and must participate in all activities assigned by the group’s advisor. For more information, contact the Athletic Department at (563) 588-7742. ";
				break;
			case 1: 
				name="Duhawk Dancers";
				info="Loras College’s dance team is the Duhawk Dancers. This group of Loras women performs dance routines for audiences during football, women’s basketball and men’s basketball games. Membership is open to first year students, sophomores, juniors and seniors and is determined through a “try-out” selection process. Students who participate in the Duhawk Dancers must maintain the minimum GPA established by the Student Life Office and must participate in all activities assigned by the group’s advisor. For more information, contact the team via the Athletic Department at (563) 588-7742. ";
				break;
			case 2: 
				name="Intermurals";
				info="Loras College is dedicated to the total development of the student. The intramural department strives to develop the student through a variety of recreational activities where participation is more important than winning. This participation has not only included the student body, but also faculty, staff, administrators and their families. Loras provides a highly organized and thoroughly developed supervised intramural program, which includes leagues, Sunday tournaments, and Friday events. All event winners receive a Loras College Intramural Champion t-shirt and at the end of the school year, an overall male, female, and faculty/staff “Intramural Athlete of the Year” award is presented. Over 600 participants compete in one or more of the 50 plus activities. For more information, contact Teresa Kehe, director of intramurals, at imoffice@loras.edu or (563) 588-7459.";
				break;
			case 3: 
				name="Judo Club";
				info="Judo is concerned with throwing and mat techniques, including chokes and armbars. It can be learned and practiced by both women and men. Physical size is not a limiting factor. Judo is an excellent means of self defense. Judo increases flexibility, coordination, balance, self- confidence and improves your physical condition. In Judo you may compete against other people at tournaments across the Midwest (competition is optional). No previous experience required. Experienced Judoka are welcomed. Practice is only two nights a week (Tuesday and Thursday) from 7:15-9:15 p.m. and may be taken for a credit or just for fun. Judo is a physical contact sport. Safety is stressed in classroom teaching. Therefore you assume your own risk in participating. Practices are in 208 Graber Sports Center (wrestling room). Wear workout clothes. For more information, contact Terry Smith at (563) 556-2352. ";
				break;
			case 4: 
				name="Loras Cycling Club";
				info=" The Loras Cycling Club is open to all Loras students who wish to further their knowledge and interest in bicycling. The purpose of the Loras Cycling Club is to provide an organized body to help promote an interest in bicycling for all students, faculty, and staff at Loras College. The club shall focus on bicycling in all its forms without an emphasis on a particular aspect, and all variants of riders are welcome to join, whether you be an avid racer or someone looking for a leisurely ride with other enthusiasts.” For information, contact Dr. Kevin Koch, at (563) 588-7536 or via email at Kevin.Koch@loras.edu.";
				break;
			case 5: 
				name="Loras Hockey Club";
				info="The Loras Hockey Club, founded in 1981, is an organization open to all Loras College students, regardless of their skill level or gender. The club provides its members an opportunity to play competitive hockey in an atmosphere that produces many memorable friendships and experiences. The hockey season runs from October through March, and consists of numerous on and off-ice practices and approximately 12 games. The first game of the year takes place during Homecoming weekend at Loras against a team consisting of Loras alumni. All other games are played against teams from the Midwest, such as Cornell College and the University of Wisconsin-Platteville. The season ends with a second game against a team consisting of Loras alumni, this time in Chicago, Illinois. For more information, contact the club’s advisor, Professor Roman T. Ciapalo at (563) 588-7434.";
				break;
			case 6: 
				name="Loras Ultimate Club";
				info="Loras Ultimate Club is an up and rising club in its second year on campus. We are an Ultimate Frisbee team that plays for the pure enjoyment of Ultimate and also play competitively in tournaments under the Ultimate Players Association (UPA) College league. We consist of students of all ages and we do not turn anyone away. No experience is necessary and we will teach the basics such as throwing techniques, catching and cutting as well as fundamentals in offense and defense. Any questions contact Jordan Metz at Jordan.Metz@loras.edu, Matt Rissler at Matthew.Rissler@ loras.edu or Andrew White at Andrew.White@loras.edu.";
				break;
			case 7: 
				name="Student Athlete Advisory Committee";
				info="The Student Athlete Advisory Committee (SAAC) is a student organization comprised of student-athletes. Two representatives from each conference recognized sport are involved in the committee. This organization meets regularly to plan events that aid in achieving their goals and enhance the total student athlete experience. As a NCAA Division III and IIAC institution, the committee is active with NCAA and IIAC issues and discussions. This organization serves as a great liaison between student athletes and the athletic department. In addition to its official duties as an organization, SAAC also sponsors service and volunteer opportunities such as take a kid to the game, campus clean- up and working NCAA/IIAC Championships Loras may host. The committee is advised by the Associate Athletic Director.";
				break;
			case 8: 
				name="Varsity Athletics";
				info="The Loras College Department of Athletics is affiliated with the NCAA Division III and is a member of the Iowa Intercollegiate Athletic Conference. For further information, contact the Department of Athletics at (563) 588-7112. Men: Loras offers 11 varsity sports for men which are baseball, basketball, cross-country, football, golf, soccer, swimming and diving, tennis, indoor track and field, outdoor track and field and wrestling. Women: Loras offers 10 varsity sports for women, which are basketball, cross-country, golf, soccer, softball, swimming and diving, tennis, indoor track and field, outdoor track and field and volleyball.";
				break;
			}
		}
		else if(groupPosition==2)
		{
			switch(childPosition){
			case 0: 
				name="Guild of St. Genesius";
				info="Guild of St. Genesius is a dramatic honor fraternity that rewards students for their efforts in participating in the shows at Loras, and is committed to stimulating interest in the college’s drama department. Members of Guild of St. Genesius also participate in a yearly Radio Show and a group trip to see a show. For more information, please contact Doug Donald, faculty advisor, at (563) 588-7941 or e-mail douglas.donald@loras.edu";
				break;
			case 1: 
				name="Psi Chi";
				info="Psi Chi is a National Honor Society for students of psychology. Membership in the organization is open to psychology majors and minors who meet the academic requirements for the Honor Society. Importantly, any student interested in Psychology is encouraged to attend the meetings and participate in the events, which include presenting at conferences, hosting a research night, and community activities. The goals of the Loras chapter of Psi Chi are to: 1. Promote academic excellence. 2. Advance the science of psychology. 3. Provide leadership opportunities for students. 4. Promote fellowship within the department and throughout the campus community. 5. Serve the Loras College campus and community. For more information, contact Lisa Grinde at Lisa.Grinde@loras.edu. ";
				break;
			}
		}
		else if(groupPosition==3)
		{
			switch(childPosition){
			case 0: 
				name="LEAD 4 LORAS";
				info="LEAD 4 LORAS is a 4-tiered leadership program designed to allow students to continue enhancing their leadership development and understanding throughout their years at Loras College. Each tier focuses on a different perspective of leadership: Learning, Exploring, Applying and Dedicating. Through active participation and completion of all tiers, students will have a better understanding of leadership and their own values and abilities and will be committed to a life of involvement and citizenship. Alternating tiers of the LEAD 4 LORAS program are offered every semester and each tier consists of 6-10 sessions. At the completion of each tier, participants receive a certificate of completion and the opportunity to continue on to participate in the next tier. Students may sign up to participate through the Student Life Office, 540 Alumni Campus Center. Tier 1: Learning—LEAD 4 LORAS Tier 1 focuses on enhancing the individual. Participants learn more about their personal values and leadership style. Tier 1 will help students to get involved on campus and help them to acquire the skills necessary to successfully hold leadership positions on campus and beyond. Tier 1 is offered during the spring semester every year. Tier 2: Exploring—LEAD 4 LORAS Tier 2 focuses on group dynamics and values. Participants have the opportunity to develop relationships and resources on campus. Participants are challenged to expand their existing understanding of leadership. The sessions help participants understand and actively pursue creative solutions to community problems. Tier 2 is offered during the fall semester every year and is open to graduates of Tier 1 as well as other interested students with leadership experience. Tier 3: Applying—LEAD 4 LORAS Tier 3 focuses on citizenship. Participants will begin to explore the importance of the four tenets of citizenship including: political participation, community service, philanthropy and societal issues. Tier 3 prepares students to participate fully as citizen leaders, engaged in service to the common good within a diverse and complex world. Tier 3 is offered during the spring semester every year and is open to graduates of Tier 2, as well as other interested students with leadership experience. Tier 4: Dedicating—LEAD 4 LORAS Tier 4 focuses on encouraging students to dedicate themselves to being active leaders in the community. This program is designed to help students explore different ways to encourage and facilitate social change. Tier 4 is offered during the fall semester every year and is open to graduates of Tier 3 as well as other interested students with leadership experience.";
				break;

			case 1: 
				name="Other Opportunities";
				info="Students at Loras College have the opportunity to develop their leadership skills through a variety of areas of involvement outside of the specifically designed leadership programs. Whether through Campus Ministry’s CORE Team, Student Life’s Resident Advisor positions, executive positions in various student organizations or through off-campus volunteering, opportunities to expand your leadership skills are abundant. Contact the department or area directly or stop by the Student Life Office to talk about your options!";
				break;
			}
		}
		else if(groupPosition==4)
		{
			switch(childPosition){
			case 0: 
				name="KLCR";
				info="KLCR is Loras College’s own student-operated radio station, offering a variety of opportunities to students interested in exploring the world of radio. KLCR is broadcast online at www.KLCR.org. KLCR is completely student run. Its daily operations are run by a student board of directors in the following positions: general manager, program director, music director, advertising director, public relations director and technical director. Those with interest may be involved in any aspect of the station, from management to production and from public relations to just playing music. Experience is not necessary, just enthusiasm. For more information contact Paul Kohl at Paul.Kohl@loras.edu or or Allison Zelesny at Allison.Zelesny@loras.edu.";
				break;

			case 1: 
				name="LCTV";
				info="Loras College Television (LCTV) is the campus television station run entirely by students. You can tune in on Channel 13 on campus or on digital Channel 97.5 in Dubuque. LCTV students produce newscasts, sportscasts, live broadcasts of home basketball, football and soccer games, documentaries, commercials and various other productions. LCTV’s shows are recognized every year among the top in Iowa and the best in the nation. You can check us out at myduhawk.com.  Anyone can get involved with LCTV at any time during their college career. For more information, call (563) 588-7032 or (563) 588-7385 or e-mail lctv@loras.edu. ";
				break;
			case 2: 
				name="Limestone Review";
				info="The Limestone Review is the Loras College literary/ scholarly-essay magazine, published once a year, featuring fiction, poetry, creative nonfiction and scholarly essays. Students may become involved by submitting work and/or by participating on the Reading/Selection Committee in the spring semester. The literary/scholarly publication is co- sponsored by the English Program and Delta Epsilon Sigma. For information, contact Dr. Kevin Koch, at (563) 588-7536 or via email at Kevin.Koch@loras.edu.";
				break;
			case 3: 
				name="Lorian";
				info="The Lorian, the Loras College student newspaper, is a main source of campus communication. Published weekly, the newspaper includes news, features, sports, editorials and advertisements. The student staff at The Lorian attempts to provide quality coverage of social, academic, athletic and religious areas of the Loras community. An online version of The Lorian also attempts to maintain contacts with alumni and friends of the College. The Lorian staff consists of about 40 students. Positions available include executive editors, section editors, assistant editors, reporters, advertising representatives, photographers and columnists. For more information, call the Lorian office at  (563) 588-7954 or stop in the Lorian office, 259 Hoffmann Hall. No experience is necessary.";
				break;
			case 4: 
				name="Purgold";
				info="Loras’ yearbook, The Purgold, first published in 1925, is the printed “memory book” of the Loras community. The yearbook works to represent Loras history, culture, organizations, sports and people. Each year the staff strives to create a better representation of Loras College with the publication’s design, photographs, information, stories and quotes. It is really the “face book” of Iowa’s oldest college. For the past several years, the Purgold has received the prestigious Walsworth Publishing Gallery of Excellence Award. With this honor, the publication will be found all across the country as an example of excellence for yearbook staffs. The Purgold is looking for students who are dedicated, work hard, excited for a challenge and ready to capture life at Loras College that will someday become cherished memories. Opportunities on the staff include committee members, photography, journalists, layout/design and editing. It is encouraged for applicants to have past yearbook experience and/or past software experience with Adobe InDesign and Photoshop. For more information and job applications, call Mike Gibson, advisor, at (563) 588-7163, email Michael.Gibson@loras.edu or stop by his office, 154 Academic Resource Center. ";
				break;
			}
		}
		else if(groupPosition==5)
		{
			switch(childPosition){
			case 0: 
				name="Loras Bands";
				info="Loras provides exciting opportunities for those students interested in continuing their involvement in instrumental music activities. The College Wind Ensemble is made up of students from all academic programs who wish to perform high quality concert music of various styles and genres. The Wind Ensemble performs throughout the academic year at both on- and off-campus venues. The Jazz Ensemble is made up of between 14-24 students who enjoy the jazz styles and the sounds of the big band. The jazz group performs at regular on campus festivities and also engages in community outreach by performing at local nursing homes, shopping malls and schools. Students involved in jazz ensemble come from all academic areas and share their love of the jazz idioms. The Loras Pep Band is open to all instrumentalists on campus and performs at the athletic events of the campus. This group of musicians is highly motivated and spirited and can be heard leading the cheers and building the excitement of the College sporting events. All three of these groups along with the ever-growing Chamber Ensembles are open to all students who desire to share their love of music with those around them. Contact  Dr. Glenn Pohland, director of instrumental music, at  (563) 588-7153 or glenn.pohland@loras.edu.";
				break;

			case 1: 
				name="Loras Choir";
				info="Loras has a vibrant and diverse choral program. All of the choirs participate in concert settings as well as worship services and perform music from a variety of periods and styles. The Loras College Concert Choir is our largest ensemble, consisting of over 100 students from various academic disciplines. The repertoire for this group includes many genres; from large classical choral works to Broadway show tunes while the Loras Chamber Singers, a select ensemble of 16 from the Concert Choir, specializes in chamber music from the Renaissance to the 21st Century. Bella Voce, our women’s choir, is limited to 24 members and performs a wide variety of musical styles. Con Brio, our men’s choir, also performs a variety of repertoire. Our Ensembles tour annually in the United States and abroad, visit parishes throughout the year and perform with other major arts organizations in the Dubuque area. Membership in all choirs is determined by placement audition, which is usually held during the first week of each semester. For more information, contact Bruce J.G. Kotowich, director of choral and vocal activities, at (563) 557-4096.";
				break;
			case 2: 
				name="Loras Players";
				info="The theatre program at Loras College is known as the Loras Players, the oldest amateur theatre company west of the Mississippi. Currently under the direction of Doug Donald, participation in a Loras Player’s production is open to any student. The company produces four to five plays a year that cover a wide range of production styles, from musical comedies such as LITTLE WOMEN to modern musicals like COMPANY; from the modern comedy of BULLSHOT CRUMMOND to the classic comedy of THE MISER; from the tragedy of HAMLET to the absurdity of ROSENCRANTZ AND GUILDENSTERN ARE DEAD and WAITING FOR GODOT. Students even have the opportunity to take over the theatre and produce, direct and act in their own productions. The Loras Players are also associated with the honorary society, Guild of Saint Genesius, and with the local theatre company Fly-By-Night Productions. The Loras Players is a great way to have fun, develop lasting friendships and be a part of an experience that will last for a lifetime.";
				break;
			}
		}
		else if(groupPosition==6)
		{
			switch(childPosition){
			case 0: 
				name="Alpha Phi Omega";
				info="Friendship. Leadership. Service. Sound like values that mean something to you? These are the principles of Alpha Phi Omega (APO) and of many of the men and women who have joined the organization since 1925. APO’s central purpose is to bring together college students in a national service fraternity in order to develop leadership, to promote friendship and to provide service and humanity to those in need. APO is involved in many service activities on campus, as well as in the Dubuque community. APO participates in adopt-a-highway and a blood drive, as well as many other service projects throughout the year. APO prepares college students for life and shows the values of civil responsibility and volunteerism, as well as being a great place to develop friendships and form leadership skills. For more information, contact Allen Troupe at (563) 588-7100 or Ron Collins at (563) 588-7281.";
				break;

			case 1: 
				name="Alpha Sigma Alpha";
				info="Alpha Sigma Alpha is a women’s sorority that promotes high ideals and standards similar to those of Loras College. Alpha Sigma Alpha instills in its members intellectual, social, spiritual and physical development. Through many philanthropic and social activities we create a sisterhood and support system that adds much to the college experience. Our 100 year national heritage is rich in service and scholarship. We provide women with some of the best opportunities for leadership and involvement both on the campus and in the Dubuque community. For more information, contact Chapter president, Alexis Miller, at Alexis.Miller@loras.edu.";
				break;
			case 2: 
				name="Dance Marathon";
				info="Loras College Dance Marathon, in association with The Children’s Miracle Network, is a year-long student-run event that provides financial and emotional support to children and their families who have been treated at the University of Iowa Children’s Hospital in Iowa City. Previous Dance Marathons have had over 275 student participants and raised more than $106,000 in its fifth year, making it the number one fundraising Dance Marathon per capita in the nation. Throughout the year students make several visits to the University of Iowa Children’s Hospital and enjoy family days with local Dubuque families who have been affected by our contributions. In addition, students attend “Mini Dance Marathons” at grade schools and high schools in the Dubuque area as well as many community fundraisers. The year-long preparation culminates with a 12-hour event from 8:00 p.m. to 8:00 a.m. with no caffeine and no sitting down, in recognition of those children who are battling illnesses. This will be Dance Marathon’s seventh year at Loras College. It is an opportunity to truly affect people in our community and a great opportunity to get involved. For more information, contact Kim Walsh at (563) 588-7206 or Kimberly.Walsh@loras.edu. ";
				break;
			case 3: 
				name="Duhawks for Life";
				info="The members of Duhawks for Life believe that life begins at conception and ends at natural death, and that all points in between should be defended and nurtured. Duhawks for Life invites members of the Loras community to dedicate themselves to live within the teachings of Pope John Paul II’s encyclical, Evangelium Vitae, or The Gospel of Life, in regard to respect for human life from conception to natural death. In agreement with Loras College’s Mission, Duhawks for Life challenges its members to recognize the human dignity of each individual and to promote ethical decisions concerning human life issues. For more information, contact advisor Matthew Shadle at (563) 588-7308. ";
				break;
			case 4: 
				name="Future Young Professionals";
				info="Future Young Professionals offers programming and networking opportunities similar to Young Professionals of Dubuque, with special events tailored specifically to college students. Young Professionals is a national organization. Becoming involved at the college level is a great springboard for your career. Advantages for being involved include: Resume builder; opportunities to develop your leadership skills; make connections in the business world; preparation for interviewing, business etiquette and the workforce; gain confidence in networking; become more connected to the community; get involved in YP committees and community projects; fun way to meet new people; discounted admission to YP Dubuque luncheons; and YP Connection e-newsletter. ";
				break;
			case 5: 
				name="Habitat for Humanity International";
				info="Habitat for Humanity International was founded in 1976 by Millard and Linda Fuller with the goal of providing affordable housing to those in need. Since then, Habitat has built over 125,000 houses around the world, providing over 625,000 people with a simple, decent place to live. Habitat for Humanity is one of the largest non-profit organizations in the United States. Habitat USA and Habitat International are ecumenical Christian housing ministries that seek to eliminate poverty housing and homelessness worldwide. Everywhere we work, Habitat builds new relationships and a sense of community as well as new housing. Habitat also improves the local community by putting property back on the tax rolls and by adding life to older neighborhoods Through volunteer labor, careful management and donations of money and materials, Habitat builds and rehabilitates simple, decent homes so they are affordable for low-income families currently living in substandard housing. We are looking for dedicated individuals interested in promoting awareness of poverty housing, improving their construction skills and most of all, to have fun! For more information, contact Susan Stone at (563) 588-7185.";
				break;
			case 6: 
				name="Literary Society";
				info="The Literary Society is a pre-professional group that meets on a regular basis working to promote literature, film, arts and service activities in the Loras community. The group holds theme parties, poetry readings, literary discussions, attends theater productions and dinner and movie events. The Literary Society works with the Friends of the Library and the Boys’ and Girls’ Club, as well as the Multi-Cultural Family Center. The society is open to faculty, staff, students and community members focusing mainly on academic involvement and development. For more information, contact Annie Newberry at Annie.Newberry@loras.edu or Emily Bereiter at Emily.Bereiter@loras.edu.";
				break;
			case 7: 
				name="Loras College Daughters of Isabella";
				info="As a member of the Daughters of Isabella, you will have opportunities to make new friends, express your views, enhance your spiritual life and become as active as you wish here at Loras College. Your talents and energies will be recognized and are needed. Belonging to one of the largest, international, Catholic women’s organizations, with a membership of over 60,000 women from the United States, Canada and Japan provides opportunities to nurture bonds among Catholic women and explore networking opportunities among women in different roles and positions. The Loras College Circle #1427 of Daughters of Isabella is currently one of the largest college circles in the country. The Daughters participate in many ways here on campus including an annual formal, service opportunities and fellowship. For more information, please contact Dana Disteldorf at dana.disteldorf@loras.edu.";
				break;
			case 8: 
				name="Loras College Invisible Children";
				info="In the spring of 2003, three young filmmakers traveled to Africa in search of a story. What started out as a filmmaking adventure transformed into much more when these boys from Southern California discovered a tragedy that disgusted and inspired them, a tragedy where children are both the weapons and the victims. These 50,000 plus children who have been abducted in countries like Uganda, Sudan, The Central African Republic and Democratic Republic of the Congo, go unaccounted for, for the past 25 years and are therefore known as the invisible children. As the motives of the LRA become more ambiguous and their crimes more horrific, Invisible Children remains committed to seeking sustainable solutions to foster an environment that encourages peace.  At Loras College we are the students who are redefining what it means to be an activist. We are part of an international movement seeking to end this conflict by bringing the thousands of invisible children home, ending the longest running war in Africa. We seek to rebuild schools, educate future leaders and provide jobs in Northern Uganda. To do this, we raise money each fall semester in a competition known as Schools for Schools in order to support our sister school in Northern Uganda. We use creativity and voice through our many fundraising events and unique demonstrations to heighten awareness about the atrocities going on in Africa. This organization is a great way to get involved within the Loras community while helping to affect a community halfway around the world.  See the change, be the change, and be visible for those who are invisible.";
				break;

			case 9: 
				name="Loras College Knights of Columbus";
				info="The Knights of Columbus is a fraternal organization of Catholic men. The Knights of Columbus is an internationally recognized group made up of thousands of men across the world. Loras College Council 9224 has a vibrant group of guys who put on many activities and work together to improve the world. Every year the men hold a date auction to raise money for a decided local Dubuque organization. They also hold the event to show there are classy gentlemen at Loras College. In the fall of 2009, two $500 donations were made to the Teresa Shelter and the Riverview Center, which both provide help for abused women. The Knights of Columbus, as an organization, is based on four primary principles: Faith, Unity, Fraternity and Patriotism. For more information contact Blake Neebel at (563) 495-2682. ";
				break;
			case 10: 
				name="Loras Democrats";
				info="The Loras Democrats is a campus club designed to accommodate any student who has an interest in politics. The club provides services and information to students of all ideologies through voter registration drives, absentee ballot collection, volunteer and intern opportunities and similar activities. Students more connected with the party can discuss important issues or gather socially at the weekly meetings, volunteer for political campaigns and meet numerous political candidates, their staffers, their supporters and other speakers. The club’s main goal is to make politics interesting to all students and encourage participation in the political system. ";
				break;
			case 11: 
				name="Loras Republicans";
				info="The Loras College Republicans is an organization for students interested in becoming politically active in the Republican Party. The College Republicans work tirelessly to provide the resources needed to elect Republicans, fueled by the leadership of the Party and in doing so, are building a generation of Republican voters. The goals of the organization are: 1) To campaign for Republican candidates at all office levels; 2) to combat political correctness; 3) to inform the campus and community about issues through The Lorian column “The Right Side;” and 4) to encourage voting by running voter registration drives. For more information, contact Allen Troupe at (563) 588-7100 or e-mail  loras.republicans@loras.edu.";
				break;
			case 12: 
				name="Loras Environmental Action Forum";
				info="The Loras Environmental Action Forum (LEAF) strives to educate the Loras community on environmentalism, to promote positive action toward achieving an environmentally sound community and to develop an appreciation for the earth and its inhabitants. LEAF sponsors speakers, work days, camping trips, canoe trips, nature hikes, movie nights and other activities relating to our mission. LEAF has an eLearn site with club information. For more information, contact club advisor Dana Livingston to be added to the site.";
				break;
			case 13: 
				name="Loras Intercultural Student Association";
				info="The Loras Intercultural Student Association (LISA) is a student organization whose purpose is to create diversity and inclusion awareness, cultivate celebration and form a collaborative network of individuals from all backgrounds. Membership is open to all students who desire an advocacy for diversity, in all of its forms. LISA provides opportunities for students from all backgrounds with the ability to share what makes them unique. It gives members the resources needed to share with the Loras and surrounding communities the beauties that lie within cultures. Even more importantly, LISA is a support and advocacy organization which celebrates the success of student achievement and addresses the concerns of our intercultural students. For more information, contact Alejandro Pino at  Alejandro.Pino@loras.edu.";
				break;
			case 14: 
				name="OVE+R";
				info="OVE+R (Overcoming Violence and Empowering Positive Relationships) is a group dedicated to bringing awareness and education about the issue of sexual assault to campus and providing support for those affected. OVE+R’s vision is to create a college campus where everyone feels safe walking to their residence halls alone, where college parties are not an open invitation for sexual assault, where the word “no” is respected, where survivors are heard and not alone, where it is not just a woman’s issue, but a community’s issue, where there is no such thing as a bystander but where everyone strives to support one another and eradicate sexual violence from the Loras College Campus. For more information, please contact Emily Buss at Emily. Buss@loras.edu or Valerie Bell at Valerie.Bell@loras.edu.";
				break;
			case 15: 
				name="Religious Studies Club";
				info="The Religious Studies Club provides programming of interest to Religious Studies majors, minors, and all students interested in religious studies and theology. Programming will primarily focus on the Christian tradition, but will include other religions as well. The organization will also provide academic and professional opportunities and recognition for religious studies majors and minors. For further information, contact Matt Shadle at Matthew.Shadle@loras.edu.";
				break;
			case 16: 
				name="The Alliance";
				info="The mission of The Alliance is to provide students from the Dubuque community and Loras College with a place to meet and talk about issues relating to sexual orientation. Our goals include fighting prejudice and discrimination, meeting the needs of students who are interested in addressing issues related to sexual orientation and anti-gay prejudice and addressing the concerns of lesbian, gay, bisexual and transgender students and their friends. The Alliance helps to reduce anti-gay violence, harassment and discrimination by educating the Dubuque community about homophobia and by encouraging a greater understanding from students and school personnel. We also give homosexual and heterosexual students a safe place to discuss their feelings and fears related to sexual orientation.  We offer Ally training. An Ally is a person who helps LGBT persons feel supported and included. They support fairness and justice for all.  For more information, contact Michelle Bechen, advisor, at (563) 588-7325 or Michelle.Bechen@loras.edu. ";
				break;
			case 17: 
				name="UNICEF at Loras College";
				info="UNICEF is a global fund that operates in over 157 countries and territories working for the survival, protection and development of children. While the world’s children have benefited from UNICEF’s efforts, the work is far from over. With more than 22,000 children dying before their fifth birthday each day from preventable causes, the children of the world need the help of concerned college students more than ever! We at Loras College have the unique opportunity to utilize our small campus and connect a broad range of people by using our vast resources to increase public awareness about global issues. The Loras College UNICEF Campus Initiative is centered around education, advocacy and fundraising. This group substantiates the power of our student body, faculty and staff to make a measurable difference in the world by raising awareness and funds to support the work of UNICEF! We have the opportunity as students to educate our peers on a broad range of global issues through the UNICEF initiative. Since the beginning of the organization in 2006, some of our annual fundraising events include the Nationwide Trick-or-Treat campaign both on and off campus during the fall semester and our Salsa Night/Charity Ball in the spring semester. We also host a variety of other educational and advocacy events throughout the year and are constantly looking for new and creative ideas!   Most importantly, this group was created to have FUN while engaging in a beneficial cause! For more information, contact Richard Anderson, our advisor, at  Richard.Anderson@loras.edu.";
				break;
			}}
		else if(groupPosition==7)
		{
			switch(childPosition){
			case 0: 
				name="Office of Campus Spiritual Life";
				info="119 Keane Hall – (563) 588-7104";
				break;

			case 1: 
				name="Campus Ministry";
				info="460 Alumni Campus Center – (563) 588-7650"+"\n"+"The offices of Campus Spiritual Life and Campus Ministry serve the entire Loras community by reminding us that each of us are spiritual beings and we need to pay attention to our spiritual life—no matter where we are on our faith journey. Regular opportunities for participation in the celebration of Eucharist, Adoration of the Blessed Sacrament, other forms of praise and worship, preparation for/ and reception of the sacraments, and spiritual development through retreats, service to the community, and activities that foster a close relationship with Christ are planned and implemented by student coordinators and student-led leadership teams. Programs for spiritual enrichment, service learning (service trips), and social justice, assist students in developing a greater understanding of the complexities of our call as Christians to transform the world. Students assume leadership roles by leading retreats or service trips, teaching and tutoring in local parishes and schools, and through involvement in various committees and planning teams. Campus Ministry also invites the participation of faculty, staff, and administration in these activities. CORE Team – The Campus Ministry CORE Team was organized to provide an opportunity for a representative group of students from the Loras Community to plan, coordinate and evaluate the activities and programs sponsored by Campus Ministry. CORE Team builds Community on campus, encourages Outreach and service to others, as well as, Reflection and prayer, and Empowers Loras community members to share their gifts! CORE assists with “pastoral planning” for our faith community. This is primarily about prayer, compassion, hospitality and discipleship. To become involved in CORE Team events and activities, contact Director of Campus Ministry Colleen Kuhl at (563) 588-7924 or Colleen.kuhl@loras.edu. Discovery Retreat Teams – Teams of 25-30 Loras students are formed and trained to facilitate day-long confirmation retreats for high school students involved in Catholic Confirmation preparation programs around the archdiocese of Dubuque. Four retreats are given each year for 80-90 confirmation students each time. Contact Campus Minister Debbie Gross at (563) 588-7934 or  Debbie.gross@loras.edu. Service Trip Teams – Throughout the year, Loras sponsors approximately nine service trips to various parts of the United States (Cedar Rapids, Chicago, New Jersey, New Orleans, Washington, DC, Kentucky) and Haiti and Honduras. Grounded in the foundation of Catholic Social Teaching, teams are selected through an application process open to all students; and are accompanied by a student coordinator and a faculty, staff or alumnus accompanying adult. If you are interested in applying for a service trip team, contact Director of Campus Ministry Colleen Kuhl at (563) 588-7924 or Colleen.kuhl@loras.edu. ";
				break;
			case 2: 
				name="Office of Worship";
				info="“The Bridge” – 100 Christ the King – (563) 588-7303 – david.summers@loras.edu"+"\n"+"Communal worship is central to the life of Catholic Christians, and people of any faith tradition are invited and welcome to participate as much as they are able. Opportunities for those of faith traditions other than Catholic are available through contacts with local congregations, and some on-campus events. All campus worship is always open to everyone and need neither preparation nor registration. Call the Loras College Mass Hotline  (563) 588-7770 or call Office of Spiritual Life, (563) 588- 7104, for the current schedule and locations. To become involved in any of the following liturgical opportunities, contact the Dean of Campus Spiritual Life or Liturgy Coordinator David Summers at (563) 588-7303 or  david.summers@loras.edu. Sunday Eucharist – Christ the King Chapel 8:00 p.m.  Daily Eucharist – Christ the King Chapel  Monday, 5:15 p.m.  Tuesday, 5:15 p.m.  Wednesday, 12:20 p.m. and 9:00 p.m. (usually a more casual celebration than Sunday, these celebrations are a great mid-week time to gather for faith, fellowship and relaxation) Thursday, 5:15 p.m.  Friday, 5:15 p.m. Daily Eucharistic Exposition and Adoration St. Joseph Adoration Chapel (Hoffmann Hall) Monday-Thursday 9:00 a.m. – 5:00 p.m.  Friday, 9:00 a.m.-4:00 p.m.  Exposition, Benediction and Confession Thursdays, 9:00-10:00 p.m., Christ the King Chapel Reconciliation  The Celebration of Reconciliation (Confessions) takes place one-half hour prior to every weekday and weekend Mass, as well as Thursdays during the Holy hour at  9:00 p.m., in Christ the King Chapel. Individuals can also schedule appointments if those times are not convenient. Please call Office of Spiritual Life (563) 588-7104. Advent/Lent Communal Reconciliation Services, see current bulletin. Worship Team – Meeting bi-weekly, this team plans weekend worship in advance. Activities include study and discussion of weekend Scripture readings, brainstorming homily themes and their relationship to music. Included in the planning are any seasonal celebrations, selection of liturgical music, seasonal chapel environments, planning reconciliation services, Morning Prayer, Eucharistic Adoration, Fall Welcome Mass, Homecoming, Family Weekend, Baccalaureate and other major liturgical observances of the College. Open to everyone, this group is run by the Dean of Spiritual Life and Liturgy Coordinator who are assisted by the Head Sacristan, a student worker, and consists of students with an interest in the Liturgy or who wish to learn more about planning Worship. The Worship Team also has the responsibility of scheduling and training Liturgical Ministers.  Liturgical Music Ministry – A large number of student musicians regularly participate in accompanying/leading congregational, instrumental and vocal music for worship at Loras College. All instruments and voices are welcome! “The Chapel Ensemble” rehearses weekly for bi-weekly Sunday Liturgies. Practices for all other Masses are held an hour and a half prior to the start of Worship. Open to anyone of any talent, ability or denomination who is willing to rehearse and practice music. Contact the Liturgy Coordinator, David J. Summers for further information at (563) 588-7303, or at david.summers@loras.edu. Liturgical Ministries – Worship at Loras College is on the move! Students are encouraged to become more active in the celebrations through their participation in liturgical ministries. Opportunities within the Sunday and weekday celebrations of the Eucharist include: greeter/ hospitality (welcome people to Loras worship); lector (proclaim Scripture readings); Eucharistic minister (assist in distributing Holy Communion); acolytes (serve in the sanctuary at the altar); sacristan (prepare vessels, hosts and wine for Eucharistic celebrations). Some (but not all) of these ministries are open to people of any denomination. Contact the Liturgy Coordinator, David J. Summers to find out how you can get involved at (563) 588-7303, or at  david.summers@loras.edu. Religious Opportunities for Students from Other Faith Traditions – Loras College believes that every person is spiritual and deserves opportunities to grow in his/her faith. Current initiatives on campus are planning events for other Christian and non-Christian students. Chapels/sacred space are available for respective traditions. Loras College is committed to the spiritual development of all students, faculty and staff. If you would like more information about ecumenical or interfaith initiatives at Loras, or other worship opportunities in Dubuque, contact Director of Campus Ministry Colleen Kuhl at (563) 588-7650 or  Colleen.kuhl@loras.edu. Spiritual Direction – Offers an opportunity to journey with someone in discussing your spiritual life. Usually meeting bi-weekly, participants bring their reflections from prayer and their concerns of how God relates to challenges in their lives. One-on-one meetings with the spiritual director provide a listening ear, as well as someone with whom they  can be accountable in their prayer/spiritual life. Note that this is not a counseling situation, nor merely an advice session. Content of the meetings arises from the participant’s prayer life and his/her attempts to integrate God into his/her personal experience. A great experience for anyone wanting to grow in his/her faith and discern God’s plan in life. Open to anyone. Somewhat limited space—first come, first serve. For more information, contact Director of Campus Ministry, Colleen Kuhl at (563) 588-7650 or colleen.kuhl@loras.edu. Religious Vocations Discussion Group – Meets monthly, informally to discuss questions regarding vowed, religious and ordained ministry in the Church. The “no-strings- attached” approach lets individuals explore their interests and concerns regarding religious vocations. Various opportunities for ministry are explored and topics related to vocational discernment discussed. Meals and social gatherings provide the context for some great discussions. Open to men and women- separate meeting opportunities available. For more information, contact Dean of Campus Spiritual Life the Rev. William Joensen at (563) 588-7108 or Director of Campus Ministry, Colleen Kuhl at  (563) 588-7650.";
				break;
			case 3: 
				name="Father Ray Herman Peace and Justice Center";
				info="Father Ray Herman Peace and Justice Center 460 Alumni Campus Center – (563) 588-7650"+"\n"+"The Peace and Justice Center serves as a focus for social justice activities on the Loras campus, as well as connecting with justice advocacy in the Dubuque community. Established in the memory of Fr. Ray Herman, an archdiocesan priest who was martyred in 1975 as he ministered to the poor in Morachata, Bolivia, the Center serves as both a resource center and a program effort which helps to remind the Loras community of our call and commitment to justice, serving the poor, and increasing our awareness of the social teachings of the church on all levels—local, national and global.  Father Ray Herman Peace and Justice Community – The Peace and Justice Community is a campus group that meets weekly to discuss social justice issues, raise global and local service and social justice awareness, advocate for peace and sponsor charity and service-related fundraising projects. Members of the community educate themselves on global issues related to social justice, in addition to learning more about the social teachings of the church. Peace and Justice members strive to act on the knowledge they have, often taking part in serving meals at Hope House, the local Catholic Worker; engaging in peaceful demonstrations on and off campus; and taking part in campus clean-up days, as well as educating other members of the campus community on social justice issues. For more information, or to get involved, contact David McDermott, Peace and Justice Coordinator, at  David.McDermott@loras.edu, or (563) 588-7056. ";
				break;
			case 4: 
				name="FOCUS";
				info="18 Rohlman – (563) 588-7044"+"\n"+"An affiliate of the national program, the Loras FOCUS missionaries offer small group Bible studies on campus, leadership training in our one-on-one mentoring program (discipleship) and host various large group events. FOCUS is committed to helping students grow in their relationship with Jesus Christ and an understanding of the Catholic faith, while providing encouragement in students’ studies, social lives, dating relationships and major life decisions. To get involved in FOCUS activities, contact the FOCUS team director at (406) 600-1509 or loras@focusonline.org.";
				break;
			}}
		else if(groupPosition==8)
		{
			switch(childPosition){
			case 0: 
				name="Loras Student Union";
				info="The Loras Student Union (LSU) is the student governing organization of Loras College. This tri-cameral structure includes the College Activities Board (CAB), Residence Hall Association (RHA) and Student Senate. These three branches work together to enhance and improve all aspects of college life for Loras College students, including programming, governance and residence life. Additionally, the Loras Student Union includes three Constitutional Councils which connect the three branches and encourage cooperation and collaboration between all areas of government. These Councils include the Organizational Union (OU), Residence Life Programming and the Student Life Council. ";
				break;

			case 1: 
				name="Campus Pride";
				info="Campus Pride is for those at Loras who would like to see more school spirit and higher attendance at athletic events (as well as non-athletic events such as plays). Campus Pride got bigger in the ’09-’10 school year, as the organization received $3,000 from the Student Union. The money was used to purchase “Duhawk Nation” t-shirts that were handed out to the students to wear at events. The organization also purchased a “Duhawk Nation” banner which will be placed in the student section at athletic events, and organized a halftime competition at basketball games. In the future, Duhawk Nation looks to contribute more shirts, provide more memorabilia for fans and get students more involved with events, and much, MUCH, more.";
				break;
			case 2: 
				name="College Activities Board";
				info="The College Activities Board (CAB) is a student-run organization. CAB’s goal is to bring diverse entertainment, speakers, movies, cultural activities and numerous other events to campus. CAB’s budget comes from student fees, so it is committed to hosting events that students voice interest in. CAB provides quality activities throughout the year for the campus to enjoy. CAB has hired positions as well as committees consisting of any interested students. Participation in CAB is welcome and encouraged! For more information, contact the CAB office at college.activityboard@ loras.edu or (563) 588-7203 or Michele Nauman at  (563) 588-7731. ";
				break;
			case 3: 
				name="Residence Hall Association";
				info="Residence Hall Association (RHA) is an organization that represents students living in campus housing, including traditional and alternative housing. The main goal of RHA is to unify halls and to improve community life for residents living in campus housing. RHA members represent student concerns, provide programs and services, help build community in their halls and across campus and provide leadership opportunities at the local, regional and national levels. RHA also works to change policy and to improve the residence halls. For more information, contact Residence Life at (563) 588-7137. ";
				break;
			case 4: 
				name="Student Senate";
				info="The Student Senate is comprised of students elected by the student body, including an Executive Board consisting of the Student Union President, Vice President, Judicial Chair, Director of Communications and Director of Finance along with the Presidents of CAB and RHA. It also includes seven representatives and class officers from the senior, junior, sophomore and first year classes. Members of Student Senate work throughout the year to voice the needs and desires of students and work with all aspects of the College to improve Loras for the future. Student Senate holds ultimate legislative authority in matters pertaining to the student body. For more information, call the Student Union office at (563) 588-7115 or (563) 588-7242, email us at student.union@loras.edu or write to us at Loras mail #994. ";
				break;
			case 5: 
				name="Senior Class Officers";
				info="Loras College’s senior class participates in a wide variety of activities throughout the year. This group of individuals actively shapes the campus environment and provides a strong example of leadership and influence to the campus community. In addition to serving the student body as members of the working Student Union, senior class officers play a fundamental role in the graduation process. Senior class officers have the opportunity to work with administrators and other groups to collaborate on events such as the senior class dinner, the class gift and other fundraisers. In addition to shaping the student body, senior class officers are also divided into various other committees such as campus pride, campus concerns and many others. Senior class officers are effective members of the student body.  They encompass a wide variety of backgrounds and majors, and strive to work together to effectively change the Loras Community for the better. ";
				break;
			case 6: 
				name="Junior Class Officers";
				info="Being a member of the junior class in the Student Union provides an exciting opportunity for students who wish to make a difference at Loras. Students attend bi-weekly meetings with the entire Student Union and are expected to have meetings consisting only of junior class representatives during the “off” weeks. As stated, junior class reps have the opportunity to make a difference. For example, in the ’09-’10 school year the junior class representatives passed a resolution to get more parking signs on campus. Join the junior class if you wish to make a positive difference.";
				break;
			case 7: 
				name="Sophmore Class Officers";
				info="Being a sophomore class officer is a job that can be hard work, but at the same time a lot of fun. Senators engage in planning class activities as well as doing a required service project and educational event each semester. Doing events such as these not only allows sophomores to get to know each other, but it is a great way to get to know people in the community too. In the past, we raised money for Special Olympics Iowa by joining other area fundraisers in the Dubuque Polar Plunge. Members also participated in Crop Walk with intentions of heightening America’s awareness on hunger. We have also sponsored a sophomore movie night with an ice cream social and co-sponsored Dionysia’s Mini- Casino Night. As an officer of the sophomore class students can voice their opinion on school decisions. Students can become an officer of the sophomore class by either being a senator or by taking a position as an officer, which includes president, vice president and treasurer.";
				break;
			case 8: 
				name="First Year Class Officers";
				info="As the incoming class of Loras College, the first year students attend many school sponsored events in order to know the school better. The first year class officers plan and participate in many different activities throughout the year. Like all class officers, the first year class is required to do a social, educational and service project each semester. Some activities the first year class officers have planned in the past include a talent show, flower sale and all-campus social events. The first year officers work really hard to try and get many first year students involved in many different activities around campus. As members of Student Government, class officers are also encouraged to voice their opinions on school decisions and represent their classmates during key debates and meetings. First year class officers are voted on by their fellow first year classmates in early fall and positions include president, vice president and treasurer, as well as four senator positions. This is a great opportunity for first year students to get involved, to get to know your classmates and help plan fun and interesting activities! ";
				break;
			}
		}
		//title.setText("Group: "+groupPosition+" Child:"+childPosition);


		Intent intent = new Intent(ExpandableList1.this, Organization.class); 
		Bundle b = new Bundle(); 


		b.putString("name", name);
		b.putString("info", info);

		//Add the set of extended data to the intent and start it
		intent.putExtras(b);
		startActivity(intent); 





		// TODO Auto-generated method stub
		return super.onChildClick(parent, v, groupPosition, childPosition, id);
	}



	
	

	/**
	 * A simple adapter which maintains an ArrayList of photo resource Ids. 
	 * Each photo is displayed as an image. This adapter supports clearing the
	 * list of photos and adding a new photo.
	 *
	 */
	public class MyExpandableListAdapter extends BaseExpandableListAdapter {
		// Sample data set.  children[i] contains the children (String[]) for groups[i].
		private String[] groups = { "Academic Organizations", "Athletic and Recreational Groups", "Honorary Organizations","Leadership Deveopment","Media and Publications","Performing Arts Group", "Special Interest Groups", "Campus Spiritual Life", "Student Government" };
		private String[][] children = {
				{"Accounting Club","Advertising and Marketing Association","American Chemical Society Student Affiliates ","Association for Computing Machinery ","Athletic Training Club","Delta Epsilon Sigma ","Economics Club","Engineering and Physics Club ","Financial Management Association ","Future Educators of Loras College","Health Science Club ","Loras Alternative Dispute Resolution Society ","Loras College Mediation Team","Loras College Mock Trial ","Loras College Moot Court Team","Loras Philosophy Club","Loras Students for Inclusive Education ","Mathematics Club","Paideia","Phi Beta Lambda ","Physical Education & Sports Studies Majors Club ","Social Work Club ","St Thomas More Pre-Law Society ","Writers Ink"},
				{"Duhawk Cheerleaders ","Duhawk Dancers ","Intramurals ","Judo Club","Loras Cycling Club","Loras Hockey Club ","Loras Ultimate Club (LUC) Duhawks","Student Athlete Advisory Committee ","Varsity Athletics"  },
				{"Guild of St Genesius","Psi Chi"  },
				{ "LEAD LORAS","Other Opportunities" },
				{ "KLCR ","LCTV (Loras College Television)","The Limestone Review","The Lorian","Purgold" },
				{ "Loras Bands ","Loras Choirs ","Loras Players" },
				{ "Alpha Phi Omega","Alpha Sigma Alpha ","Dance Marathon ","Duhawks for Life","Future Young Professionals of Loras College","Habitat for Humanity ","Literary Society","Loras College Daughters of Isabella","Loras College Invisible Children ","Loras College Knights of Columbus ","Loras Democrats ","Loras Republicans ","Loras Environmental Action Forum ","Loras Intercultural Student Association ","OVE+R ","Religious Studies Club","The Alliance ","UNICEF at Loras College" },
				{"Office of Campus Spiritual Life ","Campus Ministry ","Office of Worship ","Father Ray Herman Peace and Justice Center","FOCUS "  },
				{"Loras Student Union","Campus Pride","College Activities Board","Residence Hall Association ","Student Senate","Senior Class Officers ","Junior Class Officers","Sophomore Class Officers ","First Year Class Officers"}
		};

		public Object getChild(int groupPosition, int childPosition) {
			return children[groupPosition][childPosition];
		}

		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		public int getChildrenCount(int groupPosition) {
			return children[groupPosition].length;
		}

		public TextView getGenericView() {
			// Layout parameters for the ExpandableListView
			AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT, 64);

			TextView textView = new TextView(ExpandableList1.this);
			textView.setLayoutParams(lp);
			// Center the text vertically
			textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
			// Set the text starting position
			textView.setPadding(36, 0, 0, 0);
			return textView;
		}

		public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
				View convertView, ViewGroup parent) {
			TextView textView = getGenericView();
			textView.setText(getChild(groupPosition, childPosition).toString());
			return textView;
		}

		public Object getGroup(int groupPosition) {
			return groups[groupPosition];
		}

		public int getGroupCount() {
			return groups.length;
		}

		public long getGroupId(int groupPosition) {
			return groupPosition;
		}

		public View getGroupView(int groupPosition, boolean isExpanded, View convertView,
				ViewGroup parent) {
			TextView textView = getGenericView();
			textView.setText(getGroup(groupPosition).toString());
			return textView;
		}

		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;
		}

		public boolean hasStableIds() {
			return true;
		}


	}
}
