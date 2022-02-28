package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list = new ArrayList<>();
        String temp =value;
        for(int i=0;i<value.length();i++){
            list.add(temp);
            temp=value.substring(i+1,value.length());
        }
        list.add("");
        return list;
    }

}
