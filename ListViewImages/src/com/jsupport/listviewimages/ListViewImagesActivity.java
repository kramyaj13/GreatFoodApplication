package com.jsupport.listviewimages;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewImagesActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ArrayList<ItemDetails> image_details = GetSearchResults();
        
        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));
        
        lv1.setOnItemClickListener(new OnItemClickListener() {
        	@Override
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		
        		Object o = lv1.getItemAtPosition(position);
            	ItemDetails obj_itemDetails = (ItemDetails)o;
            	
        		Toast.makeText(ListViewImagesActivity.this, "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_LONG).show();
        		Intent nextScreen = new Intent(getApplicationContext(),SingleItemMenu.class);
        		nextScreen.putExtra("subcat",obj_itemDetails.getName());
        		//Start SubmenuActivity Activity
        		startActivity(nextScreen);
        		
        	}  
        });
    }
    
    private ArrayList<ItemDetails> GetSearchResults(){
    	ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
    	
    	ItemDetails item_details = new ItemDetails();
    	item_details.setName("Pizza");
    	item_details.setItemDescription("Spicy Chiken Pizza");
    	item_details.setPrice("Php 310.00");
    	item_details.setImageNumber(1);
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Burger");
    	item_details.setItemDescription("Beef Burger");
    	item_details.setPrice("Php 350.00");
    	item_details.setImageNumber(2);
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Pizza");
    	item_details.setItemDescription("Chiken Pizza");
    	item_details.setPrice("Php 250.00");
    	item_details.setImageNumber(3);
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Burger");
    	item_details.setItemDescription("Chicken Burger");
    	item_details.setPrice("Php 350.00");
    	item_details.setImageNumber(4);
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Burger");
    	item_details.setItemDescription("Fish Burger");
    	item_details.setPrice("Php 310.00");
    	item_details.setImageNumber(5);
    	results.add(item_details);
    	
    	item_details = new ItemDetails();
    	item_details.setName("Mango");
    	item_details.setItemDescription("Mango Juice");
    	item_details.setPrice("Php 250.00");
    	item_details.setImageNumber(6);
    	results.add(item_details);
    	
    	
    	return results;
    }
}