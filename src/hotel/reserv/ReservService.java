package hotel.reserv;

import java.sql.Date;
import java.util.List;

public class ReservService {
private ReservDao reservDao;
public ReservService() throws Exception {
	reservDao=new ReservDao();
}
public int insert(Reserv reserv) throws Exception {
	return reservDao.insert(reserv);
}
public int updateOption(Reserv reserv) throws Exception{
	return reservDao.updateOption(reserv);
}
public int deleteById(String userid) throws Exception{
	return reservDao.deleteById(userid);
}
public int deleteByReservNo(int reservNo) throws Exception{
	return reservDao.deleteByReservNo(reservNo);
}
public List<Reserv> selectAllReservRoom() throws Exception{
	return reservDao.selectAllReservRoom();
}
public int emptyRoom(int roomTypeNo,Date checkIn, Date checkOut) throws Exception {
	return reservDao.emptyRoom(roomTypeNo, checkIn, checkOut);
}
public Reserv selectReserv() throws Exception {
	return reservDao.selectReserv();
}
public List<Reserv> selectAllAll(int reservNo) throws Exception{
	return reservDao.selectAllAll(reservNo);
}
public List<Reserv> findMyReserv(String userId) throws Exception{
	return reservDao.findMyReserv(userId);
}
public List<Reserv> findMyReservDefault(String userId) throws Exception{
	return reservDao.findMyReservDefault(userId);
}
public List<Reserv> findMyReservByDate(String userId,java.util.Date optionStartDate, java.util.Date optionEndDate) throws Exception{
	return reservDao.findMyReservByDate(userId, optionStartDate, optionEndDate);
}
}
