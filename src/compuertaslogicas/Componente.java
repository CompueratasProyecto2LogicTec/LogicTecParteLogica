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
    private Componente _sigtConexion;
    private int _numEntradas;
    private int _numEntradasRestantes;
    private Lista _valorEntrada;
    private double _posx;
    private double _posy;
        
    
    public Componente (String _tipo, String _imagen, int _numEntradas, Lista _valorEntrada, double _posx, double _posy){
        this._tipo = _tipo;
        this._imagen = _imagen;
        this._numEntradas = _numEntradas;
        this._valorEntrada=_valorEntrada;
        this._numEntradasRestantes=0;
        this._posx=_posx;
        this._posy=_posy;
        this._sigtConexion = null;
    }   
    
    public String getTipo(){
        return this._tipo;
    }
    
    public String getImagen (){
        return this._imagen;
    }
    
    public int getNumEntradas(){
        return this._numEntradas;
    }
    
    public Componente getSigtConexion(){
        return this._sigtConexion;
    }
    
    public void setSigtConexion (Componente _sigtConexion){
        this._sigtConexion = _sigtConexion;        
    }
    
    public int getEntradasRestantes (){
        return this._numEntradasRestantes;
    }
    
    public Lista getValorEntrada(){
        return this._valorEntrada;
        
    }
    public double getPosx(){
        return this._posx;
    }
    
    public double getPosy(){
        return this._posy;
    }

    public void setPosx(double _posx) {
        this._posx = _posx;
    }

    public void setPosy(double _posy) {
        this._posy = _posy;
    }    
}           