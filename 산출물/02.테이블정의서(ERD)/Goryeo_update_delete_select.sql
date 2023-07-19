--user 

--room type 
-- 



--room 





--inquiries 
-- update pk
update inquiries set inquiries_title = '변경', inquiries_content = '변경내용' where inquiries_no = 1;

-- delete pk
delete from inquiries where inquiries_no = 1;

-- select pk
select inquiries_no, inquiries_title, inquiries_content, inquiries_date from inquiries where inquiries_no = 1;

-- select All
select inquiries_no, inquiries_title, inquiries_content, inquiries_date from inquiries;

--reserv 
--회원정보와 예약정보 select 쿠폰없이 예약전 예약 정보 확인용
select * from userinfo u join reserv r on u.user_id = r.user_id where u.user_id='aaaa';
--회원정보와 예약정보 select 쿠폰없이 예약 결제 쿠폰 포함
select * from userinfo u join reserv r on u.user_id = r.user_id join coupon c on u.coupon_no=c.coupon_no where u.user_id='aaaa';
--예약 변경은 필요없고 취소
delete from reserv where reserv.user_id='aaaa';
--관리자용 전체조회, 유저 이름으로 조회
select * from userinfo u join reserv r on u.user_id  = r.user_id;
--history 
--이용내역은 유저만 조회 관리자 필요 ㄴㄴ 전체조회, 이용내역 삭제는 ㄴㄴ, 변경도 ㄴㄴ 
select * from history h join reserv r on h.reserv_no=r.reserv_no join userinfo u on u.user_id=r.user_id where u.user_id='aaaa';
select * from history h join review r on r.review_no=h.review_no where review_no=1;
--review 

-- update pk
update review set review_title = '변경', review_content = '변경내용', review_img = 'updateimg.jpg' where review_no = 1;

-- delete pk
delete from review where review_no = 1;

-- select PK
select review_no, review_date, review_title, review_content, review_img from review where review_no = 1;

-- select All
select review_no, review_date, review_title, review_content, review_img from review;

--coupon 
--유저가 마이페이지에서 보유 쿠폰 조회
--상세보기 필요 없음 
select * from coupon c join userinfo u on c.coupon_no=u.coupon_no where user_id='aaaa';
--쿠폰 삭제 
delete from coupon where user_id='aaaa';
--관리자가 쿠폰 내용 변경 
update set coupon_name='15%할인', coupon_dc_rate=15 where coupon_no=1;

--comment