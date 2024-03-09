package org.example.proxy;

import java.util.Arrays;
import java.util.List;

public class Executer {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("twitter" , "youtube" , "facebook" , "LinkedIn" , "Instagram");

        InternetServiceProvider isp = new InternetProxy();

        for (String site : sites){
            System.out.println(isp.serverSite(site));
        }

    }
}
