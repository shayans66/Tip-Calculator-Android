package me.shayansarn.tipcalcshayan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTextView;
    TextView totalTextView;
    EditText billTotalEditText;

    Button tenPercentButton;
    Button fifteenPercentButton;
    Button twentyPercentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTotalTextView = findViewById(R.id.tipTotalTextView);
        //tipTotalTextView.setText("Why hello there");
        totalTextView = findViewById(R.id.totalTextView);
        billTotalEditText = findViewById(R.id.billTotalEditText);

        tenPercentButton = findViewById(R.id.tenButton);
        fifteenPercentButton = findViewById(R.id.twentyButton);
        twentyPercentButton = findViewById(R.id.thirtyButton);

        tenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Determine the Tip
                    //double tip = 0.10 * billTotalEditText.get

                Double billTotal = Double.parseDouble(billTotalEditText.getText().toString() );
                Double tipTotal = billTotal * 0.10;

                // Display tip

                tipTotalTextView.setText("Tip - $"+tipTotal);



                // Determine total

                Double total = billTotal + tipTotal

                // Display total
                totalTextView.setText("Tip - $"+total);
            }
        });

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Determine the Tip
                //double tip = 0.10 * billTotalEditText.get

                Double billTotal = Double.parseDouble(billTotalEditText.getText().toString() );
                Double tipTotal = billTotal * 0.15;

                // Display tip

                tipTotalTextView.setText("Tip - $"+tipTotal);



                // Determine total

                Double total = billTotal + tipTotal

                // Display total
                totalTextView.setText("Tip - $"+total);
            }
        });
        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Determine the Tip
                //double tip = 0.10 * billTotalEditText.get

                Double billTotal = Double.parseDouble(billTotalEditText.getText().toString() );
                Double tipTotal = billTotal * 0.20;

                // Display tip

                tipTotalTextView.setText("Tip - $"+tipTotal);



                // Determine total

                Double total = billTotal + tipTotal

                // Display total
                totalTextView.setText("Tip - $"+total);
            }
        });

    }
}
