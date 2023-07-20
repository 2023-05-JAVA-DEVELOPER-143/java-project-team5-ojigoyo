package hotel.history;

public class HistorySQL {
public static final String INSERT_HISTORY = "insert into history(history_no,review_no,reserv_no) values(history_history_no_seq.nextval,?,?)";
public static final String SELECT_HISTORY_BY_REIVEW="select * from history h join review r on r.review_no=h.review_no where r.review_no=?";
public static final String SELECT_HISTORY_BY_USERID="select * from history h join reserv r on h.reserv_no=r.reserv_no join userinfo u on u.user_id=r.user_id where u.user_id=?";
}
