/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compuertaslogicas;


/**
 *
 * @author jairo
 */
public class CompuertaLogica <T>{
    private T _in;
    private T _out;
    
    public CompuertaLogica(T _in){
        this._in = _in;
    }
    
    public T getIns (){
        return _in;
    }
    
    public T getOuts(){
        return _out;
    }
    
    public void setIns(T in){
        this._in= in;
    }
}