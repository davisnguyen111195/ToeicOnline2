package vn.myclass.core.persistence.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "listenguideline")
public class ListenguidelineEntity {

	@Column(name = "title")
	private String title;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "modifieddate")
	private Timestamp modifieddate;

	@Column(name = "createddate")
	private Timestamp createddate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer listenguidelineId;
	
	@OneToMany(mappedBy = "listenguidelineEntity", fetch = FetchType.LAZY)
	private List<CommentEntity> commentList;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}

	public Timestamp getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public Integer getListenguidelineId() {
		return listenguidelineId;
	}

	public void setListenguidelineId(Integer listenguidelineId) {
		this.listenguidelineId = listenguidelineId;
	}

	public List<CommentEntity> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentEntity> commentList) {
		this.commentList = commentList;
	}
}
