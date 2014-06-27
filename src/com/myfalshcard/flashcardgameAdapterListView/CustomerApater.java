package com.myfalshcard.flashcardgameAdapterListView;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomerApater<String> extends ArrayAdapter<String> {

	public CustomerApater(Context context, int resource, String[] items) {
		super(context, resource, items);
		// TODO Auto-generated constructor stub
	}
	
	public View getView(int position, View contextView, ViewGroup parent){
		View view = super.getView(position, contextView, parent);
		TextView tv = (TextView) view.findViewById(android.R.id.text1);
		tv.setBackgroundColor(Color.GRAY);
		return view;
		
	}

}
