package org.example.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{

    private List<String> blockedSites = Arrays.asList("twitter" , "youtube" , "facebook");

    @Override
    public String serverSite(String url) {
        if (blockedSites.contains(url)){
            return "this website is blocked";
        }
            return new Vodafone().serverSite(url);
    }
}
