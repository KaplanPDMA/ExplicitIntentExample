package sg.com.kaplan.pdma.explicitintentexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static int request_code = 123;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText questionText = (EditText) findViewById(R.id.QuestionText);
        Button button = (Button) findViewById(R.id.AskButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);
                String question = questionText.getText().toString();
                intent.putExtra("question", question);
                startActivityForResult(intent, request_code);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == request_code && resultCode == RESULT_OK) {
            TextView replyText = (TextView) findViewById(R.id.ReplyText);
            String reply = data.getExtras().getString("reply");
            replyText.setText(reply);
        }
    }
}
