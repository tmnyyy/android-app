package com.itstep.fiveapplication.ex_006_fragment_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;


import com.itstep.fiveapplication.R;

import java.util.ArrayList;
import java.util.List;


public class RegisterOrLoginActivity extends Activity implements View.OnClickListener {

    private EditText login;
    private EditText password;
    private CheckBox checkBox;
    private Button button;
    private TextView result;
    private RegisterFieldsFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_006_fragment_example);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
        button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);
        fragment = new RegisterFieldsFragment();

        checkBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        result.setText(R.string.empty_text);

        if (checkBox.isChecked()) {
            getFragmentManager().beginTransaction().add(R.id.frame_layout, fragment).commit();
            button.setText(R.string.register);
        } else {
            getFragmentManager().beginTransaction().remove(fragment).commit();
            button.setText(R.string.log);
        }
    }

    public void click(View view) {
        String loginTxt = login.getText().toString();
        String passwordTxt = password.getText().toString();

        if (checkBox.isChecked()) {
            EditText textName = (EditText) fragment.getView().findViewById(R.id.name);
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
            result.setText(" Registration succsessfull!" + user.getName() + " registered");

        } else {
            result.setText(" This user is exists :(");
        }
    }

    private void login(String login, String password) {
        User user = new User(null, login, password);
        List<User> users = User.getAllUsers();

        if (users.contains(user)) {
            User currentUser = getUser(user.getLogin(), users);
            checkPassword(password, currentUser);
        } else {
            result.setText("User not registered");
        }

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
            result.setText("Hello " + user.getName());
        } else {
            result.setText("Uncorrect password");
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
