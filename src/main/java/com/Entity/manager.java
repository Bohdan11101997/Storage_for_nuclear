package com.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manager")
public class manager {



    @Column(name = "Name")
    private String name;

    @Id
    @Column(name = "id")
    private Long id;



    @Column(name = "Login")
    private  String login;


    @Column(name = "Password")
    private String Password;

    public manager(Long id,String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        Password = password;
    }

    public   manager()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof manager)) return false;

        manager manager = (com.Entity.manager) o;

        if (getId() != null ? !getId().equals(manager.getId()) : manager.getId() != null) return false;
        if (getName() != null ? !getName().equals(manager.getName()) : manager.getName() != null) return false;
        if (getLogin() != null ? !getLogin().equals(manager.getLogin()) : manager.getLogin() != null) return false;
        return getPassword() != null ? getPassword().equals(manager.getPassword()) : manager.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getLogin() != null ? getLogin().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
