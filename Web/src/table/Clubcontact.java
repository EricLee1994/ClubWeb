package table;

/**
 * Clubcontact entity. @author MyEclipse Persistence Tools
 */

public class Clubcontact implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer clubid;
	private Integer uid;
	private Boolean flag;
	
	// Constructors



	/** default constructor */
	public Clubcontact() {
	}

	/** minimal constructor */
	public Clubcontact(Integer clubid, Integer uid) {
		this.clubid = clubid;
		this.uid = uid;
	}
	
	/** full constructor */
	public Clubcontact(Integer clubid, Integer uid, Boolean flag) {
		this.clubid = clubid;
		this.uid = uid;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
}