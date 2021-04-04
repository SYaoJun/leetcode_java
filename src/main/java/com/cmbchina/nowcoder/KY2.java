package com.cmbchina.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KY2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, score, status;
        String name;
        while(in.hasNext()){
            n = in.nextInt();
            status = in.nextInt();
            List<Stu> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                name = in.next();
                score = in.nextInt();
                list.add(new Stu(name, score,i));
            }
            if(status == 0){
                Collections.sort(list, ((o1, o2) -> {
                    if(o1.score != o2.score) return o2.score-o1.score;
                    else return o1.index - o2.index;
                }));
            }else if(status==1){
                Collections.sort(list, ((o1, o2) -> {
                    if(o1.score != o2.score) return o1.score-o2.score;
                    else return o1.index - o2.index;
                }));
            }
            //输出结果
            for(Stu s: list){
                System.out.println(s.name+" "+s.score);
            }
        }

    }
    public static class Stu{
        String name;
        int score;
        int index;

        public Stu(String name, int age, int index) {
            this.name = name;
            this.score = age;
            this.index = index;
        }
    }
}
