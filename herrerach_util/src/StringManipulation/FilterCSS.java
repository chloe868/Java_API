/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

/**
 *
 * @author herrerach_sd2082
 */
public class FilterCSS {
    public String removeCSS(String str){
        str = str.replaceAll("class=\\,\\style.${}+?#&*", "");
        return str;
    }
}
