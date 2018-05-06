package com.tongleer.demo.android.listview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.tongleer.demo.android.R;
/**
 * ʵ��2�е�ListView
 * @author tongleer.com
 *
 */
public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView)findViewById(R.id.lv);
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 21; i++) {
			list.add("����:"+i);
		}
		MyAdapter adapter = new MyAdapter(this,R.layout.moban,list);
		lv.setAdapter(adapter);
	}
	
}
