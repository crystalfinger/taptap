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

				@Override
				public void run()
				{
					// Your Code :
					startActivity(new Intent(SILVER.this,MainActivity.class));
					finish();

				}
			},
			// SILVER TiME
			100000);

	}
	
}
