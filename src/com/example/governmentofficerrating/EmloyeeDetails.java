package com.example.governmentofficerrating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class EmloyeeDetails extends Activity {

	TextView headings;

	Button employee_1, employee_2, employee_3, employee_4, employee_5;

	Button rating_emp1, rating_emp2, rating_emp3, rating_emp4, rating_emp5;

	String emp1_get, emp2_get, emp3_get, emp4_get, emp5_get;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_emloyee_details);

		headings = (TextView) findViewById(R.id.headings);

		employee_1 = (Button) findViewById(R.id.employee1);

		employee_2 = (Button) findViewById(R.id.employee2);

		employee_3 = (Button) findViewById(R.id.employee3);

		employee_4 = (Button) findViewById(R.id.employee4);

		employee_5 = (Button) findViewById(R.id.employee5);

		rating_emp1 = (Button) findViewById(R.id.rateemp1);

		rating_emp2 = (Button) findViewById(R.id.rateemp2);

		rating_emp3 = (Button) findViewById(R.id.rateemp3);

		rating_emp4 = (Button) findViewById(R.id.rateemp4);

		rating_emp5 = (Button) findViewById(R.id.rateemp5);

		Intent get_somevalue = getIntent();

		String head_get = get_somevalue.getStringExtra("headings");

		emp1_get = get_somevalue.getStringExtra("emp1");

		emp2_get = get_somevalue.getStringExtra("emp2");

		emp3_get = get_somevalue.getStringExtra("emp3");

		emp4_get = get_somevalue.getStringExtra("emp4");

		emp5_get = get_somevalue.getStringExtra("emp5");

		headings.setText(head_get);

		employee_1.setText(emp1_get);

		employee_2.setText(emp2_get);

		employee_3.setText(emp3_get);

		employee_4.setText(emp4_get);

		employee_5.setText(emp5_get);

		rating_emp1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent send_emp_detail = new Intent(EmloyeeDetails.this,
						RatingEmployee.class);

				send_emp_detail.putExtra("empname", emp1_get);

				startActivity(send_emp_detail);

			}
		});

		rating_emp2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent send_emp_detail = new Intent(EmloyeeDetails.this,
						RatingEmployee.class);

				send_emp_detail.putExtra("empname", emp2_get);

				startActivity(send_emp_detail);

			}
		});

		rating_emp3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent send_emp_detail = new Intent(EmloyeeDetails.this,
						RatingEmployee.class);

				send_emp_detail.putExtra("empname", emp3_get);

				startActivity(send_emp_detail);

			}
		});

		rating_emp4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent send_emp_detail = new Intent(EmloyeeDetails.this,
						RatingEmployee.class);

				send_emp_detail.putExtra("empname", emp4_get);

				startActivity(send_emp_detail);

			}
		});

		rating_emp5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent send_emp_detail = new Intent(EmloyeeDetails.this,
						RatingEmployee.class);

				send_emp_detail.putExtra("empname", emp5_get);

				startActivity(send_emp_detail);

			}
		});

	}

}
