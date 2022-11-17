package librarymanagement;

import javax.persistence.*;

@Entity
@Table(name = "LibraryManagementSyatem")
 
//POJO class
public class LibraryManagement {
 
    @Id 
    @Column(name = "bookId")
    private int id;
 
    @Column(name = "BookName")
    private String Bookname;
 
    @Column(name = "Publisher") 
    private String Publisher;
    

    @Column(name = "DateofpublisH") 
    private String DateofpublisH;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookname() {
		return Bookname;
	}


	public void setBookname(String bookname) {
		Bookname = bookname;
	}


	public String getPublisher() {
		return Publisher;
	}


	public void setPublisher(String publisher) {
		Publisher = publisher;
	}


	public String getDateofpublisH() {
		return DateofpublisH;
	}


	public void setDateofpublisH(String dateofpublisH) {
		DateofpublisH = dateofpublisH;
	}
}
 
   