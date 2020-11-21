package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.xc, R.drawable.hlg, R.drawable.rsg,
            R.drawable.csz, R.drawable.mht, R.drawable.ly,R.drawable.sjg,R.drawable.sl};
    private static String[] nameArray = { "血橙", "火龙果", "人参果", "脆柿子", "猕猴桃", "龙眼", "释迦果","石榴"};
    private static String[] descArray = {
            "新鲜血橙9斤水果应季整箱红心橙手剥橙子现摘超甜雪橙当季10",
            "越南火龙果5斤新鲜当季水果整箱金都一号红心大果红肉白10包邮",
            "云南石林人参果10斤大果新鲜水果黄肉特级人生果圆果叁整箱5包邮",
            "脆柿子水果新鲜5斤当季整箱包邮应季现摘大果甜柿火晶黄硬柿子10",
            "四川黄心猕猴桃5斤新鲜奇异果水果应当季包邮整箱大果狝泥弥猴桃",
            "甘福园 泰国进口龙眼5斤新鲜当季水果大桂圆应季采摘整箱批发包邮",
            "现摘牛奶凤梨释迦果5斤应当季新鲜水果番荔枝佛头果整箱包邮10",
            "突尼斯软籽石榴水果新鲜10斤包邮无籽应季特大果会理甜红石榴一级"


    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
