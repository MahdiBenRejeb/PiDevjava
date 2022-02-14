/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabdeal.Entite;

/**
 *
 * @author SBS
 */
public class Publication {
    int id,like,dislike;
    String description,date,titre;

    public Publication(int id, String description, String date, String titre) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Publication{" + "id=" + id + ", like=" + like + ", dislike=" + dislike + ", description=" + description + ", date=" + date + ", titre=" + titre + '}';
    }
   
    
    
    
}
