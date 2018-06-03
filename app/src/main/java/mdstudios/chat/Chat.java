package mdstudios.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Chat extends AppCompatActivity {

    TextView nameView;
    TextView emailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        nameView = findViewById(R.id.nameView);
        emailView = findViewById(R.id.emailView);

        User user = (User) getIntent().getExtras().get("user");

        nameView.setText(user.name);
        emailView.setText(user.email);
    }
}
