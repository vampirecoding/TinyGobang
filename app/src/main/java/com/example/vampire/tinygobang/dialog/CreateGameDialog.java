package com.example.vampire.tinygobang.dialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.vampire.tinygobang.R;
import com.example.vampire.tinygobang.wifiConnect.Host;

/**
 * Created by X on 2016/4/23 0023.
 * 启动创建游戏的对话框的类
 */
public class CreateGameDialog {

    private static Button btnStartGame,btnCancelConnection;
    public static AlertDialog dialog;
    public static Window window;

    public static void init(Context context){
        dialog=new AlertDialog.Builder(context).create();
        dialog.setCancelable(false);
        dialog.show();
        window=dialog.getWindow();
        window.setContentView(R.layout.dialog_create_game);

        btnStartGame= (Button) window.findViewById(R.id.btnStartGame);
        btnCancelConnection= (Button) window.findViewById(R.id.btnCancelConnection);
        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                ConnectModeDialog.dialog.dismiss();
            }
        });
        btnCancelConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectModeDialog.isCreateGameBtnClicked=false;
                dialog.dismiss();
                Host.isFistConnection=true;
            }
        });
    }


}
