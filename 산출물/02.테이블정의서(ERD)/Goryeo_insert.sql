
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

--reserv insert

--history insert

--review insert

--coupon insert

--comment insert

/**********************user insert************************/
--관리자
insert into userinfo(user_id,user_password,user_name,user_email,user_phone,user_address,user_gender,user_birthdate) 
	values('admin','admin','관리자','admin@admin','112-119','경기도 안양시','M',sysdate);
