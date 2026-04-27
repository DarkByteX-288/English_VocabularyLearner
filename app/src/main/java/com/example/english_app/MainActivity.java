package com.example.english_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvGreeting, tvSubTitle, tvWords, tvBestScore, tvStreak;
    private LinearLayout cardAnimals, cardFood, cardColors;
    private Button btnStartQuiz, btnViewVocabulary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setDashboardData();
        setClickListeners();
    }

    private void initViews() {
        tvGreeting = findViewById(R.id.tvGreeting);
        tvSubTitle = findViewById(R.id.tvSubTitle);
        tvWords = findViewById(R.id.tvWords);
        tvBestScore = findViewById(R.id.tvBestScore);
        tvStreak = findViewById(R.id.tvStreak);

        cardAnimals = findViewById(R.id.cardAnimals);
        cardFood = findViewById(R.id.cardFood);
        cardColors = findViewById(R.id.cardColors);

        btnStartQuiz = findViewById(R.id.btnStartQuiz);
        btnViewVocabulary = findViewById(R.id.btnViewVocabulary);
    }

    private void setDashboardData() {
        tvGreeting.setText("Welcome back 👋");
        tvSubTitle.setText("Build your English every day");
        tvWords.setText("24");
        tvBestScore.setText("80");
        tvStreak.setText("3");
    }

    private void setClickListeners() {
        cardAnimals.setOnClickListener(v ->
                showMessage("Animals category opened"));

        cardFood.setOnClickListener(v ->
                showMessage("Food category opened"));

        cardColors.setOnClickListener(v ->
                showMessage("Colors category opened"));

        btnStartQuiz.setOnClickListener(v ->
                showMessage("Quiz screen will be added next"));

        btnViewVocabulary.setOnClickListener(v ->
                showMessage("Vocabulary list will be added next"));
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}