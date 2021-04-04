package com.cmbchina.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KY9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int no, score;
        List<Stu> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            no = in.nextInt();
            score = in.nextInt();
            list.add(new Stu(no, score));
        }
        Collections.sort(list, ((o1, o2) -> {
            if (o1.score != o2.score) return o1.score - o2.score;
            return o1.no - o2.no;
        }));
        for(Stu s: list){
            System.out.println(s.no+" "+s.score);
        }
    }

    public static class Stu {
        int no;
        int score;

        public Stu(int no, int score) {
            this.no = no;
            this.score = score;
        }
    }
}
