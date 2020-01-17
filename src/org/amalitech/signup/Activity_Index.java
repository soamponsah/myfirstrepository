package org.amalitech.signup;

	
	
	import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.ImageView;
	import android.widget.TextView;

	public class Activity_Index extends Activity {

		ImageView iv_img;
		EditText et_email, et_pswd;
		Button bttn_signup;
		TextView tv_login;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.signup);
			
			iv_img = (ImageView)findViewById(R.id.iv_img);
			et_email = (EditText)findViewById(R.id.et_mail);
			et_pswd = (EditText)findViewById(R.id.et_pswd);
			bttn_signup = (Button)findViewById(R.id.bttn_signup);
			tv_login = (TextView)findViewById(R.id.tv_login);
			
			bttn_signup.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(v.getId()==bttn_signup.getId())
					{
						bttn_signup.setText("Signup Now");
					}
					
				}
			});
			
		}

		@Override
		protected void onStart() {
			// TODO Auto-generated method stub
			super.onStart();
		}

		@Override
		protected void onRestart() {
			// TODO Auto-generated method stub
			super.onRestart();
		}

		@Override
		protected void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
		}

		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
		}

		@Override
		protected void onStop() {
			// TODO Auto-generated method stub
			super.onStop();
		}

		@Override
		protected void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
		}
		
		

	}

	

