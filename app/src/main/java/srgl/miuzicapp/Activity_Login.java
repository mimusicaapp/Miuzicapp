package srgl.miuzicapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.EditText;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class Activity_Login extends ActionBarActivity{

    private EditText email, password;
    private LoginButton facebook;
    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Inicializamos el SDK de Facebook
        FacebookSdk.sdkInitialize(getApplicationContext());

        facebook = (LoginButton) findViewById(R.id.login_button_facebook);
        facebook.setReadPermissions("user_friends");
        callbackManager = CallbackManager.Factory.create();
        facebook.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.v("Facebook", "onSucess()");
            }

            @Override
            public void onCancel() {
                Log.v("Facebook", "onCancel()");
            }

            @Override
            public void onError(FacebookException error) {
                Log.v("Facebook", "onError()");
            }
        });


        //Hacemos referencia a los objetos XML
        email = (EditText) findViewById(R.id.editText_login_email);
        password = (EditText) findViewById(R.id.editText_login_password);


    }

}
