package com.itstep.fourapplication.ex_005_toast_and_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.itstep.fourapplication.R;

import java.util.ArrayList;
import java.util.List;



public class RegisterOrLoginActivity extends Activity implements View.OnClickListener {

    private EditText login;
    private EditText password;
    private CheckBox checkBox;
    private TextView pressName;
    private EditText textName;
    private FrameLayout additionText;
    private FrameLayout additionField;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_005_register_or_login_layout);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
        additionField = (FrameLayout) findViewById(R.id.addition_field);
        additionText = (FrameLayout) findViewById(R.id.addition_text);
        button = (Button) findViewById(R.id.button);

        pressName = new TextView(this);
        pressName.setText("Press name: ");
        textName = new EditText(this);
        textName.setEms(10);
        textName.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        checkBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (checkBox.isChecked()) {
            additionField.addView(textName);
            additionText.addView(pressName);
            button.setText(R.string.register);
        } else {
            additionText.removeView(pressName);
            additionField.removeView(textName);
            button.setText(R.string.log);
        }
    }

    public void click(View view) {
        String loginTxt = login.getText().toString();
        String passwordTxt = password.getText().toString();

        if (checkBox.isChecked()) {
            String nameTxt = textName.getText().toString();
            register(nameTxt, loginTxt, passwordTxt);
        } else {
            login(loginTxt, passwordTxt);
        }

    }

    private void register(String name, String login, String password) {
        User user = new User(name, login, password);
        List<User> users = User.getAllUsers();

        if (!users.contains(user)) {
            User.getAllUsers().add(user);
            goToUserActivity("Registration succsessfull!" + user.getName() + " registered\nHello " + user.getName());
        } else {
            Toast.makeText(this, "This user is Exists", Toast.LENGTH_SHORT).show();;
        }
    }

    private void login(String login, String password) {
        User user = new User(null, login, password);
        List<User> users = User.getAllUsers();

        if (users.contains(user)) {
            User currentUser = getUser(user.getLogin(), users);
            checkPassword(password, currentUser);
        } else {
            Toast.makeText(this, "User not registered", Toast.LENGTH_SHORT).show();
        }

    }

    private void goToUserActivity(String message) {
        Intent intent = new Intent(this, UserActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }

    private User getUser(String login, List<User> users) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }

    private void checkPassword(String password, User user) {
        if (password.equals(user.getPassword())) {
            goToUserActivity("Hello " + user.getName());
        } else {
            Toast.makeText(this, "Uncorrect password", Toast.LENGTH_SHORT).show();
        }
    }

}

class User {

    private String name;
    private String login;
    private String password;

    private static List<User> allUsers = new ArrayList<>();

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            User user = (User) obj;
            return login.equals(user.login);
        }
        return false;
    }

    public static List<User> getAllUsers() {
        return allUsers;
    }


}
