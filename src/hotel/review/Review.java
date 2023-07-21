package hotel.review;

import java.sql.Date;

import hotel.user.User;


public class Review {
	private int review_no;
	private Date review_date;
	private String review_title;
	private String review_content;
	
	public Review() {
		
	}

	public Review(int review_no, Date review_date, String review_title, String review_content) {
		super();
		this.review_no = review_no;
		this.review_date = review_date;
		this.review_title = review_title;
		this.review_content = review_content;
	}

	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public Date getReview_date() {
		return review_date;
	}

	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}

	public String getReview_title() {
		return review_title;
	}

	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	@Override
	public String toString() {
		return "Review [review_no=" + review_no + ", review_date=" + review_date + ", review_title=" + review_title
				+ ", review_content=" + review_content + ", user_id= " + "]";
	}

}
