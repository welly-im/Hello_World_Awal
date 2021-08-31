package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String status = "Pertemuan Kedua";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(status,"Method dipanggil pada saat activity dimulai");
        Toast.makeText(this,"Method dipanggil pada saat activity dimulai",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(status, "Method dipanggil ketika activity sudah terlihat oleh user");
        Toast.makeText(this,"Method dipanggil ketika activity sudah terlihat oleh user",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(status, "Method ini dipanggil ketika activity mulai berinteraksi dengan user ");
        Toast.makeText(this,"Method ini dipanggil ketika activity mulai berinteraksi dengan user ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(status," method ini dipanggil ketika activity berhenti sementara ");
        Toast.makeText(this,"method ini dipanggil ketika activity berhenti sementara ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(status,"method ini dipanggil ketika activity sudah tidak terlihat pada user");
        Toast.makeText(this,"method ini dipanggil ketika activity sudah tidak terlihat pada user ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(status,"method ini dipanggil sebelum activity dimatikan");
        Toast.makeText(this,"method ini dipanggil sebelum activity dimatikan ",Toast.LENGTH_SHORT).show();
    }
}
