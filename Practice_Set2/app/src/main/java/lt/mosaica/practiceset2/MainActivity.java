package lt.mosaica.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;
        int actualHours = weekday * 5;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);

        //display("this is box");

/*        int rasberryPrice = 5;
        display1("1 box $" + rasberryPrice);
        display2("2 boxes $" + rasberryPrice * 2);
        display3("3 boxes $" + rasberryPrice * 3);*/
    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(i + "");      //tarpas, kad nebutu string error
    }

/*    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }*/
}
