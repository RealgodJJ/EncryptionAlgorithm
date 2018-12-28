package reagodjj.example.com.encryptionalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Base64Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private RadioGroup rgCodeStyle;
    private RadioButton rbUtf8;
    private RadioButton rbGbk;
    private RadioButton rbUnicode;
    private RadioGroup rgInputFormat;
    private RadioButton rbBin;
    private RadioButton rbHex;
    private RadioButton rbStr;
    private RadioButton rbByte;
    private Button btChooseFile;
    private CheckBox cbInputShow;
    private EditText etIdA;
    private RadioGroup rgOperateMode;
    private RadioButton rbEncryption;
    private RadioButton rbDecrypt;
    private RadioGroup rgHandlerMode1;
    private RadioButton rbDefault;
    private RadioButton rbNoPadding;
    private RadioGroup rgHandlerMode2;
    private RadioButton rbNoWrap;
    private RadioButton rbUrlSafe;
    private RadioButton rbCrlf;
    private Button btHandler;
    private Button btChangeSystemCode;
    private Button btSaveResult;
    private CheckBox cbOutputShow;
    private EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base64);

        initView();
    }

    private void initView() {
        rgCodeStyle = findViewById(R.id.rg_file_code);
        rbUtf8 = findViewById(R.id.rb_utf8);
        rbGbk = findViewById(R.id.rb_gbk);
        rbUnicode = findViewById(R.id.rb_unicode);
        rgInputFormat = findViewById(R.id.rg_input_format);
        rbBin = findViewById(R.id.rb_bin);
        rbHex = findViewById(R.id.rb_hex);
        rbStr = findViewById(R.id.rb_str);
        rbByte = findViewById(R.id.rb_byte);
        btChooseFile = findViewById(R.id.bt_choose_file);
        cbInputShow = findViewById(R.id.cb_input_show);
        etIdA = findViewById(R.id.et_id_a);
        rgOperateMode = findViewById(R.id.rg_operate_mode);
        rbEncryption = findViewById(R.id.rb_encryption);
        rbDecrypt = findViewById(R.id.rb_decrypt);
        rgHandlerMode1 = findViewById(R.id.rg_handler_mode_1);
        rbDefault = findViewById(R.id.rb_default);
        rbNoPadding = findViewById(R.id.rb_no_padding);
        rgHandlerMode2 = findViewById(R.id.rg_handler_mode_2);
        rbNoWrap = findViewById(R.id.rb_no_wrap);
        rbUrlSafe = findViewById(R.id.rb_url_safe);
        rbCrlf = findViewById(R.id.rb_crlf);
        btHandler = findViewById(R.id.bt_handler);
        btChangeSystemCode = findViewById(R.id.bt_change_system_code);
        btSaveResult = findViewById(R.id.bt_save_result);
        cbOutputShow = findViewById(R.id.cb_output_show);
        etResult = findViewById(R.id.et_result);

        rbUtf8.setOnCheckedChangeListener(this);
        rbGbk.setOnCheckedChangeListener(this);
        rbUnicode.setOnCheckedChangeListener(this);
        rbBin.setOnCheckedChangeListener(this);
        rbHex.setOnCheckedChangeListener(this);
        rbStr.setOnCheckedChangeListener(this);
        rbByte.setOnCheckedChangeListener(this);
        rbDefault.setOnCheckedChangeListener(this);
        rbNoPadding.setOnCheckedChangeListener(this);
        rbNoWrap.setOnCheckedChangeListener(this);
        rbUrlSafe.setOnCheckedChangeListener(this);
        rbCrlf.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rb_utf8:
                break;

            case R.id.rb_gbk:
                break;

            case R.id.rb_unicode:
                break;

            case R.id.rb_default:
                rgHandlerMode2.clearCheck();
                break;

            case R.id.rb_no_padding:
                rgHandlerMode2.clearCheck();
                break;

            case R.id.rb_no_wrap:
                rgHandlerMode1.clearCheck();
                break;

            case R.id.rb_url_safe:
                rgHandlerMode1.clearCheck();
                break;

            case R.id.rb_crlf:
                rgHandlerMode1.clearCheck();
                break;
        }
    }
}
