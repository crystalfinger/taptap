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
		Toast.makeText(this, "Im a toast message and love sushi 🥳", Toast.LENGTH_SHORT).show();
	}
	public void exitHandler(View v)
	{
		//Button exitBtn = (Button) findViewById(R.id.exitBtn);
		finish();
	}
}
