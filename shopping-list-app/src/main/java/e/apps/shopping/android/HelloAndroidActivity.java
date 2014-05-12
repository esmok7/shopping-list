package e.apps.shopping.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class HelloAndroidActivity extends Activity {

    private static final String TAG = "HelloAndroidActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(e.apps.shopping.android.R.menu.main, menu);
	return true;
    }

    public void gotoItemsActivity(View view) {
        Log.d(TAG, "Item button created");
        Intent intent = new Intent(this, ListItemsActivity.class);
        startActivity(intent);
    }

}

