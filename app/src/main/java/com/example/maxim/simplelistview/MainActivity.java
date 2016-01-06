package com.example.maxim.simplelistview;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends ListActivity {

    final String[] currenciesArray = new String[]{"USD", "JPY", "BGN", "CZK", "DKK", "GBP", "HUF",
            "PLN", "RON", "SEK", "CHF", "NOK", "HRK", "RUB", "TRY"};

    private ArrayAdapter<String> mAdapter;
    private ArrayList<String> currenciesList = new ArrayList<>(Arrays.asList(currenciesArray));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, currenciesList);
        setListAdapter(mAdapter);

    }
}
