package com.example.governmentofficerrating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListOfGovernmentOffice extends Activity {

	Button collector_office, rto_office, bsnl_office, police_station,
			taluk_office, post_office;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_government_office);

		collector_office = (Button) findViewById(R.id.collectoroffice);

		rto_office = (Button) findViewById(R.id.rtooffice);

		bsnl_office = (Button) findViewById(R.id.bsnl);

		police_station = (Button) findViewById(R.id.policestation);

		taluk_office = (Button) findViewById(R.id.talukoffice);

		post_office = (Button) findViewById(R.id.postoffice);

		collector_office.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "Collector Office");

				cofc.putExtra("emp1",
						"Tmt.B.Maheswari, IAS\n District Collector, \nChennai.");

				cofc.putExtra("emp2",
						"Thiru M.A.Sheriff, I.A.S\n Joint Collector, \nChennai.");

				cofc.putExtra("emp3",
						"Thiru D.Padmanabhan, District Revenue Officer, \nChennai.");

				cofc.putExtra("emp4",
						"Thiru V.Vadivelu, Administrative Officer, \nChennai.");

				cofc.putExtra("emp5",
						"Thiru C.V.Sivarami,\nSuperintendent,\nChennai.");

				startActivity(cofc);

			}
		});

		rto_office.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "R.T.O Office");

				cofc.putExtra("emp1",
						"Thiru A.Balaji, \nDirector Transport, \nChennai.");

				cofc.putExtra("emp2",
						"Thiru C.Baranidharan, \nAddl.Commissioner Transport-cumSecretary, \nChennai.");

				cofc.putExtra("emp3",
						"Tmt S.Aishwarya, \nJoint Commissioner Transport, \nChennai.");

				cofc.putExtra("emp4",
						"Thiru L.Madhavan, \nAssistant Commissioner Transport, \nChennai.");

				cofc.putExtra("emp5",
						"Thiru V.Kannabiraan,\nSuperintendent,\nChennai.");

				startActivity(cofc);

			}
		});

		bsnl_office.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "BSNL");

				cofc.putExtra("emp1",
						"Tmt.N POONGUZHALI, \n Chief General Manager, Telecom.,, \nChennai.");

				cofc.putExtra("emp2",
						"Tmt. Rajammal, \n GM(HR& ADMN), \nChennai.");

				cofc.putExtra("emp3",
						"Thiru T.V.ANJANEYAN, \n AGM (Admn), \nChennai.");

				cofc.putExtra("emp4",
						"Thiru O.Pannerselvam, JTO (Operations), \nChennai.");

				cofc.putExtra("emp5",
						"Thiru G.Abisheek kumar,\nSuperintendent,\nChennai.");

				startActivity(cofc);

			}
		});

		police_station.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "Police Station");

				cofc.putExtra("emp1",
						"Tmt. L.Vijayashanthi, \nCommissioner of Police, \nChennai.");

				cofc.putExtra("emp2",
						"Thiru A.S.Alex pandian, \nDeputy Commissioner of Police , \nChennai.");

				cofc.putExtra("emp3",
						"Thiru P. Anbuselvan, \nAssistant Superintendent of Police , \nChennai.");

				cofc.putExtra("emp4",
						"Thiru V.Ragavan, 	\nInspector of Police, \nChennai.");

				cofc.putExtra("emp5",
						"Thiru I.Kannan,\nPolice Head Constable,\nChennai.");

				startActivity(cofc);
			}
		});

		taluk_office.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "Taluk Office");

				cofc.putExtra("emp1",
						"Tmt.M.Nalini, \nChief Electoral officer, \nChennai.");

				cofc.putExtra("emp2",
						"Thiru S.Suresh Kumar, \nVillage Officer, \nChennai.");

				cofc.putExtra("emp3",
						"Thiru Jijo Joseph, \nERO & TAHSILDAR , \nChennai.");

				cofc.putExtra("emp4",
						"Thiru Ramamoorthi P, \nDEPUTY TAHSILDAR, \nChennai.");

				cofc.putExtra("emp5",
						"Thiru Muhammed Abdul Vahid,\nCOMPUTER PROGRAMMER,\nChennai.");

				startActivity(cofc);
			}
		});

		post_office.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent cofc = new Intent(ListOfGovernmentOffice.this,
						EmloyeeDetails.class);

				cofc.putExtra("headings", "Post Office");

				cofc.putExtra("emp1", "Tmt.Sheeba V S, \nSecretary, \nChennai.");

				cofc.putExtra("emp2",
						"Thiru B.Pradeep, \nMember postal service board, \nChennai.");

				cofc.putExtra("emp3",
						"Thiru Kamala kannan, \nPost Master, \nChennai.");

				cofc.putExtra("emp4",
						"Thiru S.manirathanam, \nInspector of post, \nChennai.");

				cofc.putExtra("emp5",
						"Thiru C.Samuthurakani,\nPostman,\nChennai.");

				startActivity(cofc);
			}
		});

	}

}
