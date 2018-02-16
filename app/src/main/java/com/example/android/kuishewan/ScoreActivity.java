package com.example.android.kuishewan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScoreActivity extends AppCompatActivity {
    @BindView(R.id.homeBtn)
    ImageButton homeBtn;
    TextView mtvHasilAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ButterKnife.bind(this);
        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        setSkor();

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void setSkor() {
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        mtvHasilAkhir.setText("SCORE = "+skorPilGan);
    }
}
