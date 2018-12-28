package reagodjj.example.com.encryptionalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AesActivity extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {
    private RadioGroup rgWorkMode1;
    private RadioButton rbEcb;
    private RadioButton rbCbc;
    private RadioButton rbCfb;
    private RadioGroup rgWorkMode2;
    private RadioButton rbOfb;
    private RadioButton rbCtr;
    private RadioGroup rgCodeStyle;
    private RadioButton rbUtf8;
    private RadioButton rbGbk;
    private RadioButton rbUnicode;
    private RadioGroup rgInputFormat;
    private RadioButton rbBin;
    private RadioButton rbHex;
    private RadioButton rbStr;
    private RadioButton rbByte;
    private EditText etInputContent;
    private RadioGroup rgKeyFormat;
    private RadioButton rbKeyBin;
    private RadioButton rbKeyHex;
    private RadioButton rbKeyStr;
    private RadioButton rbKeyByte;
    private RadioGroup rgKeyLength;
    private RadioButton rbKey128;
    private RadioButton rbKey192;
    private RadioButton rbKey256;
    private EditText etKeyContent;
    private RadioGroup rgVectorFormat;
    private RadioButton rbVectorBin;
    private RadioButton rbVectorHex;
    private EditText etInitVector;
    private RadioGroup rgOperateMode;
    private RadioButton rbEncryption;
    private RadioButton rbDecrypt;
    private Button btHandler;
    private Button btChangeSystemCode;
    private EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aes);

        initView();
    }

    private void initView() {
        rgWorkMode1 = findViewById(R.id.rg_work_mode_1);
        rbEcb = findViewById(R.id.rb_ecb);
        rbCbc = findViewById(R.id.rb_cbc);
        rbCfb = findViewById(R.id.rb_cfb);
        rgWorkMode2 = findViewById(R.id.rg_work_mode_2);
        rbOfb = findViewById(R.id.rb_ofb);
        rbCtr = findViewById(R.id.rb_ctr);
        rgCodeStyle = findViewById(R.id.rg_code_style);
        rbUtf8 = findViewById(R.id.rb_utf8);
        rbGbk = findViewById(R.id.rb_gbk);
        rbUnicode = findViewById(R.id.rb_unicode);
        rgInputFormat = findViewById(R.id.rg_input_format);
        rbBin = findViewById(R.id.rb_bin);
        rbHex = findViewById(R.id.rb_hex);
        rbStr = findViewById(R.id.rb_str);
        rbByte = findViewById(R.id.rb_byte);
        etInputContent = findViewById(R.id.et_input_content);
        rgKeyFormat = findViewById(R.id.rg_key_format);
        rbKeyBin = findViewById(R.id.rb_key_bin);
        rbKeyHex = findViewById(R.id.rb_key_hex);
        rbKeyStr = findViewById(R.id.rb_key_str);
        rbKeyByte = findViewById(R.id.rb_key_byte);
        rgKeyLength = findViewById(R.id.rg_key_length);
        rbKey128 = findViewById(R.id.rb_key_128);
        rbKey192 = findViewById(R.id.rb_key_192);
        rbKey256 = findViewById(R.id.rb_key_256);
        etKeyContent = findViewById(R.id.et_key_content);
        rgVectorFormat = findViewById(R.id.rg_vector_format);
        rbVectorBin = findViewById(R.id.rb_vector_bin);
        rbVectorHex = findViewById(R.id.rb_vector_hex);
        etInitVector = findViewById(R.id.et_init_vector);
        rgOperateMode = findViewById(R.id.rg_operate_mode);
        rbEncryption = findViewById(R.id.rb_encryption);
        rbDecrypt = findViewById(R.id.rb_decrypt);
        btHandler = findViewById(R.id.bt_handler);
        btChangeSystemCode = findViewById(R.id.bt_change_system_code);
        etResult = findViewById(R.id.et_result);

        rbEcb.setOnCheckedChangeListener(this);
        rbCbc.setOnCheckedChangeListener(this);
        rbCfb.setOnCheckedChangeListener(this);
        rbOfb.setOnCheckedChangeListener(this);
        rbCtr.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rb_ecb:
                rgWorkMode2.clearCheck();
                break;

            case R.id.rb_cbc:
                rgWorkMode2.clearCheck();
                break;

            case R.id.rb_cfb:
                rgWorkMode2.clearCheck();
                break;

            case R.id.rb_ofb:
                rgWorkMode1.clearCheck();
                break;

            case R.id.rb_ctr:
                rgWorkMode1.clearCheck();
                break;

            default:
                break;
        }
    }
}
