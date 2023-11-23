package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtMSSV, edtTuoi;
    Button btnLuu;
    TextView ketqua;
    RadioButton rbtn1, rbtn2;
    CheckBox cb1, cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.edtTen);
        edtMSSV = findViewById(R.id.edtMSSV);
        edtTuoi = findViewById(R.id.edtTuoi);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        btnLuu = findViewById(R.id.btnLuu);
        ketqua = findViewById(R.id.ketqua);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtTen.getText().toString();
                String mssv = edtMSSV.getText().toString();
                String age = edtTuoi.getText().toString();
                String gender = "Nam";
                if (rbtn2.isChecked()) {
                    gender = "Nữ";
                }

                String hobbies = "";
                if (cb1.isChecked()) {
                    hobbies += cb1.getText().toString() + ", ";
                }
                if (cb2.isChecked()) {
                    hobbies += cb2.getText().toString();
                }

                String result = "Tên bạn: " + name + "\n" +
                        "MSSV: " + mssv + "\n" +
                        "Tuổi: " + age + "\n" +
                        "Giới tính: " + gender + "\n" +
                        "Sở thích: " + hobbies + "\n";
                ketqua.setText(result);
            }
        });
    }
}
