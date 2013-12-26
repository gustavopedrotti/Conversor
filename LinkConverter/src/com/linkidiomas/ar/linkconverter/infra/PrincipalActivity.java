package com.linkidiomas.ar.linkconverter.infra;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;

import com.linkidiomas.ar.link.converter.fragments.ListaConversoresFragment;
import com.linkidiomas.ar.link.converter.fragments.TelaInicialFragment;
import com.linkidiomas.ar.linkconverter.R;

public class PrincipalActivity extends Activity {

	private ListaConversoresFragment listaFragment;
	private DrawerLayout DrawerLayout;
	private ActionBarDrawerToggle Toggle;
	private TelaInicialFragment tif = new TelaInicialFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		listaFragment = new ListaConversoresFragment();

		FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
		fragmentTransaction.replace(R.id.menu_frame_detail, tif);
		fragmentTransaction.commit();
		
		if (findViewById(R.id.menu_drawer_layout) != null) {

			getActionBar().setDisplayHomeAsUpEnabled(true);
			getActionBar().setHomeButtonEnabled(true);
			
			DrawerLayout = (android.support.v4.widget.DrawerLayout) 
					findViewById(R.id.menu_drawer_layout);
			
			Toggle = new ActionBarDrawerToggle(this, DrawerLayout, R.drawable.ic_drawer,
					R.string.app_name, R.string.app_name){
				
				public void onDrawerOpened(android.view.View drawerView) {
					
					if(findViewById(R.id.scroll_area) != null){
						System.out.println("Uhull");
					}else{
						System.out.println("ahhhh");
					}
					
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
	
	public void replace(Fragment fragment){
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.menu_frame_detail, fragment);
		ft.commit();
	}

}
