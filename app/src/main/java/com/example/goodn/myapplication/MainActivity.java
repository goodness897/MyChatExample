package com.example.goodn.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvChat;

    private List<MessageModel> listMessage;

    private ChatListAdapter chatListAdapter;

    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvChat = (ListView) findViewById(R.id.lv_chat);
        etMessage = (EditText) findViewById(R.id.et_message);
        Button btnSend = (Button) findViewById(R.id.btn_send);
        listMessage = new ArrayList<>();
        listMessage.add(new MessageModel("하이", true));
        listMessage.add(new MessageModel("방가방가", false));

        chatListAdapter = new ChatListAdapter(this, listMessage);
        lvChat.setAdapter(chatListAdapter);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listMessage.add(new MessageModel(etMessage.getText().toString(), true));
                etMessage.setText("");
                chatListAdapter.notifyDataSetChanged();
            }
        });
    }
}
