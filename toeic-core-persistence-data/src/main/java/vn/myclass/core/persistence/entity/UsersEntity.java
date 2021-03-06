package vn.myclass.core.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usersId;
	
	@Column(name = "email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "roleId")
	private RoleEntity roleEntity;
	
	@OneToMany(mappedBy = "usersEntity", fetch = FetchType.LAZY)
	private List<CommentEntity> commentList;
 	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUsersId() {
		return usersId;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public List<CommentEntity> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<CommentEntity> commentList) {
		this.commentList = commentList;
	}
}
