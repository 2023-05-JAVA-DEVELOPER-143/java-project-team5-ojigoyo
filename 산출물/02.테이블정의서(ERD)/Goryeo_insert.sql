
--user insert

--room type insert


insert into room_type (room_type_no,room_type_name,room_type_img,room_type_detail,room_type_pool,room_type_qty)
        values (1,'1번객실타입','image1.jpg','1번객실타입 세부사항','F',2);

insert into room_type
(room_type_no,room_type_name,room_type_img,room_type_detail,room_type_pool,room_type_qty)
	values	
(2,'2번객실타입','image2.jpg','2번객실타입 세부사항','T',1);

insert into room_type
(room_type_no,room_type_name,room_type_img,room_type_detail,room_type_pool,room_type_qty)
	values	
(3,'3번객실타입','image3.jpg','3번객실타입 세부사항','T',0);






--room insert

insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (101,10,1,null);
insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (102,10,1,null);
insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (103,10,1,null);
insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (201,100,2,null);
insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (202,100,2,null);
insert into room(room_no,room_price,room_type_no,reserv_no) 
	values (301,1000,3,null);


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

<<<<<<< HEAD
--coupon insert

=======

>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
--comment insert

/**********************user insert************************/
--관리자
insert into userinfo(user_id,user_password,user_name,user_email,user_phone,user_address,user_gender,user_birthdate) 
	values('admin','admin','관리자','admin@admin','112-119','경기도 안양시','M',sysdate);
