package cn.pbq.entity;
// Generated 2017-5-14 19:18:52 by Hibernate Tools 3.6.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Complain generated by hbm2java
 */
public class Complain implements java.io.Serializable {

	private String compId;
	private String title;
	private String deptOfPeople;
	private String people;
	private Date compTime;
	private String state;
	private String compContent;
	private String complainant;
	private String compCompany;
	private String compMobile;
	private Boolean anonymity;
	private Set replytocomps = new HashSet(0);

	
	//投诉处理状态
	public static String STATE_UNDONE ="0";
	public static String STATE_DONE ="1";
	
	public Complain() {
	}

	public Complain(String compId) {
		this.compId = compId;
	}

	public Complain(String compId, String title, String deptOfPeople, String people, Date compTime, String state,
			String compContent, String complainant, String compCompany, String compMobile, Boolean anonymity,
			Set replytocomps) {
		this.compId = compId;
		this.title = title;
		this.deptOfPeople = deptOfPeople;
		this.people = people;
		this.compTime = compTime;
		this.state = state;
		this.compContent = compContent;
		this.complainant = complainant;
		this.compCompany = compCompany;
		this.compMobile = compMobile;
		this.anonymity = anonymity;
		this.replytocomps = replytocomps;
	}

	public String getCompId() {
		return this.compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeptOfPeople() {
		return this.deptOfPeople;
	}

	public void setDeptOfPeople(String deptOfPeople) {
		this.deptOfPeople = deptOfPeople;
	}

	public String getPeople() {
		return this.people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public Date getCompTime() {
		return this.compTime;
	}

	public void setCompTime(Date compTime) {
		this.compTime = compTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCompContent() {
		return this.compContent;
	}

	public void setCompContent(String compContent) {
		this.compContent = compContent;
	}

	public String getComplainant() {
		return this.complainant;
	}

	public void setComplainant(String complainant) {
		this.complainant = complainant;
	}

	public String getCompCompany() {
		return this.compCompany;
	}

	public void setCompCompany(String compCompany) {
		this.compCompany = compCompany;
	}

	public String getCompMobile() {
		return this.compMobile;
	}

	public void setCompMobile(String compMobile) {
		this.compMobile = compMobile;
	}

	public Set getReplytocomps() {
		return this.replytocomps;
	}

	public void setReplytocomps(Set replytocomps) {
		this.replytocomps = replytocomps;
	}

	public Boolean getAnonymity() {
		return anonymity;
	}

	public void setAnonymity(Boolean anonymity) {
		this.anonymity = anonymity;
	}

}
