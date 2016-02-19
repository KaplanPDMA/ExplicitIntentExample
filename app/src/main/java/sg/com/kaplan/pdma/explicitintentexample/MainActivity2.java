package sg.com.kaplan.pdma.explicitintentexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView questionText = (TextView) findViewById(R.id.QuestionText);

        Bundle extras = getIntent().getExtras();
        String question = extras.getString("question");
        questionText.setText(question);

    }

}
