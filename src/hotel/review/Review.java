package hotel.review;

import java.sql.Date;


public class Review {
	private int reviewNo;
	private Date reviewDate;
	private String reviewTitle;
	private String reviewContent;
	private String reviewImgUrl;
	
	public Review() {
		
	}

	public Review(int reviewNo, Date reviewDate, String reviewTitle, String reviewContent, String reviewImgUrl) {
		super();
		this.reviewNo = reviewNo;
		this.reviewDate = reviewDate;
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
		this.reviewImgUrl = reviewImgUrl;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewImgUrl() {
		return reviewImgUrl;
	}

	public void setReviewImgUrl(String reviewImgUrl) {
		this.reviewImgUrl = reviewImgUrl;
	}

	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", reviewDate=" + reviewDate + ", reviewTitle=" + reviewTitle
				+ ", reviewContent=" + reviewContent + ", reviewImgUrl=" + reviewImgUrl + "]";
	}

	
}
