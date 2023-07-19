--user 

--room type 

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

--history 

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

--comment