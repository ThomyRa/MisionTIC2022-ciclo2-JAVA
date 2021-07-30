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
public class clsPeople {

    private String id;
    private String name;
    private String nickname;

    public clsPeople() {
    }

    public clsPeople(String id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
