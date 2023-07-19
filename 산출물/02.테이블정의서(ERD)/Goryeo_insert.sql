
--user insert

--room type insert

--room insert

--inquiries insert
insert into inquiries(inquiries_no, inquiries_title, inquiries_content, inquiries_date) values(inquiries_inquiries_no_SEQ.nextval, '제목', '내용', sysdate);

--reserv insert

--history insert

--review insert
insert into review(review_no, review_date, review_title, review_content, review_img) values(review_review_no_SEQ.nextval, sysdate, '제목', '내용', 'img.jpg');

--coupon insert

--comment insert

/**********************user insert************************/
--관리자
insert into userinfo(user_id,user_password,user_name,user_email,user_phone,user_address,user_gender,user_birthdate) 
	values('admin','admin','관리자','admin@admin','112-119','경기도 안양시','M',sysdate);
