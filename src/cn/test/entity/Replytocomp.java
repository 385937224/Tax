package cn.test.entity;
// Generated 2017-5-14 19:18:52 by Hibernate Tools 3.6.0.Final

import java.util.Date;

/**
 * Replytocomp generated by hbm2java
 */
public class Replytocomp implements java.io.Serializable {

	private String replyId;
	private Complain complain;
	private Date replyTime;
	private String replyDept;
	private String replyPeople;
	private String replyContent;

	public Replytocomp() {
	}

	public Replytocomp(String replyId) {
		this.replyId = replyId;
	}

	public Replytocomp(String replyId, Complain complain, Date replyTime, String replyDept, String replyPeople,
			String replyContent) {
		this.replyId = replyId;
		this.complain = complain;
		this.replyTime = replyTime;
		this.replyDept = replyDept;
		this.replyPeople = replyPeople;
		this.replyContent = replyContent;
	}

	public String getReplyId() {
		return this.replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public Complain getComplain() {
		return this.complain;
	}

	public void setComplain(Complain complain) {
		this.complain = complain;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyDept() {
		return this.replyDept;
	}

	public void setReplyDept(String replyDept) {
		this.replyDept = replyDept;
	}

	public String getReplyPeople() {
		return this.replyPeople;
	}

	public void setReplyPeople(String replyPeople) {
		this.replyPeople = replyPeople;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
