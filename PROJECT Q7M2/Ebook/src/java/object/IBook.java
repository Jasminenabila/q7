/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;
/**
 *
 * @author user
 */
public interface IBook {
     public String getIdEBook() ;
    public void setIdEBook(String idebook) ;
    public String getJudul() ;
    public void setJudul(String judul);
    public String getdeskripsi();
    public void setdeskripsi(String deskripsi);
    public String getFile();
    public void setFile(String file) ;
    public String getgambar();
    public void setgambar(String gambar) ; 
    public int doInsert() ;
    public int doUpdate();
    public int doUpdatePDF();
    public int doUpdatePict();
    public int doDelete();  
    public ArrayList display();
    public ArrayList getRecord();
    public ArrayList cariBook(String search);
}