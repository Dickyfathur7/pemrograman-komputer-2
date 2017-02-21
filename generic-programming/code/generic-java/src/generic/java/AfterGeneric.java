package generic.java;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamami
 */
public class AfterGeneric {
    
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Data 1");
        String teks = list.get(0);
        System.out.println(teks);
    }
    
}
