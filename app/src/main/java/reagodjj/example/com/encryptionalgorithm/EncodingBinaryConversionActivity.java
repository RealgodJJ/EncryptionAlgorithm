package reagodjj.example.com.encryptionalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EncodingBinaryConversionActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private RadioGroup rgFileCode;
    private RadioButton rbUtf8;
    private RadioButton rbGbk;
    private RadioButton rbUnicode;
    private RadioGroup rgInputFormat1;
    private RadioButton rbUnicodeBin;
    private RadioButton rbUtf8Bin;
    private RadioGroup rgInputFormat2;
    private RadioButton rbGbkBin;
    private RadioButton rbUnicodeHex;
    private RadioButton rbUtf8Hex;
    private RadioGroup rgInputFormat3;
    private RadioButton rbGbkHex;
    private RadioButton rbStr;
    private RadioButton rbUnicodeByte;
    private RadioButton rbUtf8Byte;
    private RadioGroup rgInputFormat4;
    private RadioButton rbGbkByte;
    private RadioButton rbUnicodeBase64;
    private RadioButton rbUft8Base64;
    private RadioGroup rgInputFormat5;
    private RadioButton rbGbkBase64;
    private Button btChooseFile;
    private CheckBox cbInputShow;
    private EditText etIdA;
    private RadioGroup rgOutputFormat1;
    private RadioButton rbTargetUnicodeBin;
    private RadioButton rbTargetUtf8Bin;
    private RadioGroup rgOutputFormat2;
    private RadioButton rbTargetGbkBin;
    private RadioButton rbTargetUnicodeHex;
    private RadioButton rbTargetUtf8Hex;
    private RadioGroup rgOutputFormat3;
    private RadioButton rbTargetGbkHex;
    private RadioButton rbTargetStr;
    private RadioButton rbTargetUnicodeByte;
    private RadioButton rbTargetUtf8Byte;
    private RadioGroup rgOutputFormat4;
    private RadioButton rbTargetGbkByte;
    private RadioButton rbTargetUnicodeBase64;
    private RadioButton rbTargetUft8Base64;
    private RadioGroup rgOutputFormat5;
    private RadioButton rbTargetGbkBase64;
    private Button btSaveResult;
    private CheckBox cbOutputShow;
    private EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoding_binary_conversion);

        initView();
    }

    private void initView() {
        rgFileCode = findViewById(R.id.rg_file_code);
        rbUtf8 = findViewById(R.id.rb_utf8);
        rbGbk = findViewById(R.id.rb_gbk);
        rbUnicode = findViewById(R.id.rb_unicode);
        rgInputFormat1 = findViewById(R.id.rg_input_format_1);
        rbUnicodeBin = findViewById(R.id.rb_unicode_bin);
        rbUtf8Bin = findViewById(R.id.rb_utf8_bin);
        rgInputFormat2 = findViewById(R.id.rg_input_format_2);
        rbGbkBin = findViewById(R.id.rb_gbk_bin);
        rbUnicodeHex = findViewById(R.id.rb_unicode_hex);
        rbUtf8Hex = findViewById(R.id.rb_utf8_hex);
        rgInputFormat3 = findViewById(R.id.rg_input_format_3);
        rbGbkHex = findViewById(R.id.rb_gbk_hex);
        rbStr = findViewById(R.id.rb_str);
        rbUnicodeByte = findViewById(R.id.rb_unicode_byte);
        rbUtf8Byte = findViewById(R.id.rb_utf8_byte);
        rgInputFormat4 = findViewById(R.id.rg_input_format_4);
        rbGbkByte = findViewById(R.id.rb_gbk_byte);
        rbUnicodeBase64 = findViewById(R.id.rb_unicode_base64);
        rbUft8Base64 = findViewById(R.id.rb_uft8_base64);
        rgInputFormat5 = findViewById(R.id.rg_input_format_5);
        rbGbkBase64 = findViewById(R.id.rb_gbk_base64);
        btChooseFile = findViewById(R.id.bt_choose_file);
        cbInputShow = findViewById(R.id.cb_input_show);
        etIdA = findViewById(R.id.et_id_a);
        rgOutputFormat1 = findViewById(R.id.rg_output_format_1);
        rbTargetUnicodeBin = findViewById(R.id.rb_target_unicode_bin);
        rbTargetUtf8Bin = findViewById(R.id.rb_target_utf8_bin);
        rgOutputFormat2 = findViewById(R.id.rg_output_format_2);
        rbTargetGbkBin = findViewById(R.id.rb_target_gbk_bin);
        rbTargetUnicodeHex = findViewById(R.id.rb_target_unicode_hex);
        rbTargetUtf8Hex = findViewById(R.id.rb_target_utf8_hex);
        rgOutputFormat3 = findViewById(R.id.rg_output_format_3);
        rbTargetGbkHex = findViewById(R.id.rb_target_gbk_hex);
        rbTargetStr = findViewById(R.id.rb_target_str);
        rbTargetUnicodeByte = findViewById(R.id.rb_target_unicode_byte);
        rbTargetUtf8Byte = findViewById(R.id.rb_target_utf8_byte);
        rgOutputFormat4 = findViewById(R.id.rg_output_format_4);
        rbTargetGbkByte = findViewById(R.id.rb_target_gbk_byte);
        rbTargetUnicodeBase64 = findViewById(R.id.rb_target_unicode_base64);
        rbTargetUft8Base64 = findViewById(R.id.rb_target_uft8_base64);
        rgOutputFormat5 = findViewById(R.id.rg_output_format_5);
        rbTargetGbkBase64 = findViewById(R.id.rb_target_gbk_base64);
        btSaveResult = findViewById(R.id.bt_save_result);
        cbOutputShow = findViewById(R.id.cb_output_show);
        etResult = findViewById(R.id.et_result);

        rbUtf8.setOnCheckedChangeListener(this);
        rbGbk.setOnCheckedChangeListener(this);
        rbUnicode.setOnCheckedChangeListener(this);

        rbUnicodeBin.setOnCheckedChangeListener(this);
        rbUtf8Bin.setOnCheckedChangeListener(this);
        rbGbkBin.setOnCheckedChangeListener(this);
        rbUnicodeHex.setOnCheckedChangeListener(this);
        rbUtf8Hex.setOnCheckedChangeListener(this);
        rbGbkHex.setOnCheckedChangeListener(this);
        rbStr.setOnCheckedChangeListener(this);
        rbUnicodeByte.setOnCheckedChangeListener(this);
        rbUtf8Byte.setOnCheckedChangeListener(this);
        rbGbkByte.setOnCheckedChangeListener(this);
        rbUnicodeBase64.setOnCheckedChangeListener(this);
        rbUft8Base64.setOnCheckedChangeListener(this);
        rbGbkBase64.setOnCheckedChangeListener(this);

        rbTargetUnicodeBin.setOnCheckedChangeListener(this);
        rbTargetUtf8Bin.setOnCheckedChangeListener(this);
        rbTargetGbkBin.setOnCheckedChangeListener(this);
        rbTargetUnicodeHex.setOnCheckedChangeListener(this);
        rbTargetUtf8Hex.setOnCheckedChangeListener(this);
        rbTargetGbkHex.setOnCheckedChangeListener(this);
        rbTargetStr.setOnCheckedChangeListener(this);
        rbTargetUnicodeByte.setOnCheckedChangeListener(this);
        rbTargetUtf8Byte.setOnCheckedChangeListener(this);
        rbTargetGbkByte.setOnCheckedChangeListener(this);
        rbTargetUnicodeBase64.setOnCheckedChangeListener(this);
        rbTargetUft8Base64.setOnCheckedChangeListener(this);
        rbTargetGbkBase64.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rb_unicode_bin:
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_utf8_bin:
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_gbk_bin:
                rgInputFormat1.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_unicode_hex:
                rgInputFormat1.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_utf8_hex:
                rgInputFormat1.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_gbk_hex:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_str:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_unicode_byte:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_utf8_byte:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat4.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_gbk_byte:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_unicode_base64:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat5.clearCheck();
                break;

            case R.id.rb_uft8_base64:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                break;

            case R.id.rb_gbk_base64:
                rgInputFormat1.clearCheck();
                rgInputFormat2.clearCheck();
                rgInputFormat3.clearCheck();
                rgInputFormat4.clearCheck();
                break;


            case R.id.rb_target_unicode_bin:
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_utf8_bin:
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_gbk_bin:
                rgOutputFormat1.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_unicode_hex:
                rgOutputFormat1.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_utf8_hex:
                rgOutputFormat1.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_gbk_hex:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_str:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_unicode_byte:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_utf8_byte:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat4.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_gbk_byte:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_unicode_base64:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_uft8_base64:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat5.clearCheck();
                break;

            case R.id.rb_target_gbk_base64:
                rgOutputFormat1.clearCheck();
                rgOutputFormat2.clearCheck();
                rgOutputFormat3.clearCheck();
                rgOutputFormat4.clearCheck();
                break;
        }
    }
}
