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
select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, i.user_id from inquiries i join userinfo u on i.user_id = u.user_id where i.inquiries_no = 5;

-- select All
select inquiries_no, inquiries_title, inquiries_content, inquiries_date from inquiries;

--reserv 
--회원정보와 객실정보 select
--select * from
--history 

--review 
-- update pk
update review set review_title = '변경', review_content = '변경내용', review_img = 'updateimg.jpg' where review_no = 2;

-- delete pk
delete from review where review_no = 2;

-- select PK
select review_no, review_date, review_title, review_content, review_img from review where review_no = 3;

-- select All
select review_no, review_date, review_title, review_content, review_img from review;

--coupon 

--comment
-- updat pk
update inquiries_comment set comm_title = '변경', comm_content = '변경내용' where comm_no = 1;

-- delete pk
delete from inquiries_comment where comm_no = 1;

-- select pk
select comm_no, comm_title, comm_content from inquiries_comment where comm_no = 2;

-- select All
select comm_no, comm_title, comm_content from inquiries_comment;
