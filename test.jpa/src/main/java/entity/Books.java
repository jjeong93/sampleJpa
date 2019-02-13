package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_no")
	private Long bookNo;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pub_no")
    private Publisher publisher;
    private String title;
    private String author;
    private String stock;
    @Column(name="register_date")
    private String registerDate;
   /* @OneToMany(mappedBy="books")
    private List<RentHistory> rentHistory = new ArrayList<RentHistory>();*/
    
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	/*public List<RentHistory> getRentHistory() {
		return rentHistory;
	}
	public void setRentHistory(List<RentHistory> rentHistory) {
		this.rentHistory = rentHistory;
	}*/
	@Override
	public String toString() {
		return "Books [bookNo=" + bookNo + ", publisher=" + publisher + ", title=" + title + ", author=" + author
				+ ", stock=" + stock + ", registerDate=" + registerDate + ", rentHistory=" 
				+ 
				//rentHistory + 
				"]";
	}
	
    
}
