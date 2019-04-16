package com.example.assignment1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button uninstallButton;
    private Button openButon;
    private Button categoryButton;
    private Button similarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uninstallButton = (Button) findViewById(R.id.uninstall_button);
        openButon = (Button) findViewById(R.id.open_button);
        categoryButton = (Button) findViewById(R.id.category_button);
        similarButton = (Button) findViewById(R.id.similar_button);
        setClickListener(uninstallButton,"Uninstall button was clicked");
        setClickListener(openButon,"Open button was clicked");
        setClickListener(categoryButton,"Category button was clicked");
        setClickListener(similarButton,"Similar button was clicked");

    }

    private void setClickListener(Button button, final String snackbarText){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, snackbarText,Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });
    }
}
