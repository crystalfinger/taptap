package ir.silver.TapTap;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import ir.silver.TapTap.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }
	public void btnHandler(View v)
	{
		Toast.makeText(this, "its me?really me????are you sure its me???", Toast.LENGTH_SHORT).show();
	}
	public void exitHandler(View v)
	{
		//Button exitBtn = (Button) findViewById(R.id.exitBtn);
		finish();
	}
	public void startGame(View v)
	{
	 	Toast.makeText(getApplication(),"در آپدیت جدید این بخش فعال میشود️",Toast.LENGTH_LONG).show();
		
	}
}
