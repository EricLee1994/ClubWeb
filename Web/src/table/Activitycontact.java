package table;

/**
 * Activitycontact entity. @author MyEclipse Persistence Tools
 */

public class Activitycontact implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer actid;
	private Integer uid;

	// Constructors

	/** default constructor */
	public Activitycontact() {
	}

	/** full constructor */
	public Activitycontact(Integer actid, Integer uid) {
		this.actid = actid;
		this.uid = uid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActid() {
		return this.actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}