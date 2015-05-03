package srgl.miuzicapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class Activity_Login extends ActionBarActivity implements TextWatcher{

    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hacemos referencia
        email = (EditText) findViewById(R.id.editText_login_email);
        password = (EditText) findViewById(R.id.editText_login_password);

        //Agregamos escuchadores
        email.addTextChangedListener(this);
        password.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

    @Override
    public void afterTextChanged(Editable s) {

        if(s.toString().length() > 0) {
            email.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
            email.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_login_email, 0, 0, 0);
        }
    }
}
