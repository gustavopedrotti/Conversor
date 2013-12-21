package com.linkidiomas.ar.link.converter.fragments;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.linkidiomas.ar.linkconverter.PrincipalActivity;
import com.linkidiomas.ar.linkconverter.R;
import com.linkidiomas.ar.linkconverter.vo.Conversor;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorArea;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorComprimento;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorMassa;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorMoeda;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorTemperatura;
import com.linkidiomas.ar.linkconverter.vo.tipo.ConversorVelocidade;

public class ListaConversoresFragment extends ListFragment {

	private PrincipalActivity activity;
	private ListView lista;
	private List<Conversor> listaValores;
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(activity, "Deu certo!", Toast.LENGTH_LONG).show();
		activity.closeDrawers();
		super.onListItemClick(l, v, position, id);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		this.lista = ((ListView) getView().findViewById(android.R.id.list));
		this.activity = ((PrincipalActivity) getActivity());
		loadListView();
	}

	private void loadListView() {
		criaListaConversor();
		ConversorAdapter adapter = new ConversorAdapter(this.activity, this.listaValores);
		this.lista.setAdapter(adapter);
		setListShown(true);

	}

	public void criaListaConversor() {
		ConversorArea carea = new ConversorArea();
		ConversorComprimento ccomprimento = new ConversorComprimento();
		ConversorMassa cmassa = new ConversorMassa();
		ConversorMoeda cmoeda = new ConversorMoeda();
		ConversorTemperatura ctemperatura = new ConversorTemperatura();
		ConversorVelocidade cvelocidade = new ConversorVelocidade();
		listaValores = new ArrayList<Conversor>();
		this.listaValores.add(carea);
		this.listaValores.add(ccomprimento);
		this.listaValores.add(cmassa);
		this.listaValores.add(cmoeda);
		this.listaValores.add(ctemperatura);
		this.listaValores.add(cvelocidade);
	}

	public class ConversorAdapter extends ArrayAdapter<Conversor> {

		

		public ConversorAdapter(Context context, int resource,
				Conversor[] objects) {
			super(context, resource, objects);
		}

		public ConversorAdapter(Context context, int resource,
				int textViewResourceId, Conversor[] objects) {
			super(context, resource, textViewResourceId, objects);
		}

		public ConversorAdapter(Context context, int resource,
				int textViewResourceId) {
			super(context, resource, textViewResourceId);
		}

		public ConversorAdapter(Context context, List<Conversor> valores) {
			super(context, com.linkidiomas.ar.linkconverter.R.layout.opcoes_conversores_row,
					valores);
		}
		

		public ConversorAdapter(Context context, int resource) {
			super(context, resource);
		}

		public ConversorAdapter(Context context, int resource,
				int textViewResourceId, List<Conversor> objects) {
			super(context, resource, textViewResourceId, objects);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
				convertView = inflater.inflate
						(com.linkidiomas.ar.linkconverter.R.layout.opcoes_conversores_row,
								parent, false);
			}
			
			Conversor conversor = listaValores.get(position);
			
			TextView textViewItemNome = (TextView) convertView.findViewById
					(com.linkidiomas.ar.linkconverter.R.id.conversor_nome_row);
			
			textViewItemNome.setText(conversor.getNome());
			
			TextView textViewItemDescricao = (TextView) convertView.findViewById
					(R.id.conversor_descricao_row);
			
			textViewItemDescricao.setText(conversor.getDescricao());
			
			return convertView;
		
		}
		
	}

}
