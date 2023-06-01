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

public class ListViewMorning extends AppCompatActivity {
    ListView listView;
    EditText editText;
    Button btn;
    ArrayList<String> morningStudentList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_morning);
        btn = findViewById(R.id.enter);

        morningStudentList.add("Ahad");
        morningStudentList.add("Naeem");
        morningStudentList.add("Fatima");
        ArrayAdapter<String > arrayAdapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,morningStudentList);

        listView= findViewById(R.id.listViewMorning);
        listView.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText= findViewById(R.id.enterText);
                String str = editText.getText().toString();
                morningStudentList.add(str);
                //listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = morningStudentList.get(position);
                btn.setText(name);
            }
        });

    }
}




