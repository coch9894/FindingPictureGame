package coch9894.picturegame;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivityListview extends Activity {
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Get ListView object from xml
		listView = (ListView)findViewById(R.id.list);
		
		//Defined Array values to show in ListView
		String[] values = new String[] {"Game 1",
				"Game 2",
				"Game 3"
		};
		
		//Define a new Adapter
		// 1st param = Context
		// 2nd param = Layout
		// 3rd param = ID
		// 4th param = Data array
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
		
		//Assign adapter to ListView
		listView.setAdapter(adapter);
		
		//ListView Item Click Listener
		listView.setOnItemClickListener(new OnItemClickListener(){
			
			//@Override
			public void onItemClick(AdapterView<?>parent, View view, int position, long id){
				//ListView Clicked item index
				int itemPosition = position;
				
				//ListView Clicked Item value
				String itemValue = (String)listView.getItemAtPosition(position);
				
				//Show Alert
				Toast.makeText(getApplicationContext(), "Position :"+itemPosition+" ListItem:"+itemValue, Toast.LENGTH_LONG).show();
				
			}
		});
	}
}
