package com.example.governmentofficerrating;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingEmployee extends Activity {

	TextView emplyee_detail_show;

	RatingBar employee_ratingbar;

	Button click_to_rate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating_employee);

		emplyee_detail_show = (TextView) findViewById(R.id.employeedetailget);

		employee_ratingbar = (RatingBar) findViewById(R.id.employeerating);

		click_to_rate = (Button) findViewById(R.id.clicktorate);

		Intent get_empname = getIntent();

		String emp_getname = get_empname.getStringExtra("empname");

		emplyee_detail_show.setText(emp_getname);

		click_to_rate.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String rates = String.valueOf(employee_ratingbar.getRating());

				if (rates.equals("0.0")) {
					Toast.makeText(getApplicationContext(),
							"Please give some rating", Toast.LENGTH_LONG)
							.show();

				} else {

					Toast toast = new Toast(RatingEmployee.this);
					toast.setDuration(Toast.LENGTH_LONG);
					toast.setGravity(Gravity.CENTER, 0, 0);
					// toast.setText("Rating for the Employee is   " + rates
					// + "\n Thanks for your Rating..!");
					LayoutInflater inflater = getLayoutInflater();
					View appearance = inflater.inflate(R.layout.thankyou_image,
							(ViewGroup) findViewById(R.id.root));

					toast.setView(appearance);
					toast.show();

					Toast.makeText(getApplicationContext(),
							"Rating for the Employee is   " + rates,
							Toast.LENGTH_LONG).show();

					finishAffinity();

				}

			}
		});

	}

}
