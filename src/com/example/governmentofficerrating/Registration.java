package com.example.governmentofficerrating;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Registration extends Activity {

	LoginDataBaseAdapter loginDataBaseAdapter;
	EditText username, password, repassword, mobile, securityhint,
			securityhint1;
	Button register, cancel, reg_btn;
	CheckBox check;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);

		loginDataBaseAdapter = new LoginDataBaseAdapter(this);
		loginDataBaseAdapter = loginDataBaseAdapter.open();
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password_edt);
		repassword = (EditText) findViewById(R.id.repassword_edt);

		securityhint = (EditText) findViewById(R.id.securityhint_edt);
		securityhint1 = (EditText) findViewById(R.id.securityhint_edt1);

		mobile = (EditText) findViewById(R.id.mobile);
		register = (Button) findViewById(R.id.register_btn);
		cancel = (Button) findViewById(R.id.cancel_btn);
		check = (CheckBox) findViewById(R.id.checkBox1);

		check.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub

				if (!isChecked) {
					password.setTransformationMethod(PasswordTransformationMethod
							.getInstance());
				} else {
					password.setTransformationMethod(HideReturnsTransformationMethod
							.getInstance());
				}
			}
		});

		register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String user = username.getText().toString();
				String Pass = password.getText().toString();
				String Secu = securityhint.getText().toString();
				String Repass = repassword.getText().toString();
				String mob = mobile.getText().toString();
				String Secu1 = securityhint1.getText().toString();

				if (Pass.equals("") || Repass.equals("") || Secu.equals("")) {
					Toast.makeText(getApplicationContext(), "Fill All Fields",
							Toast.LENGTH_LONG).show();
					return;
				}

				if (!Pass.equals(Repass)) {
					Toast.makeText(getApplicationContext(),
							"Password does not match", Toast.LENGTH_LONG)
							.show();
					return;
				} else {
					// Save the Data in Database
					loginDataBaseAdapter.insertEntry(user, Pass, Repass, mob,
							Secu, Secu1);

					// reg_btn.setVisibility(View.GONE);
					Toast.makeText(getApplicationContext(),
							"Account Successfully Created ", Toast.LENGTH_LONG)
							.show();
					Log.d("PASSWORD", Pass);
					Log.d("RE PASSWORD", Repass);
					Log.d("SECURITY HINT", Secu);
					Intent i = new Intent(Registration.this, Login.class);
					startActivity(i);

				}
			}
		});
		cancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ii = new Intent(Registration.this, Login.class);
				startActivity(ii);
			}
		});

	}

}
