package reagodjj.example.com.encryptionalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RsaActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private RadioGroup rgCodeStyle;
    private RadioButton rbUtf8;
    private RadioButton rbGbk;
    private RadioButton rbUnicode;
    private RadioGroup rgInputFormat;
    private RadioButton rbBin;
    private RadioButton rbHex;
    private RadioButton rbStr;
    private RadioButton rbByte;
    private RadioGroup rgKeyLength1;
    private RadioButton rbKeyLength512;
    private RadioButton rbKeyLength768;
    private RadioButton rbKeyLength1024;
    private RadioButton rbKeyLength1152;
    private RadioGroup rgKeyLength2;
    private RadioButton rbKeyLength1280;
    private RadioButton rbKeyLength1976;
    private RadioButton rbKeyLength2048;
    private Button btChooseFile;
    private CheckBox cbInputShow;
    private EditText etInputContent;
    private RadioGroup rgKeyFormat;
    private RadioButton rbKeyBin;
    private RadioButton rbKeyHex;
    private RadioButton rbKeyStr;
    private RadioButton rbKeyByte;
    private Button btChooseKeyFile;
    private EditText etKeyContent;
    private RadioGroup rgOperateMode;
    private RadioButton rbEncryption;
    private RadioButton rbDecrypt;
    private Button btHandler;
    private Button btChangeSystemCode;
    private Button btSaveResult;
    private CheckBox cbOutputShow;
    private EditText etResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsa);

        initView();
    }

    private void initView() {
        rgCodeStyle = findViewById(R.id.rg_code_style);
        rbUtf8 = findViewById(R.id.rb_utf8);
        rbGbk = findViewById(R.id.rb_gbk);
        rbUnicode = findViewById(R.id.rb_unicode);
        rgInputFormat = findViewById(R.id.rg_input_format);
        rbBin = findViewById(R.id.rb_bin);
        rbHex = findViewById(R.id.rb_hex);
        rbStr = findViewById(R.id.rb_str);
        rbByte = findViewById(R.id.rb_byte);
        rgKeyLength1 = findViewById(R.id.rg_key_length_1);
        rbKeyLength512 = findViewById(R.id.rb_key_length_512);
        rbKeyLength768 = findViewById(R.id.rb_key_length_768);
        rbKeyLength1024 = findViewById(R.id.rb_key_length_1024);
        rbKeyLength1152 = findViewById(R.id.rb_key_length_1152);
        rgKeyLength2 = findViewById(R.id.rg_key_length_2);
        rbKeyLength1280 = findViewById(R.id.rb_key_length_1280);
        rbKeyLength1976 = findViewById(R.id.rb_key_length_1976);
        rbKeyLength2048 = findViewById(R.id.rb_key_length_2048);
        btChooseFile = findViewById(R.id.bt_choose_file);
        cbInputShow = findViewById(R.id.cb_input_show);
        etInputContent = findViewById(R.id.et_input_content);
        rgKeyFormat = findViewById(R.id.rg_key_format);
        rbKeyBin = findViewById(R.id.rb_key_bin);
        rbKeyHex = findViewById(R.id.rb_key_hex);
        rbKeyStr = findViewById(R.id.rb_key_str);
        rbKeyByte = findViewById(R.id.rb_key_byte);
        btChooseKeyFile = findViewById(R.id.bt_choose_key_file);
        etKeyContent = findViewById(R.id.et_key_content);
        rgOperateMode = findViewById(R.id.rg_operate_mode);
        rbEncryption = findViewById(R.id.rb_encryption);
        rbDecrypt = findViewById(R.id.rb_decrypt);
        btHandler = findViewById(R.id.bt_handler);
        btChangeSystemCode = findViewById(R.id.bt_change_system_code);
        btSaveResult = findViewById(R.id.bt_save_result);
        cbOutputShow = findViewById(R.id.cb_output_show);
        etResult = findViewById(R.id.et_result);

        rbKeyLength512.setOnCheckedChangeListener(this);
        rbKeyLength768.setOnCheckedChangeListener(this);
        rbKeyLength1024.setOnCheckedChangeListener(this);
        rbKeyLength1152.setOnCheckedChangeListener(this);
        rbKeyLength1280.setOnCheckedChangeListener(this);
        rbKeyLength1976.setOnCheckedChangeListener(this);
        rbKeyLength2048.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rb_key_length_512:
                rgKeyLength2.clearCheck();
                break;

            case R.id.rb_key_length_768:
                rgKeyLength2.clearCheck();
                break;

            case R.id.rb_key_length_1024:
                rgKeyLength2.clearCheck();
                break;

            case R.id.rb_key_length_1152:
                rgKeyLength2.clearCheck();
                break;

            case R.id.rb_key_length_1280:
                rgKeyLength1.clearCheck();
                break;

            case R.id.rb_key_length_1976:
                rgKeyLength1.clearCheck();
                break;

            case R.id.rb_key_length_2048:
                rgKeyLength1.clearCheck();
                break;
        }
    }
}
