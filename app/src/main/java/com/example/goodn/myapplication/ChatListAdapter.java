package com.example.goodn.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by goodn on 2017-06-12.
 */


public class ChatListAdapter extends BaseAdapter {

    private Context context;

    private List<MessageModel> messagesItems;

    public ChatListAdapter(Context context, List<MessageModel> messagesItems) {
        this.context = context;
        this.messagesItems = messagesItems;
    }

    @Override
    public int getCount() {
        return messagesItems.size();
    }

    @Override
    public MessageModel getItem(int position) {
        return messagesItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MessageModel message = messagesItems.get(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        // 본인 / 상대방 유무에 따라 뷰 Change
        if (messagesItems.get(position).isChatType()) {
            convertView = mInflater.inflate(R.layout.layout_chat_item_me, null);
        } else {
            convertView = mInflater.inflate(R.layout.layout_chat_item_you, null);
        }
        TextView tvChat = (TextView) convertView.findViewById(R.id.tv_chat);
        tvChat.setText(message.getMessage());

        return convertView;
    }
}