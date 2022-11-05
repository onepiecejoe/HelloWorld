package com.joe.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,Employee> staff = new HashMap<>(3);
        // 添加元素
        staff.put("144-25-6464", new Employee("Amy Lee", 30));
        staff.put("144-25-6465", new Employee("Harry Hacker", 28));
        staff.put("144-25-6466", new Employee("Gary Copper", 24));
        staff.put("144-25-6467", new Employee("Francesca Cruz", 26));

        System.out.println(staff);

        // 删除元素
        staff.remove("144-25-6465");
        System.out.println(staff);

        // 替换元素
        Employee tmp = staff.put("144-25-6467", new Employee("Francesca Miller", 26));
        System.out.println("被替换的对象是：" + tmp);
        System.out.println("更新后的映射为:" + staff);

        // 查找元素
        System.out.println(staff.get("144-25-6464").getName());
        System.out.println(staff.get("144-25-0000"));
        System.out.println(staff.getOrDefault("144-25-0001", new Employee("无名", 999)));

        // 遍历元素
        staff.forEach((k,v) -> System.out.println("key:" + k + ",value:" + v));

        // 查找键是否存在
        System.out.println(staff.containsKey("00001"));

        //
        System.out.println(staff.containsValue(1));

    }
}
