package com.cmbchina.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = in.next();
        String password = in.next();
        final String text = "admin";
        if(username.equals(text) && password.equals(text))
            System.out.println("Login Success!");
        else
            System.out.println("Login Fail!");
    }


}
