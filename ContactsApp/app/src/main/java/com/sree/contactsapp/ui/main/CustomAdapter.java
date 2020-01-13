package com.sree.contactsapp.ui.main;


import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.sree.contactsapp.R;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ContactData> {
    private ArrayList<ContactData> data;
    private final Activity context;

    public CustomAdapter(ArrayList<ContactData> data , Activity context) {
        super(context, R.layout.displaycontact, data);
        this.context=context;
        this.data = data;
    }

    public View getView(int position, View view, ViewGroup parent) {
        Log.e("TIMES","I'm : "+position);
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.displaycontact,null);
        TextView name,phno;
        name = rowView.findViewById(R.id.name);
        phno = rowView.findViewById(R.id.phoneno);
        name.setText(data.get(position).name);
        phno.setText(data.get(position).phoneno);
        return super.getView(position,view,parent);
    }
}