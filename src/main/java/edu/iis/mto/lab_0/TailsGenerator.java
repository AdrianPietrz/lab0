package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list = new ArrayList<>();
        String temp =value;
        for(int i=0;i<value.length();i++){
            list.add(temp);
            temp=temp.substring(0,temp.length()-1);
        }
        list.add("");
        return list;
    }

}
