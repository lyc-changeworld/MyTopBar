package com.example.achuan.mytopbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /***********通过引用不同的实例，可以为其添加不同监听的方法（满足模板的需求）**********/
        MyTopbar topbar= (MyTopbar) findViewById(R.id.topbar);//获得一个MyTopbar的实例引用
        /*为自定义的接口中的方法名添加具体的方法*/
        topbar.setOnTopbarClickListener(new MyTopbar.topbarClickListener() {
            public void LeftClick() {
                Toast.makeText(MainActivity.this, "点击左按钮", Toast.LENGTH_SHORT).show();
            }
            public void RightClick() {
                Toast.makeText(MainActivity.this,"点击右按钮",Toast.LENGTH_SHORT).show();
            }
        });
        //让左按钮隐藏
        //topbar.setLeftVisable(false);
        //topbar.setRightVisable(false);
       /* //引入第二个实例，实现不同的监听方法
        MyTopbar topbar1= (MyTopbar) findViewById(R.id.topbar);
        topbar1.setOnTopbarClickListener(new MyTopbar.topbarClickListener() {
            public void LeftClick() {
                Toast.makeText(MainActivity.this, "点击左按钮1", Toast.LENGTH_SHORT).show();
            }
            public void RightClick() {
                Toast.makeText(MainActivity.this,"点击右按钮1",Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
