package haqnawaz.org.a20230404a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewAfternoon extends AppCompatActivity {
    ArrayList<String> arrayList = new ArrayList<>();
    ListView listView;
    EditText edit;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_afternoon);

        edit = findViewById(R.id.edittext);
        button = findViewById(R.id.button6);

        arrayList.add("Abdullah");
        arrayList.add("Nadeem");
        arrayList.add("Fatima");
        ArrayAdapter<String > arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);

        listView = findViewById(R.id.listViewAfternoon);
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                arrayList.add(s);
//                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String f = arrayList.get(position);
                button.setText(f);
            }
        });






    }
}