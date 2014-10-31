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
public class CompuertasLogicas {
    
    private String _tipo;
    private Lista _lista;
    private int _cero=0;
    private int _uno=1;

    public CompuertasLogicas(String _tipo, Lista _lista) {
        this._tipo=_tipo;
        this._lista=_lista;
    }
    
       
    public void compuertas (String _tipo, Lista _lista){
        if(_tipo.equals("And"))
            And(_lista);
        else if (_tipo.equals("Nand"))
            Nand (_lista);
        else if (_tipo.equals("Or"))
            Or (_lista);
        else if (_tipo.equals("Nor"))
            Nor (_lista);
        else if (_tipo.equals("Xor"))
            Xor (_lista);
        else if (_tipo.equals("Xnor"))
            Xnor (_lista);
        else if (_tipo.equals("Not"))
            Not (_lista);
        else
            Linea(_lista);
    }
        
    private int And (Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_uno;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_uno))
                tmp=tmp.getNext();
            else{
                x=_cero;
                break;}
        }
        return x;
    }
    
    private int Nand(Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_cero;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_uno))
                tmp=tmp.getNext();
            else{
                x=_uno;
                break;}
        }
        return x;
    }
    
    private int Or (Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_cero;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_cero))
                tmp=tmp.getNext();
            else{
                x=_uno;
                break;}
        }
        return x;
    }
    
    private int Nor(Lista _lista){
        Nodo tmp = _lista.getHead();
        int x=_uno;
        while (!(tmp==null)){            
            if (tmp.get_data().equals(_cero))
                tmp=tmp.getNext();
            else{
                x=_cero;
                break;}
        }
        System.out.print(x);
        return x;
    }
    
    private int Xor(Lista _lista){
        Nodo tmp = _lista.getHead().getNext();
        int x= (int)_lista.getHead().get_data();
        while(tmp!=null){
            if (tmp.get_data().equals(x)){
                x=_cero;
                tmp=tmp.getNext();
            }
            else{
                x=_uno;
                tmp=tmp.getNext();                
            }
        }
        return x;
    }
    
    private int Xnor(Lista _lista){
        Nodo tmp = _lista.getHead().getNext();
        int x= (int)_lista.getHead().get_data();
        while(tmp!=null){
            if (tmp.get_data().equals(x)){
                x=_uno;
                tmp=tmp.getNext();
            }
            else{
                x=_cero;
                tmp=tmp.getNext();                
            }
        }
        return x;
    }
    
    private int Not (Lista _lista){
        if (_lista.getHead().get_data().equals(_uno)){
            return _cero;
        }
        else{
            return _uno;
        }
    }
    
    private int Linea (Lista _lista){
        if (_lista.getHead().get_data().equals(_uno)){
            return _uno;
        }
        else{
            return _cero;
        }
    }    
}
