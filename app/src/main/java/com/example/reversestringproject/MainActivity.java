package com.example.reversestringproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    private TextView outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);

        Button reverseButton = findViewById(R.id.reverse_button);
        reverseButton.setOnClickListener(v -> {
            String input = inputText.getText().toString();
            String output = reverseString(input);
            outputText.setText(output);
        });
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

//    private String reverseString(String str) {
//        char[] arr = str.toCharArray();
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        return new String(arr);
//    }
}