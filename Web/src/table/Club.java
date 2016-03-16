package table;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Club entity. @author MyEclipse Persistence Tools
 */

public class Club implements java.io.Serializable {

	// Fields

	private Integer id;
	private String clubname;
	private Date setuptime;
	private String content;
	private Integer chrageid;
	private String comment;
	private Boolean flag;
	
	private Userinfo chrageUser;

	// Constructors

	/** default constructor */
	public Club() {
	}

	/** minimal constructor */
	public Club(String clubname, Date setuptime, Integer chrageid) {
		this.clubname = clubname;
		this.setuptime = setuptime;
		this.chrageid = chrageid;
	}

	/** full constructor */
	public Club(String clubname, Date setuptime, String content,
			Integer chrageid, String comment, Boolean flag) {
		this.clubname = clubname;
		this.setuptime = setuptime;
		this.content = content;
		this.chrageid = chrageid;
		this.comment = comment;
		this.flag = flag;

	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClubname() {
		return this.clubname;
	}

	public void setClubname(String clubname) {
		this.clubname = clubname;
	}

	public Date getSetuptime() {
		return this.setuptime;
	}

	public void setSetuptime(Date setuptime) {
		this.setuptime = setuptime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getChrageid() {
		return this.chrageid;
	}

	public void setChrageid(Integer chrageid) {
		this.chrageid = chrageid;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public Userinfo getChrageUser() {
		return chrageUser;
	}

	public void setChrageUser(Userinfo chrageUser) {
		this.chrageUser = chrageUser;
	}
}