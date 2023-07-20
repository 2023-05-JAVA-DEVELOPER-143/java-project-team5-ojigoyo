--user 

--room type 

-- update
update room_type set room_type_detail='변경',room_type_pool='F' where room_type_np=1;



update room_type sert room_type_price=10
-- select by pk
select * from room_type where room_type_no=1;

-- delete
delete from room_type where room_type_no=1;

-- select all
select * from room_type;

-- 잔여 객실 수 확인하기
select room_type_name,room_type_qty from room_type where room_type_name='1번객실타입' ;



-- 객실 상세보기
select room_type_name,room_price,room_type_detail,room_type_pool,room_type_qty from room_type rt join room r on rt.room_type_no=r.room_type_no where rt.room_type_name='1번객실타입';

--객실 최저가 

select r.room_type_no,min(room_price) from room_type rt join room r on rt.room_type_no=r.room_type_no where room_type_no=1 group by r.room_type_no; 


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
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_name, u.user_email, u.user_tel, ic.comm_no, ic.comm_content, ic.comm_date
from inquiries i
join userinfo u 
on i.user_id = u.user_id
join comments ic
on i.inquiries_no = ic.inquiries_no
where i.inquiries_no = 1;

-- select All
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_name, u.user_email, u.user_tel, ic.comm_no, ic.comm_content, ic.comm_date
from inquiries i 
join userinfo u 
on i.user_id = u.user_id
join comments c
on i.inquiries_no = c.inquiries_no;

--reserv 
select re.reserv_check_in,re.reserv_check_out,rt.room_type_no,r.* from room r join reserv re on r.reserv_no=re.reserv_no join room_type rt on rt.room_type_no=r.room_type_no
where reserv_check_in>to_date('2022/03/30','YYYY/MM/DD') or reserv_check_out<to_date('2022/03/15','YYYY/MM/DD') and rt.room_type_no=1;

--예약 insert
insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult,
					reserv_child,isbreakfast,reserv_extra_bed,reserv_date,
					reserv_fprice,reserv_payment,user_id) 
			values(reserv_reserv_no_seq.nextval,to_date('2022/02/22','YYYY/MM/DD'),to_date('2022/02/25','YYYY/MM/DD'),2,1,'T',0,sysdate,300000,'카드',null);
--예약 delete
delete reserv where reserv_no=1;
--예약 update
update reserv set RESERV_ADULT=2,
RESERV_CHILD=2,
ISBREAKFAST='T',
RESERV_EXTRA_BED=1,
reserv_fprice=600000,
RESERV_PAYMENT='card' where reserv_no=1;
--룸의 타입정보를 포함한 모든정보
select * from room r join room_type rt on r.room_type_no= rt.room_type_no;
--룸의 타입정보를 포함한 모든정보+각 룸의 예약정보 
select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.reserv_no=r.reserv_no;
--날짜와 방타입으로 예약 가능한 방 검색
select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.reserv_no=r.reserv_no where rt.room_type_no=1 and re.reserv_date>to_date('2022/02/20','YYYY/MM/DD') or re.reserv_date<to_date('2022/02/19','YYYY/MM/DD');
--예약정보 + 유저정보 전체 조회
select * from reserv re join userinfo u on u.user_id = re.user_id;
--내가 한 예약 조회 by ID and 예약 하나 상세보기 by reserv_no
select * from reserv re join userinfo u on u.user_id = re.user_id where re.reserv_no=1;
--내가한 예약 조회 by ID
select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id='aaaa';
--내가한 예약 조회 by ID , 기간 1달 이내 기록 default 유저정보 제외 예약정보만 조회
select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id ='aaaa' and (sysdate-reserv_date)<30;
--내가한 예약 조회 by ID , 선택한 기간 이내 기록 유저정보 제외 예약정보만 조회
select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id ='aaaa' and reserv_date Between to_date('2023/07/19','yyyy/mm/dd') and to_date('2023/07/20','yyyy/mm/dd')+1;


--review 

/************review****************/ 
-- update pk
update review set review_title = '변경', review_content = '변경내용', review_img = 'updateimg.jpg' where review_no = 2;

-- delete pk
delete from review where review_no = 2;

-- select PK
select r.review_no, r.review_date, r.review_title, r.review_content, r.review_img, u.user_id, u.user_name from review r join userinfo u on r.user_id = u.user_id where review_no = 3;

-- select All
select r.review_no, r.review_date, r.review_title, r.review_content, r.review_img, u.user_id, u.user_name from review r join userinfo u on r.user_id = u.user_id;


--comment
-- updat pk
update comments set comm_content = '변경내용' where comm_no = 1;

-- delete pk
delete from comments where comm_no = 1;

-- select pk
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_name, u.user_tel, u.user_email, c.comm_no, c.comm_content, c.comm_date from comments c join inquiries i on c.inquiries_no = i.inquiries_no join userinfo u on i.user_id = u.user_id where comm_no = 2;

-- select All
select comm_no, comm_content, comm_date from comments;
