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
public class Publisher {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pub_no")
	private Long pubNo;
    private Long name;
    @Column(name="established_date")
    private String establishedDate;
    @OneToMany(mappedBy="publisher")
    private List<Books> books = new ArrayList<Books>();
    
	public Long getPubNo() {
		return pubNo;
	}
	public void setPubNo(Long pubNo) {
		this.pubNo = pubNo;
	}
	public Long getName() {
		return name;
	}
	public void setName(Long name) {
		this.name = name;
	}
	public String getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Publisher [pubNo=" + pubNo + ", name=" + name + ", establishedDate=" + establishedDate + "]";
	}

    
}
