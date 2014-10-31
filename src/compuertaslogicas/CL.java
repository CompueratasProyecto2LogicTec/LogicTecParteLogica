/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compuertaslogicas;

import java.io.IOException;

/**
 *
 * @author jairo
 */
public class CL {
    private int _cero=0;
    private int _uno=1;
    
    public CL(){  
    }
    
    
    
    
    public void obtnum (int num){
        System.out.println(num/10);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         //CL cl = new CL();
         Lista l = new Lista();
         l.insertHead(1);
         l.insertHead(0);
         l.insertHead(1);
         
         Conexiones conx = new Conexiones (l);
         conx.compuertas("Xor", l);
         
         //an.ResultAnd(l);
         //l.insertHead(an.ResultAnd(l));
         /*Or o= new Or (l);
         o.ResultOr(l);*/
    }
    
}
