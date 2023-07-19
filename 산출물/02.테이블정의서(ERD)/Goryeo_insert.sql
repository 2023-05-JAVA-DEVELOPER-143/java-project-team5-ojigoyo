
--user insert

--room type insert

--room insert

--inquiries insert
insert into inquiries(inquiries_no, inquiries_title, inquiries_content, inquiries_date) values(inquiries_inquiries_no_SEQ.nextval, '제목', '내용', sysdate);

--reserv insert
insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult,
					reserv_child,isbreakfast,reserv_extra_bed,reserv_date,
					reserv_fprice,reserv_payment,coupon_no,user_id) 
			values(reserv_reserv_no_seq.nextval,to_date('2022/02/22','YYYY/MM/DD'),to_date('2022/02/25','YYYY/MM/DD'),2,1,'T',0,sysdate,300000,'카드',1,null);
--history insert
insert into history(history_no,review_no,reserv_no) values(history_history_no_seq.nextval,null,null);
--coupon insert
insert into coupon(coupon_no,coupon_name,coupon_dc_rate) values(coupon_coupon_no_seq.nextval,'10%할인쿠폰',10);
--review insert
insert into review(review_no, review_date, review_title, review_content, review_img) values(review_review_no_SEQ.nextval, sysdate, '제목', '내용', 'img.jpg');


--comment insert

/**********************user insert************************/
--관리자
insert into userinfo(user_id,user_password,user_name,user_email,user_phone,user_address,user_gender,user_birthdate) 
	values('admin','admin','관리자','admin@admin','112-119','경기도 안양시','M',sysdate);
