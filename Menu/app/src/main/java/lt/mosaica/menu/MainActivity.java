package lt.mosaica.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView textViewItem1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textViewItem1.getText().toString();
        menuItem1 = menuItem1 + " lalalala lallaall lalalala lallalal";
        Log.v("MainActivity", menuItem1);

        TextView textViewItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textViewItem2.getText().toString();
        Log.v("MainActivity", menuItem2);

        TextView textViewItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textViewItem3.getText().toString();
        Log.e("MainActivity", menuItem3);
    }
}
