--user 

--room type 
-- 



--room 





--inquiries 
-- update pk
update inquiries set inquiries_title = '변경', inquiries_content = '변경내용' where inquiries_no = 2;

-- delete pk
delete from inquiries where inquiries_no = 2;

-- select pk
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_email, u.user_tel from inquiries i join userinfo u on i.user_id = u.user_id where i.inquiries_no = 4;

-- select All
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_email, u.user_tel from inquiries i join userinfo u on i.user_id = u.user_id;

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

--history 
--이용내역은 유저만 조회 관리자 필요 ㄴㄴ 전체조회, 이용내역 삭제는 ㄴㄴ, 변경도 ㄴㄴ 
select * from history h join reserv r on h.reserv_no=r.reserv_no join userinfo u on u.user_id=r.user_id where u.user_id='aaaa';
select * from history h join review r on r.review_no=h.review_no where r.review_no=1;
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

--coupon 
--유저가 마이페이지에서 보유 쿠폰 조회
--상세보기 필요 없음 
select * from user_coup uc join userinfo u on uc.user_id = u.user_id join coupon c on uc.coupon_no=c.coupon_no where u.user_id='aaaa';
--쿠폰 삭제 
delete from coupon where coupon_no=1;
--관리자가 쿠폰 내용 변경 
update coupon set coupon_name='15%할인', coupon_dc_rate=15 where coupon_no=1;

--comment
-- updat pk
update inquiries_comment set comm_title = '변경', comm_content = '변경내용' where comm_no = 1;

-- delete pk
delete from inquiries_comment where comm_no = 1;

-- select pk
select comm_no, comm_title, comm_content from inquiries_comment where comm_no = 2;

-- select All
select comm_no, comm_title, comm_content from inquiries_comment;
