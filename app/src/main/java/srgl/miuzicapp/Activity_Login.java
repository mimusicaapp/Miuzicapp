package srgl.miuzicapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

public class Activity_Login extends ActionBarActivity{

    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hacemos referencia a los objetos XML
        email = (EditText) findViewById(R.id.editText_login_email);
        password = (EditText) findViewById(R.id.editText_login_password);

    }

}
