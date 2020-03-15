package lt.mosaica.grade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.text);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt code here
                ArrayList<ReportCard> names = new ArrayList<ReportCard>();
                names.get(5);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, names);
                ListView listView = (ListView) findViewById(R.id.text);
                listView.setAdapter(adapter);
            }
        });
    }
}
