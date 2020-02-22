package lt.mosaica.practicecallingobject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Oh, the possibilities!!! lalalla llaaa llala");
        textView.setTextSize(56);
        textView.setTextColor(Color.RED);
        textView.setMaxLines(3);

        setContentView(textView);
    }
}
