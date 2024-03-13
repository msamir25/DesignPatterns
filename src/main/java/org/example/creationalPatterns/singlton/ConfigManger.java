package org.example.creationalPatterns.singlton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManger {
    private Map<String , Object>setting = new HashMap<>();

    private static ConfigManger instance = new ConfigManger();

    private ConfigManger(){}

    public static ConfigManger getInstance() {
        return instance;
    }

    public void set(String key , Object object){
        setting.put(key, object);
    }

    public Object get(String key){
        return setting.get(key);
    }
}
