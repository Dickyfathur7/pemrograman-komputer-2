/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tamami
 */
public class BeforeGeneric {
    
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("Data 1");
        String teks = list.get(0);
        System.out.println(teks);
    }
    
}
