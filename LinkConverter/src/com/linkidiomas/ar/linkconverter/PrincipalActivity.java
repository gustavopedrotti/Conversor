package com.linkidiomas.ar.linkconverter;

import com.linkidiomas.ar.link.converter.fragments.ListaConversoresFragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class PrincipalActivity extends Activity {

	private ListaConversoresFragment listaFragment;
	private DrawerLayout DrawerLayout;
	private ActionBarDrawerToggle Toggle;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		listaFragment = new ListaConversoresFragment();

			
		
		if (findViewById(R.id.menu_drawer_layout) != null) {

			getActionBar().setDisplayHomeAsUpEnabled(true);
			getActionBar().setHomeButtonEnabled(true);
			
			DrawerLayout = (android.support.v4.widget.DrawerLayout) 
					findViewById(R.id.menu_drawer_layout);
			
			Toggle = new ActionBarDrawerToggle(this, DrawerLayout, R.drawable.ic_drawer,
					R.string.app_name, R.string.app_name){
				
				public void onDrawerOpened(android.view.View drawerView) {
					invalidateOptionsMenu();
				}
				
				public void onDrawerClosed(android.view.View drawerView) {
					invalidateOptionsMenu();
				}
				
			};
			
			Toggle.syncState();
			DrawerLayout.setDrawerListener(Toggle);
		}
		
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.menu_frame_list, listaFragment);
		ft.commit();	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (Toggle != null && Toggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void closeDrawers() {
		DrawerLayout.closeDrawers();
	}
	
	

}
