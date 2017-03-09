/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.Bean;

import java.util.List;

/**
 *
 * @author bala
 */
public class BoardBean {

    private int id;
  
    private String boardSNo;
    private String boardName;
    private String problem;
    private String remedy;
    private String StatusOfBoard;
    private List<ImageBean> imageBean;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getBoardSNo() {
        return boardSNo;
    }

    public void setBoardSNo(String boardSNo) {
        this.boardSNo = boardSNo;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getRemedy() {
        return remedy;
    }

    public void setRemedy(String remedy) {
        this.remedy = remedy;
    }

    public String getStatusOfBoard() {
        return StatusOfBoard;
    }

    public void setStatusOfBoard(String StatusOfBoard) {
        this.StatusOfBoard = StatusOfBoard;
    }

    public List<ImageBean> getImageBean() {
        return imageBean;
    }

    public void setImageBean(List<ImageBean> imageBean) {
        this.imageBean = imageBean;
    }

}
