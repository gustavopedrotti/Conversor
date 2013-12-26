package com.linkidiomas.ar.link.converter.fragments;

import com.linkidiomas.ar.linkconverter.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TelaInicialFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.tela_inicial_fragment, container,false);
		return view;
	}
	
}
