package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userNo")
	private Long userNo;
	@Column(name="user_name")
    private String userName;
	@Column(name="create_date")
    private String createDate;
	@Column(name="user_id")
    private String userId;
	/*@OneToMany(mappedBy="users")
    private List<RentHistory> rentHistory = new ArrayList<RentHistory>();
    */
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}/*
	public List<RentHistory> getRentHistory() {
		return rentHistory;
	}
	public void setRentHistory(List<RentHistory> rentHistory) {
		this.rentHistory = rentHistory;
	}*/
	@Override
	public String toString() {
		return "Users [userNo=" + userNo + ", userName=" + userName + ", createDate=" + createDate + ", userId="
				+ userId + ", rentHistory=" + 
				//rentHistory +
				"]";
	}
	
}
