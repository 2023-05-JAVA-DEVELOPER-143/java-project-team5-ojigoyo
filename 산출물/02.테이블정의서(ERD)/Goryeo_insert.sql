
--user insert

--room type insert

--room insert

--inquiries insert

--reserv insert
insert into reserv(reserv_check_in,reserv_check_out,reserv_adult,
					reserv_child,isbreakfast,reserv_extra_bed,reserv_date,
					reserv_fprice,reserv_payment,coupon_no,user_id) 
			values(to_date('2022/02/22','YYYY/MM/DD'),to_date('2022/02/25','YYYY/MM/DD'),2,1,'T',0,sysdate,300000,'카드',1,1);
--history insert
insert into history(review_no,reserv_no) values(1,1);
--coupon insert
insert into coupon(coupon_name,coupon_dc_rate) values('10%할인쿠폰',10);
--review insert

--comment insert

/**********************user insert************************/
--관리자
insert into userinfo(user_id,user_password,user_name,user_email,user_phone,user_address,user_gender,user_birthdate) 
	values('admin','admin','관리자','admin@admin','112-119','경기도 안양시','M',sysdate);
