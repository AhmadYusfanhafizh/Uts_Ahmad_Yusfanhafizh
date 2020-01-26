package id.ac.poliban.mi.yusfan.uts_ahmad_yusfanhafizh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgKelamin = findViewById(R.id.rgKelamin);
        RadioButton rbLakiLaki = findViewById(R.id.rbLakiLaki);
        RadioButton rbPerempuan = findViewById(R.id.rbPerempuan);
        Spinner sAgama = findViewById(R.id.sAgama);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);
        EditText etPendaftaran = findViewById(R.id.etPendaftaran);
        EditText etNama = findViewById(R.id.etNama);
        EditText etAlamat = findViewById(R.id.etAlamat);
        EditText etTelp = findViewById(R.id.etTelp);



        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPendaftaran.setText("");
                etNama.setText("");
                etAlamat.setText("");
                etTelp.setText("");
                rbLakiLaki.setChecked(false);
                rbPerempuan.setChecked(false);
                sAgama.setSelection(0);
            }
        });

        btSubmit.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Registrasi Mahasiswa")
                    .setMessage(etPendaftaran.getText())
                    .setMessage(etNama.getText())
                    .setMessage(etTelp.getText())
                    .setMessage(etAlamat.getText())
                    .setPositiveButton("OK", null).show();
        });

    }

    private void openDialog() {

    }
}
