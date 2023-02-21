/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Admin
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[ ] nums = {3, 8, 5, 2};
int res = 0;
for(int x: nums) {
  if(x > res) {
    res = x;
  }
}

System.out.println(res);
    }
    
}
