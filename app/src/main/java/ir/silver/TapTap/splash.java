package ir.silver.TapTap;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;

public class splash extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable()
		{

				@Override
				public void run()
				{
					// Your Code :
					startActivity(new Intent(splash.this,MainActivity.class));
					finish();
					Toast.makeText(getApplicationContext(),"ساخته شده با ❤️ توسط ابوالفضل شرفی😎",Toast.LENGTH_SHORT).show();
					
				}
			},
		// Splash TiME
		5000);
		
	}
	
}
