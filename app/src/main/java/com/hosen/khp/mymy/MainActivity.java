package com.hosen.khp.mymy;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    /**
     * This class describes an individual sample (the sample title, and the activity class that
     * demonstrates this sample).
     */
    private class Sample {
        private CharSequence title;
        private Class<? extends Activity> activityClass;

        public Sample(int titleResId, Class<? extends Activity> activityClass) {
            this.activityClass = activityClass;
            this.title = getResources().getString(titleResId);
        }

        @Override
        public String toString() {
            return title.toString();
        }
    }
    public void onClick(View v){


            switch(v.getId()) {
                case R.id.button22:
                     Toast.makeText(MainActivity.this, "YOUR MESSAGE", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button:

                    break;
              default:
                  break;
            }

    }
    private static Sample[] mSamples;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, ScreenSlideActivity.class));
        // Instantiate the list of samples.
       /* mSamples = new Sample[]{

                new Sample(R.string.title_screen_slide, ScreenSlideActivity.class)

        };
        setListAdapter(new ArrayAdapter<Sample>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                mSamples));*/
    }
  //  @Override
   /* protected void onListItemClick(ListView listView, View view, int position, long id) {
        // Launch the sample associated with this list position.
        startActivity(new Intent(MainActivity.this, mSamples[position].activityClass));
    }*/
}
