package reagodjj.example.com.encryptionalgorithm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btDes;
    private Button bt3des;
    private Button btRc4;
    private Button btAes;
    private Button btRsa;
    private Button btSm2;
    private Button btSm2Change;
    private Button btSm3;
    private Button btSm4;
    private Button btBase64;
    private Button btChangeBetweenSystemCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btDes = findViewById(R.id.bt_des);
        bt3des = findViewById(R.id.bt_3des);
        btRc4 = findViewById(R.id.bt_rc4);
        btAes = findViewById(R.id.bt_aes);
        btRsa = findViewById(R.id.bt_rsa);
        btSm2 = findViewById(R.id.bt_sm2);
        btSm2Change = findViewById(R.id.bt_sm2_change);
        btSm3 = findViewById(R.id.bt_sm3);
        btSm4 = findViewById(R.id.bt_sm4);
        btBase64 = findViewById(R.id.bt_base64);
        btChangeBetweenSystemCode = findViewById(R.id.bt_change_between_system_code);

        btDes.setOnClickListener(this);
        bt3des.setOnClickListener(this);
        btRc4.setOnClickListener(this);
        btAes.setOnClickListener(this);
        btRsa.setOnClickListener(this);
        btSm2.setOnClickListener(this);
        btSm2Change.setOnClickListener(this);
        btSm3.setOnClickListener(this);
        btSm4.setOnClickListener(this);
        btBase64.setOnClickListener(this);
        btChangeBetweenSystemCode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_des:
                startActivity(new Intent(MainActivity.this, DesActivity.class));
                break;

            case R.id.bt_3des:
                startActivity(new Intent(MainActivity.this, _3DesActivity.class));
                break;

            case R.id.bt_rc4:
                startActivity(new Intent(MainActivity.this, Rc4Activity.class));
                break;

            case R.id.bt_aes:
                startActivity(new Intent(MainActivity.this, AesActivity.class));
                break;

            case R.id.bt_rsa:
                break;

            case R.id.bt_sm2:
                break;

            case R.id.bt_sm2_change:
                break;

            case R.id.bt_sm3:
                break;

            case R.id.bt_sm4:
                break;

            case R.id.bt_base64:
                break;

            case R.id.bt_change_between_system_code:
                break;
        }
    }
}
