package com.cmbchina.nowcoder;

import java.util.*;

public class KY215 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String name;
        int age, score;
        List<Stu> list = new ArrayList();
        for(int i = 0; i < n; i++){
                name = in.next();
                age = in.nextInt();
                score = in.nextInt();
                list.add(new Stu(name, age,score));
        }
        // 排序
        Collections.sort(list, (o1, o2) -> {
            if(o1.score != o2.score) return o1.score - o2.score;
            else if(!o1.name.equals(o2.name)) return o1.name.compareTo(o2.name);
            else return o1.age - o2.age;
        });

        // 输出
        for(Stu s: list){
            System.out.println(s.name+" "+s.age +" "+s.score);
        }
    }
    public static class Stu{
        String name;
        int age;
        int score;

        public Stu(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }
    }
}


