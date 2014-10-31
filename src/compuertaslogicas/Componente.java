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
public class Componente {
    private String _tipo;
    private String _imagen;
    private String _sigtConexion;
    private int _numEntradas;
    private int _numEntradasRestantes;
    private Lista _valorEntrada;
    private int _cero=0;
    private int _uno=1;
    private double _posx;
    private double _posy;
        
    
    public Componente (String _tipo, String _imagen, int _numEntradas, String _sigtConexion, Lista _valorEntrada, double _posx, double _posy){
        this._tipo = _tipo;
        this._imagen = _imagen;
        this._numEntradas = _numEntradas;
        this._sigtConexion = _sigtConexion;
        this._valorEntrada=_valorEntrada;
        this._numEntradasRestantes=0;
        this._posx=_posx;
        this._posy=_posy;
    }
        
    
    public String getTipo(){
        return this._tipo;
    }
    
    public String getImagen (){
        return this._imagen;
    }
    
    public int getEntradas(){
        return this._numEntradas;
    }
    
    public void setEntradas(int entradas){
        this._numEntradas=entradas;
        
    }
    
    public String getsigtConexion(){
        return this._sigtConexion;
    }
    
    public void setOut (String _sigtConexion){
        this._sigtConexion = _sigtConexion;        
    }
    
    public int getEntradasRestantes (){
        return this._numEntradasRestantes;
    }
    
    public void setEntradasRestantes(int entrada){
        this._numEntradasRestantes+=entrada;
    }
    public int getValorEntrada(){
        if (this._valorEntrada.getLength()==1)
            return (int)this._valorEntrada.getHead().get_data();
        else
            return this._valorEntrada.getLength();
        
    }
    public double getPosx(){
        return this._posx;
    }
    
    public double getPosy(){
        return this._posy;
    }
    
}           