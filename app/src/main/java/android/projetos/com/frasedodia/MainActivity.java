package android.projetos.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private String[] frases = {
            "Ainda está aprendendo",
            "Dê um passo a mais hoje",
            "Amanhã esteja melhor do que hoje"
    };
//criação de variaveis que vão receber os objetos da tela pelo id
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associação dos elementos da tela a partir do Id a variáveis
        // usar antes do findview by id, o tipo do atributo criado acima pois o Id vem como int

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoGeraFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chamada da classe random para gerar números randomicos
                Random numeroRandomFrase = new Random();

// foi chamado o lenght para que ao adicionar frases não seja necessário alterar o tamanho do next int
                int numeroAleatorio = numeroRandomFrase.nextInt(frases.length);

                textoNovaFrase.setText( frases[ numeroAleatorio] );

            }
        });




    }
}
