/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

/**
 *
 * @author thomy
 */
public class clsLog{
    private int id;
    private String nickname;
    private String date;
    private String time;

    public clsLog() {
    }

    public clsLog(int id, String nickname) {
        this.id = 0;
        this.nickname = nickname;
        this.date = "";
        this.time = "";
    }

    clsLog(String nickname) {
        this.id = 0;
        this.nickname = nickname;
        this.date = "";
        this.time = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
