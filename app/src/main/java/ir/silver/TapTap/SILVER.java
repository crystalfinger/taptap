package ir.silver.TapTap;
import android.app.*;
import android.os.*;
import android.content.*;

public class SILVER extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.silver);

		new Handler().postDelayed(new Runnable()
			{
				private int hitCount;

				//Create a public method to increment the hit count
				public void incrementHitCount() {
					hitCount++;
				}
				@Override
				public void run()
				{
					// Your Code :
					startActivity(new Intent(SILVER.this,MainActivity.class));

				}
			},
			// SILVER TiME
			10000);

	}
	
}
