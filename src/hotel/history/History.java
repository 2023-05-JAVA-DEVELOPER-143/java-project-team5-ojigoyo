package hotel.history;

import hotel.reserv.Reserv;
import hotel.review.Review;

public class History {
private int historyNo;
private Reserv reserv;
private Review review;
public History() {
	// TODO Auto-generated constructor stub
}
public History(int historyNo, Reserv reserv, Review review) {
	super();
	this.historyNo = historyNo;
	this.reserv = reserv;
	this.review = review;
}
public int getHistoryNo() {
	return historyNo;
}
public void setHistoryNo(int historyNo) {
	this.historyNo = historyNo;
}
public Reserv getReserv() {
	return reserv;
}
public void setReserv(Reserv reserv) {
	this.reserv = reserv;
}
public Review getReview() {
	return review;
}
public void setReview(Review review) {
	this.review = review;
}
@Override
public String toString() {
	return "History [historyNo=" + historyNo + ", reserv=" + reserv + ", review=" + review + "]";
}

}
