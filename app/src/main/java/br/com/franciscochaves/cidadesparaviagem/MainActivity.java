package br.com.franciscochaves.cidadesparaviagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListaItens;
    private String[] itens = {
            "Angra dos Reis",
            "Cladas novas",
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

    }
}
