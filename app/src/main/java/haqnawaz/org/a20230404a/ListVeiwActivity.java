package haqnawaz.org.a20230404a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListVeiwActivity extends AppCompatActivity {
    ArrayList<String> arrayList = new ArrayList<>();
    ListView listViewMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_veiw);
        arrayList.add("Zahid");
        arrayList.add("Nadeem");
        arrayList.add("Aisha");

        listViewMain = findViewById(R.id.listViewMain);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listViewMain.setAdapter(arrayAdapter);

listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        arrayList.get(position);
    }
});
    }
}