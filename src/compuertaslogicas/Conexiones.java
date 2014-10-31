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
public class Conexiones {
    private Componente _componente;
    private int _entrada;
    private int _salida;
    private int _valor;
    private Lista _lista;
    private int _cero=0;
    private int _uno=1;
    
    public Conexiones(Lista lista){
        this._lista=lista;
                
    }
    

    
    public void compuertas (String _tipo, Lista lista){
        if(_tipo.equals("And"))
            And(lista);
        else if (_tipo.equals("Nand"))
            Nand (lista);
        else if (_tipo.equals("Or"))
            Or (lista);
        else if (_tipo.equals("Nor"))
            Nor (lista);
        else if (_tipo.equals("Xor"))
            Xor (lista);
        else if (_tipo.equals("Xnor"))
            Xnor (lista);
        else if (_tipo.equals("Not"))
            Not (lista);
        else
            Linea(lista);
    }
        
    private int And (Lista lista){
        Nodo tmp = lista.getHead();
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
    
    private int Nand(Lista lista){
        Nodo tmp = lista.getHead();
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
    
    private int Or (Lista lista){
        Nodo tmp = lista.getHead();
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
    private int Nor(Lista lista){
        Nodo tmp = lista.getHead();
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
    
    private int Xor(Lista lista){
        Nodo tmp = lista.getHead().getNext();
        int x= (int)lista.getHead().get_data();
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
    
    private int Xnor(Lista lista){
        Nodo tmp = lista.getHead().getNext();
        int x= (int)lista.getHead().get_data();
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
    
    private int Not (Lista lista){
        if (lista.getHead().get_data().equals(_uno)){
            return _cero;
        }
        else{
            return _uno;
        }
    }
    
    private int Linea (Lista lista){
        if (lista.getHead().get_data().equals(_uno)){
            return _uno;
        }
        else{
            return _cero;
        }
    }
}
