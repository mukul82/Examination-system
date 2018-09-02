/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examsystem;

/**
 *
 * @author Lenovo
 */
public class a {
    
 public int x = 0;
 
static int k =0;
static a abc= null;

a(int j){
    x = j;
    k++;
}

  public  static a myinst(int j){
      
      if (k<4)
          abc = new a(j);
      return abc;
}
    
}


class test{

    public static void main(String[] args) {
        
        a obj = a.myinst(1);
        System.out.println(obj.x);
         a obj1 = a.myinst(2);
         
        System.out.println(obj1.x);
          a obj2 = a.myinst(3);
          
        System.out.println(obj2.x);
           a obj3 = a.myinst(4);
           
        System.out.println(obj3.x);
            a obj4 = a.myinst(5);
            
        System.out.println(obj4.x);
             a obj5 = a.myinst(6);

        System.out.println(obj5.x);
    }
    
}