/**
 * File: MainActivity.java
 * Author: Shaina Krumme
 * Date: 17 March 2017
 */

package com.example.shaina.format_text_app;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button decreaseSize, increaseSize, italicizeText, boldItalicText, boldText, serifText;
    private Button sansSerifText, monospaceText, redText, greenText, blueText, grayText;
    private EditText editText;
    int size = 18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        editText = (EditText) findViewById(R.id.editText);
        decreaseSize = (Button)findViewById(R.id.decrease);
        increaseSize = (Button)findViewById(R.id.increase);
        italicizeText = (Button)findViewById(R.id.italicize);
        boldItalicText = (Button)findViewById(R.id.boldItalic);
        boldText = (Button)findViewById(R.id.bold);
        serifText = (Button)findViewById(R.id.serif);
        sansSerifText = (Button)findViewById(R.id.sansserif);
        monospaceText = (Button)findViewById(R.id.monospace);
        redText = (Button)findViewById(R.id.red);
        greenText = (Button)findViewById(R.id.green);
        blueText = (Button)findViewById(R.id.blue);
        grayText = (Button)findViewById(R.id.gray);

        decreaseSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size--;
                editText.setTextSize(size);

            }
        });

        increaseSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size++;
                editText.setTextSize(size);
            }
        });

        italicizeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(null, Typeface.ITALIC);
            }
        });

        boldItalicText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(null, Typeface.BOLD_ITALIC);
            }
        });

        boldText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(null, Typeface.BOLD);
            }
        });

        serifText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(Typeface.SERIF);
            }
        });

        sansSerifText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(Typeface.SANS_SERIF);
            }
        });

        monospaceText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTypeface(Typeface.MONOSPACE);
            }
        });

        redText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTextColor(Color.RED);
            }
        });

        greenText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTextColor(Color.GREEN);
            }
        });

        blueText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTextColor(Color.BLUE);
            }
        });

        grayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setTextColor(Color.GRAY);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
