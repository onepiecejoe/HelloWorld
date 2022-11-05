package com.joe.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExpressControl {
    // 快递集合
    private ArrayList<Express> data = new ArrayList<>();

    /**
     * 存储快递
     *
     * @param e 快递对象
     * @return 返回自动生成的六位取件码
     */
    public void addExpress(Express e) {
        Random random = new Random();
        int code;
        while(true){
            // 随机生成0~899999 + 100000,即100000~999999的数字作为取件码
            code = random.nextInt(900000) + 100000;
            for (int i = 0; i < data.size(); i++) {
                if (code == data.get(i).getExtractionCode()) {
                    continue;
                }
            }
            break;
        }
        // 设置取件码
        e.setExtractionCode(code);
        // 将快递存储到集合中
        data.add(e);
        System.out.println("快递录入成功，取件码为"+ code);
    }

    public Express getExpress(int code) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getExtractionCode() == code) {
                return data.remove(i);
            }
        }
        return null;
    }

    public List<Express> findAll() {
        return data;
    }



}
