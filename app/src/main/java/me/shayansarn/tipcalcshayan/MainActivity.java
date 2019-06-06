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
    EditText tipPercentEditText;

    Button calculateButton;
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
        tipPercentEditText = findViewById(R.id.tipPercentEditText);

        calculateButton = findViewById(R.id.calculateButton);
        tenPercentButton = findViewById(R.id.tenPercentButton);
        twentyPercentButton = findViewById(R.id.twentyPercentButton);
        fifteenPercentButton = findViewById(R.id.fifteenPercentButton);

        //tenPercentButton = findViewById(R.id.tenButton);
        //fifteenPercentButton = findViewById(R.id.twentyButton);
        //twentyPercentButton = findViewById(R.id.thirtyButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(Double.valueOf(tipPercentEditText.getText().toString().substring(7))    /100.0);
            }
        });

        tenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(Double.valueOf(0.10));
            }
        });

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(Double.valueOf(0.15));
            }
        });

        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(0.20);
            }
        });




    }


    /**
     * Changes the TipTextView and the TotalTextView to the appropriate values
     * @param tipPercentage
     * Is a decimal value, not percentage value (0.15, 0.2, etc)
     */
    public void calcTheTip(Double tipPercentage){
        // Determine the Tip
        //double tip = 0.10 * billTotalEditText.get

        Double billTotal = Double.valueOf(billTotalEditText.getText().toString() );
        Double tipTotal = billTotal * tipPercentage;

        // Display tip

            // round the tipTotal
        String roundedTip = String.format("%.2f", tipTotal);

        tipTotalTextView.setText("Tip - $"+roundedTip);



        // Determine total

        Double total = billTotal + tipTotal;

        // Display total

        String roundedTotal = String.format("%.2f", total);

        totalTextView.setText("Tip - $"+roundedTotal);

    }
}
