package com.rhisco.springsecurity.model;
// Generated Mar 7, 2016 1:47:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserProfile generated by hbm2java
 */
@Entity
@Table(name="userprofile"
    ,catalog="security"
    , uniqueConstraints = @UniqueConstraint(columnNames="type") 
)
public class UserProfile implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUserProfile;
     private String type = UserProfileType.USER.getUserProfileType();
     private Set<User> users = new HashSet<User>(0);

    public UserProfile() {
    }

	
    public UserProfile(int idUserProfile, String type) {
        this.idUserProfile = idUserProfile;
        this.type = type;
    }
    public UserProfile(int idUserProfile, String type, Set<User> users) {
       this.idUserProfile = idUserProfile;
       this.type = type;
       this.users = users;
    }
   
     @Id 

    
    @Column(name="idUserProfile", unique=true, nullable=false)
    public int getIdUserProfile() {
        return this.idUserProfile;
    }
    
    public void setIdUserProfile(int idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    
    @Column(name="type", unique=true, nullable=false, length=30)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_has_userprofile", catalog="security", joinColumns = { 
        @JoinColumn(name="userprofile_idUserProfile", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="user_idUser", nullable=false, updatable=false) })
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
	public String toString() {
		return "UserProfile [id=" + idUserProfile + ",  type=" + type	+ "]";
	}


}


