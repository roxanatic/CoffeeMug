package example.com.android.coffemug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view)
    {

    }

    public void displayText (String text)
    {
        TextView text_to_change =  findViewById(R.id.text_to_change);

        text_to_change.setText("" + text);
    }
}
