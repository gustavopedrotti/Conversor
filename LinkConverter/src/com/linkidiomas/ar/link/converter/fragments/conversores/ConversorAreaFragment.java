package com.linkidiomas.ar.link.converter.fragments.conversores;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.linkidiomas.ar.linkconverter.R;
import com.linkidiomas.ar.linkconverter.infra.PrincipalActivity;

public class ConversorAreaFragment extends Fragment {
	
	public PrincipalActivity activity = new PrincipalActivity();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.conversor_area_fragment, container, false);
		return view;
		
	}
	
	
	

}
