package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RentHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rent_no")
	private Long rentNo;
	@Column(name="rent_date")
    private String rentDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="book_no")
	private Books books;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_no")
    private Users users;
	
	public Long getRentNo() {
		return rentNo;
	}
	public void setRentNo(Long rentNo) {
		this.rentNo = rentNo;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getRentDate() {
		return rentDate;
	}
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	@Override
	public String toString() {
		return "RentHistory [rentNo=" + rentNo + ", books=" + books + ", users=" + users + ", rentDate=" + rentDate
				+ "]";
	}
	
}
