/*This program counts from 1 to 100 and displays for multiple of 3 Coffee, for multiple of 5 Mug, for multiple of both 3 and 5 displays CoffeeMug.
For any other number it displays the number.
This program was made by Roxana Ticala
*/
package example.com.android.coffeemug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // method called when button pressed
    // It checks if the number is multiple of 3,5 or both 3 and 5

    public void showText(View view) {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (number < 99) {
                    try {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                number++;
                                if (number % 3 == 0 && number % 5 == 0) {
                                    displayText("CoffeeMug");
                                } else if (number % 3 == 0) {
                                    displayText("Coffee");
                                } else if (number % 5 == 0) {
                                    displayText("Mug");
                                } else {
                                    displayCounter(number);
                                }
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }

    // method used to display text
    //@param text - is the text we want to be displayed

    public void displayText(String text) {
        TextView text_to_change = findViewById(R.id.text_to_change);

        text_to_change.setText("" + text);
    }

    //method used to display a number
    //@param num - is the number we want to be displayed

    public void displayCounter(int num) {
        TextView text_to_change = findViewById(R.id.text_to_change);

        text_to_change.setText("" + num);

    }
}
