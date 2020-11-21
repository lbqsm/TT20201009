package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "血橙", "火龙果", "人参果", "脆柿子", "猕猴桃", "龙眼", "释迦果","石榴"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "新鲜血橙9斤水果应季整箱红心橙手剥橙子现摘超甜雪橙当季10",
            "越南火龙果5斤新鲜当季水果整箱金都一号红心大果红肉白10包邮",
            "云南石林人参果10斤大果新鲜水果黄肉特级人生果圆果叁整箱5包邮",
            "脆柿子水果新鲜5斤当季整箱包邮应季现摘大果甜柿火晶黄硬柿子10",
            "四川黄心猕猴桃5斤新鲜奇异果水果应当季包邮整箱大果狝泥弥猴桃",
            "甘福园 泰国进口龙眼5斤新鲜当季水果大桂圆应季采摘整箱批发包邮",
            "现摘牛奶凤梨释迦果5斤应当季新鲜水果番荔枝佛头果整箱包邮10",
            "突尼斯软籽石榴水果新鲜10斤包邮无籽应季特大果会理甜红石榴一级"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {18,27,19,29,19,20,15,10};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.xc_f, R.drawable.hlg_f, R.drawable.rsg_f,
            R.drawable.csz_f, R.drawable.mht_f, R.drawable.ly_f,
            R.drawable.sjg_f,R.drawable.sl_f
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.xc, R.drawable.hlg, R.drawable.rsg,
            R.drawable.csz, R.drawable.mht, R.drawable.ly,
            R.drawable.sjg,R.drawable.sl
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
