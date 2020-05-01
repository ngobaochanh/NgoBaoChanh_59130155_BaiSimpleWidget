package vn.edu.ntu.tuananh.ngobaochanh_59130155_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtten, edttuoi, edtST;
    Button btnXN;
    RadioGroup rdgchonGT;
    RadioButton rdbNam, rdbNu;
    CheckBox cb1, cb2, cb3, cb4 ,cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    private void addView(){
        edtten = findViewById(R.id.edtten);
        edttuoi = findViewById(R.id.edttuoi);
        edtST = findViewById(R.id.edtST);
        rdgchonGT = findViewById(R.id.rdgchonGT);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
        btnXN = findViewById(R.id.btnXN);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
    }
    private void addEvents(){
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnXN) {
                    String ten = edtten.getText() + "";
                    String tuoi = "Ngày Sinh: " + edttuoi.getText();
                    String ST = edtST.getText() + "";
                    String c1 = cb1.getText() + "";
                    String c2 = cb2.getText() + "";
                    String c3 = cb3.getText() + "";
                    String c4 = cb4.getText() + "";
                    String c5 = cb5.getText() + "";
                    String nam = rdbNam.getText() + "";
                    String nu = rdbNu.getText() + "";
                    String Vm = "Giới tính: ";
                    if (rdbNam.isChecked()) {
                        Vm += "Nam ";
                    }
                    if (rdbNu.isChecked()) {
                        Vm += "Nữ ";
                    }
                    String msg = "Sở thích: ";
                    if (cb1.isChecked()) {
                        msg += "Xem Phim;";
                    }
                    if (cb2.isChecked()) {
                        msg += " Nghe nhạc;";
                    }
                    if (cb3.isChecked()) {
                        msg += " Đi cafe với bạn bè;";
                    }
                    if (cb4.isChecked()) {
                        msg += " Ở nhà một mình;";
                    }
                    if (cb5.isChecked()) {
                        msg += " Vào bếp nấu ăn;";
                    }
                    Toast.makeText(MainActivity.this, ten + "\n" + tuoi + "\n" + Vm +"\n" + msg + " " + ST, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
