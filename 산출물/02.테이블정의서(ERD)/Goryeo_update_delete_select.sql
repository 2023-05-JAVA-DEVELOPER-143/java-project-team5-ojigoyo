--user 

--room type 

-- update
update room_type set room_type_detail='변경',room_type_pool='F' where room_type_np=1;

-- select by pk
select * from room_type where room_type_no=1;

-- delete
delete from room_type where room_type_no=1;

-- select all
select * from room_type;





-- 타입별 방 개수 임시
update room set reserv_no=1 where room_no=101;

update room_type set room_type_qty = 
                    (select count(*) from room_type rt 
                                     join room r  
                                     on rt.room_type_no = r.room_type_no 
                    where rt.room_type_no = r.room_type_no and r.reserv_no is null)
                    where room_type_no=2;


-- 객실 상세보기
select rt.room_type_name,rt.room_type_detail,rt.room_type_pool,rt.room_type_qty 
from room r 
join room_type rt 
on r.room_type_no=rt.room_type_no 
where r.room_type_no=2;


--room 

-- select by pk
select * from room where room_no=1;

--select by all
select* from room ;

-- delete
delete from room where room_no=1;

--update
update room set room_price=10 where room_type_no=1;


--객실소개
select rt.room_type_name,r.room_price,rt.room_type_detail,rt.room_type_pool 
         from room r join room_type rt 
         on r.room_type_no=rt.room_type_no ;
        
--할인가격 객실(관리자)
update room set room_price = room_price*10/100 where room_type_no=1;







--객실타입, 체크인 아웃 날짜 피해서 빈방 검색 
select re.reserv_check_in,re.reserv_check_out,rt.room_type_no,r.* from room r join reserv re on r.reserv_no=re.reserv_no join room_type rt on rt.room_type_no=r.room_type_no
where reserv_check_in>/*선택체크아웃날짜*/to_date('2022/03/30','YYYY/MM/DD') or reserv_check_out</*선택한체크인날짜*/to_date('2022/03/15','YYYY/MM/DD') and rt.room_type_no=1;





--inquiries 
-- update pk
update inquiries set inquiries_title = '변경', inquiries_content = '변경내용' where inquiries_no = 2;

-- delete pk
delete from inquiries where inquiries_no = 2;

-- select pk
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_email, u.user_tel, ic.comm_content, ic.comm_date
from inquiries i
join userinfo u 
on i.user_id = u.user_id
join comments ic
on i.inquiries_no = ic.inquiries_no
where i.inquiries_no = 1;

-- select All
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_email, u.user_tel 
from inquiries i 
join userinfo u 
on i.user_id = u.user_id
join comments c
on i.inquiries_no = c.inquiries_no;

--reserv 
--회원정보와 예약정보 select 쿠폰없이 예약전 예약 정보 확인용
select * from userinfo u join reserv r on u.user_id = r.user_id where u.user_id='aaaa';
--회원정보와 예약정보 select 예약 결제 쿠폰 포함
select * from userinfo u join reserv r on u.user_id=r.user_id join user_coup uc on uc.user_id=u.user_id join coupon c on c.coupon_no=uc.coupon_no where user_id='aaaa';
select * from userinfo u join reserv r on u.user_id =r.user_id join user_coup uc on uc.user_id=u.user_id where u.user_id='aaaa';
--예약 변경은 필요없고 취소
delete from reserv where reserv.user_id='aaaa';
--관리자용 전체조회, 유저 이름으로 조회
select * from userinfo u join reserv r on u.user_id  = r.user_id;
--회원정보와 객실정보 select

--review 

/************review****************/ 
-- update pk
update review set review_title = '변경', review_content = '변경내용', review_img = 'updateimg.jpg' where review_no = 2;

-- delete pk
delete from review where review_no = 2;

-- select PK
select review_no, review_date, review_title, review_content, review_img from review where review_no = 3;

-- select All
select review_no, review_date, review_title, review_content, review_img from review;


--comment
-- updat pk
update inquiries_comment set comm_title = '변경', comm_content = '변경내용' where comm_no = 1;

-- delete pk
delete from inquiries_comment where comm_no = 1;

-- select pk
select comm_no, comm_content, comm_date from comments where comm_no = 2;

-- select All
select comm_no, comm_content, comm_date from comments;
