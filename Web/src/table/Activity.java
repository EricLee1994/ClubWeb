package table;

import java.sql.Timestamp;

/**
 * Activity entity. @author MyEclipse Persistence Tools
 */

public class Activity implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer clubid;
	private String actname;
	private Timestamp starttime;
	private Timestamp endtime;
	private String actinfo;
	private Timestamp creattime;
	private Boolean flag;

	// Constructors

	/** default constructor */
	public Activity() {
	}

	/** minimal constructor */
	public Activity(Integer clubid, String actname, Timestamp starttime,
			Timestamp endtime, String actinfo, Timestamp creattime) {
		this.clubid = clubid;
		this.actname = actname;
		this.starttime = starttime;
		this.endtime = endtime;
		this.actinfo = actinfo;
		this.creattime = creattime;
	}

	/** full constructor */
	public Activity(Integer clubid, String actname, Timestamp starttime,
			Timestamp endtime, String actinfo, Timestamp creattime, Boolean flag) {
		this.clubid = clubid;
		this.actname = actname;
		this.starttime = starttime;
		this.endtime = endtime;
		this.actinfo = actinfo;
		this.creattime = creattime;
		this.flag = flag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClubid() {
		return this.clubid;
	}

	public void setClubid(Integer clubid) {
		this.clubid = clubid;
	}

	public String getActname() {
		return this.actname;
	}

	public void setActname(String actname) {
		this.actname = actname;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getActinfo() {
		return this.actinfo;
	}

	public void setActinfo(String actinfo) {
		this.actinfo = actinfo;
	}

	public Timestamp getCreattime() {
		return this.creattime;
	}

	public void setCreattime(Timestamp creattime) {
		this.creattime = creattime;
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}