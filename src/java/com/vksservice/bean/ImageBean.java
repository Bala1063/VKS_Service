/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.Bean;

import java.sql.Blob;

/**
 *
 * @author bala
 */
public class ImageBean {
    private int id;
   
    private Blob boardImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

    public Blob getBoardImage() {
        return boardImage;
    }

    public void setBoardImage(Blob boardImage) {
        this.boardImage = boardImage;
    }
    
}
