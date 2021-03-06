package com.sdses.tool;

import java.util.ArrayList;
import java.util.List;

import android.os.Environment;

import com.sdses.bean.PoliceStateListBean;

public class Values {
	public static String policeType="mj"; //默认民警
    public final static int ERROR_CONNECT=0x04;
    public static String POLICE_GOTIME="";  //确认出警时间
    public static String POLICE_ARRIVETIME="";//警察到达时间
    public static String DB_JQINFO="dbJqInfo";//dbjq
    public static String LS_JQINFO="lsJqInfo";//警察到达时间
    public static int JQ_STATESBTN=1;//1 实时 2待办 3历史
    public static String USERNAME="";
    //路径名称
    public static String SDPATH=Environment.getExternalStorageDirectory().getAbsolutePath();
    public static String ALLFILES=SDPATH+"/TC/";
    public static String PATH_PHOTO=SDPATH+"/TC/wphoto/";
    public static String PATH_RECORD=SDPATH+"/TC/wrecord/";
    public static String PATH_CAMERA=SDPATH+"/TC/wcamera/";
    public static String PATH_BOOKMARK=SDPATH+"/TC/wtxt/";
    //dbjq
    public static List<PoliceStateListBean>dbjqList=new ArrayList<PoliceStateListBean>();
    public static PoliceStateListBean dbjq=new PoliceStateListBean();
    //lsjq
    public static List<PoliceStateListBean>lsjqList=new ArrayList<PoliceStateListBean>();
    public static PoliceStateListBean lsjq=new PoliceStateListBean();
    //警情信息
    public final static int SUCCESS_SSJQ=0x05;
    public final static int ERROR_NOUSER=0x06;
    public final static int ERROR_OTHER=0x07;
    //确认出警
    public final static int SUCCESS_POLICEGO=0x08;
    //上传信息改变状态
    public final static int SUCCESS_RECORDUPLOAD=0x09;
    
    //ftp 上传文件
    public final static int SUCCESS_UPLOAD=0x10;
    public final static int START_UPLOAD=0x11;
    public final static int ERROR_UPLOAD=0x12;

	public static String idSerialName = "/dev/ttyMT1";
	public static   int  idBaudrate = 115200;
	public static   int  idPort = 0;

    //服务器返回信息正常
    public final static int SUCCESS_FORRESULR=0x13;
    //服务器返回空值
    public final static int ERROR_NULLVALUEFROMSERVER=0x14;
    public final static int ERROR_GETIMAGETZ=0x15;
    public final static int ERROR_GETIMAGBD=0x16;
    public final static int SUCCESS_GETIMAGETZ=0x17;
    public final static int SUCCESS_GETIMAGEBD=0x18;

    public final static int ERROR_SHOOTPHOTO=0x19;
    public final static int ERROR_FACENOFOUND=0x20;
    //获取人脸图片
    public final static int SUCCESS_GETFACEIMAGE=0x21;
    public final static int ERROR_GETFACEIMAGE=0x22;

}
