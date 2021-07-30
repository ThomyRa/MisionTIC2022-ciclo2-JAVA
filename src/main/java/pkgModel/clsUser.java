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
public class clsUser extends clsPeople {

    private String password;

    public clsUser() {
    }

    public clsUser(String id, String name, String nickname, String password) {
        super(id, name, nickname);
        this.password = password;
    }

    public clsUser(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return super.getId() + " " + super.getName() + " " + super.getNickname();
    }

}
