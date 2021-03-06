package com.tc.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.sdses.bean.PoliceStateListBean;
import com.sdses.tool.UtilTc;
import com.tc.activity.casemain.KcqzMainList;
import com.tc.application.R;

/**
 * @author yangyu
 *	功能描述：自定义TabHost
 */
public class MainTabActivity extends FragmentActivity{	
	//定义FragmentTabHost对象
	private FragmentTabHost mTabHost;
	//定义一个布局
	private LayoutInflater layoutInflater;
		// 0815 你好
	    //再测试一下
    //cengongdd磊寺

	//定义数组来存放Fragment界面
	private Class fragmentArray[] = {PoliceStateActivity.class,testActivity.class,testActivity.class,InfoQueryActivity.class,
			KcqzMainList.class,UserManageActivity.class};
	//定义数组来存放按钮图片
	private int mImageViewArray[] = {R.drawable.tab_home_btn,R.drawable.tab_home_btn,R.drawable.tab_home_btn,R.drawable.tab_message_btn,
									R.drawable.tab_kcqz_btn,R.drawable.tab_user_btn};
	//Tab选项卡的文字
	private String mTextviewArray[] = {"执法取证", "刑事勘查","一图标注","信息查询", "现场笔录","用户中心"};
	public static PoliceStateListBean plb;
	private int tabPage=0;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_layout);
        initView();

        getIntentInfo();
    }
	
	private void getIntentInfo(){
		plb=(PoliceStateListBean) getIntent().getSerializableExtra("jqInfo");
		tabPage=getIntent().getIntExtra("tab", 0);
		if(tabPage!=0){
			mTabHost.setCurrentTab(tabPage);
			UtilTc.showLog(plb.getJqName());
		}
	
	}
	/**
	 * 
	 * 初始化组件
	 */
	private void initView(){
		//实例化布局对象
		layoutInflater = LayoutInflater.from(this);
		//实例化TabHost对象，得到TabHost
		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);	
		//得到fragment的个数
		int count = fragmentArray.length;	
		for(int i = 0; i < count; i++){	
			//为每一个Tab按钮设置图标、文字和内容
			TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
			//将Tab按钮添加进Tab选项卡中
			mTabHost.addTab(tabSpec, fragmentArray[i], null);
			//设置Tab按钮的背景
			mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);
		}
	}
	/**
	 * 给Tab按钮设置图标和文字
	 */
	private View getTabItemView(int index){
		View view = layoutInflater.inflate(R.layout.tab_item_view, null);
		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		imageView.setImageResource(mImageViewArray[index]);
		TextView textView = (TextView) view.findViewById(R.id.textview);		
		textView.setTextColor(view.getResources().getColor(R.color.Black));
		textView.setText(mTextviewArray[index]);
		return view;
	}
}
