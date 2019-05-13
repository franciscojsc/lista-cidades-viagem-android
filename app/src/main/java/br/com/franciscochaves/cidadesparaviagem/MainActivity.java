package br.com.franciscochaves.cidadesparaviagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mListaItens;
    private String[] itens = {
            "Angra dos Reis",
            "Caldas novas",
            "Aracaju",
            "Campos do Jordão",
            "Ilhéus",
            "Porto Seguro",
            "Costa do Sauípe",
            "Rio de Janeiro",
            "Santiago",
            "Praga",
            "Buenos Aires",
            "Budapest",
            "Cancun",
            "Aruba",
            "Caribe",
            "Tiradentes",
            "Zurique"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListaItens = findViewById(R.id.list_cidades);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens);

        mListaItens.setAdapter(adaptador);

        mListaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                String valorClicado = mListaItens.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
