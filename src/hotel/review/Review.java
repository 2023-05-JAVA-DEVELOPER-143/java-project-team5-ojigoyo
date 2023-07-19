package hotel.review;

import java.sql.Date;

import hotel.history.History;

public class Review {
	private int reviewNo;
	private Date reviewDate;
	private String reviewTitle;
	private String reviewContent;
	private String reviewImgUrl;
	private History history;
	
	public Review() {
		
	}

	public Review(int reviewNo, Date reviewDate, String reviewTitle, String reviewContent, String reviewImgUrl,
			History history) {
		super();
		this.reviewNo = reviewNo;
		this.reviewDate = reviewDate;
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
		this.reviewImgUrl = reviewImgUrl;
		this.history = history;
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

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", reviewDate=" + reviewDate + ", reviewTitle=" + reviewTitle
				+ ", reviewContent=" + reviewContent + ", reviewImgUrl=" + reviewImgUrl + ", history=" + history + "]";
	}

	
}
