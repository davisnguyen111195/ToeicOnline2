package vn.myclass.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "comment")
public class CommentEntity {
	@Column(name = "content")
	private String content;
	
	@Column(name = "createddate")
	private Timestamp createddate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	@ManyToOne
	@JoinColumn(name = "usersId")
	private UsersEntity usersEntity;

	@ManyToOne
	@JoinColumn(name = "listenguidelineId")
	private ListenguidelineEntity listenguidelineEntity;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Timestamp getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
}
