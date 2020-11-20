package com.twoproject.entity;

// bir nebi veritabanından veri çekmek için kullanılacak
// talosuz mongo db veri tabanı

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document // buda mongodb nin colleşinı olmasını söylüyor collectionsa denk geleceğini söyledik
public class Kullanici {
    @Id // bu sayede bu collectionsun id string tipinde yaptık
    private String id;
    private String adi;
    private String soyadi;
    private HashMap ozellikleri; // hashmap olması birçok özelliği olabilir göz rengi kaş rengi vs


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public HashMap getOzellikleri() {
        return ozellikleri;
    }

    public void setOzellikleri(HashMap ozellikleri) {
        this.ozellikleri = ozellikleri;
    }
}
