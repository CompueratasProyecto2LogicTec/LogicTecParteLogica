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
public class Lista <T>{
    private Nodo _head;
    private Nodo _tail;
       
    public Lista() throws IOException{
        this._head=null;
        this._tail=null;
    }
    //insertar elementos
    public void insertHead(T pData){
       if(_head==null){
            _head =_tail= new Nodo(pData);
        }
        else{
            Nodo tmp = new Nodo(pData);
            tmp.setNext(_head);
            _head.setAnterior(tmp);
            _head=tmp;
        }
    }    
    //Se encarga de buscar un elemento de listas anidadas.
    public boolean buscar(String pData){
        Nodo tmp;
        Nodo cont = _head;
        while(cont!=null){
            tmp = ((Lista)cont.get_data())._head;
            if(pData.substring(0,1).equals(((String)tmp.get_data()).substring(0,1))){
                while(tmp!=null){
                   if(pData.equals((String)tmp.get_data())){
                       return true;
                   }
                   tmp=tmp.getNext();
                }
            }
           cont=cont.getNext();
        }
        return false;
    }
    //Borra un elemento de la lista.
    public void delete(T obs){ 
        boolean estado;
        estado= false;
        Nodo tmp = _head;
        
        if(_head == _tail){
               _head = _tail = null;
               estado= true;
        } 
        
        if(_head.get_data().equals(obs)){
            Nodo tmp2= _head;
            _head=_head.getNext();
            tmp2.setNext(null);
            _head.setAnterior(null);
            estado=true;
        }
        if(_tail.get_data().equals(obs)&& estado==false){
               Nodo tmp2 = _tail;
               _tail= tmp2.getAnterior();
               tmp2.setAnterior(null);
               _tail.setNext(null);
               estado=true;
        }
                
        if (estado == false){
            while(tmp != null){
                if(tmp.get_data().equals(obs)){
                    tmp.getNext().setAnterior(tmp.getAnterior());
                    tmp.getAnterior().setNext(tmp.getNext());
                    tmp.setAnterior(null);
                    tmp.setNext(null);
                    tmp = null;
                }
                else{
                    tmp=tmp.getNext();
                }
            }
        }
    }
    //Obtiene el dato de un elemento de la lista.
    public T getData(Nodo tmp){
        return (T) (tmp.get_data());
    }
    //Modifica el dato de un elemento de la lista.
    public void setData(Nodo tmp,T pdata){
        tmp.set_data(pdata);
    }
    //Obtiene el siguente elemento del que se esta localizado.
    public Nodo listaGetNext(Nodo tmp){
        tmp=tmp.getNext();
        return tmp;
    }
    //Devuelve la "cabeza".
    public Nodo getHead(){
        return _head;
    }
    public int getLength(){
        int tam=0;
        Nodo tmp=_head;
        while (tmp!=null){
            tam++;
            tmp=tmp.getNext();
        }
        return tam;       
    }
    //Busca una palabra de la lista para compararla.
    public boolean buscarSimple(String pdata){
        Nodo tmp;
        tmp=_head;
        while ((tmp!= null)){
            if(tmp.get_data().equals(pdata)){
                return true;
            }
            else
                tmp=tmp.getNext();
        }
        return false;
    }
    //Este metodo imprime la matriz.
    public void imprimir(Lista lista){
        Nodo tmp=lista._head;
        int cont=0;
        while(tmp!=null){
            cont++;
            System.out.println(((" "+cont+":"+tmp.get_data())));
            tmp=tmp.getNext();
        }   
    }  
}