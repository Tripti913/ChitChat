package com.example.chitchat;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chitchat.databinding.ActivitySignUpBinding;

import java.util.Objects;

public class SignUpActivity<FirebaseAuth> extends AppCompatActivity {

    ActivitySignUpBinding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setContentView(R.layout.activity_sign_up);

        Objects.requireNonNull(getSupportActionBar()).hide();
        FirebaseAuth auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        binding.btnsignup.setOnClickListener(new View.OnClickListener());
        @Override
                public void onClick(view view)
        {
            auth.createUserWithEmailAndPassword(binding.etemail.getText().toString() , binding.etpassword.getText().toString())
        }


    });
}