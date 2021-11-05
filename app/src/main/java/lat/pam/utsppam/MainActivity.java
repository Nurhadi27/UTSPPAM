package lat.pam.utsppam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login(){
        //ambil nilai inputan
        TextView usernameView = findViewById(R.id.username_text);
        TextView passwordView = findViewById(R.id.password_text);

        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();


        //cek kondisi username dan password
        if (username.equals("test") && password.equals("123456")){
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}