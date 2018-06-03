package mdstudios.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText nameView;
    EditText passwordView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        nameView = findViewById((R.id.name));
        passwordView = findViewById((R.id.password));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameView.getText().toString();
                Toast.makeText(getApplicationContext(), "hello " + name, Toast.LENGTH_LONG).show();
                String password = passwordView.getText().toString();
                createUser(name, password);
            }
        });
    }

    private void createUser(String name, String email){
        User user = new User(name, email);
        goToChat(user);
    }

    private void goToChat(User user){
      Intent intent = new Intent(this, Chat.class);
      Bundle bundle = new Bundle();
      bundle.putSerializable("user", user);
      intent.putExtras(bundle);
      startActivity(intent);
    }
}
