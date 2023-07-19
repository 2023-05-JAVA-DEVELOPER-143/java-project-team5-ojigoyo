DROP TABLE inquiries_comment CASCADE CONSTRAINTS;
DROP TABLE history CASCADE CONSTRAINTS;
DROP TABLE review CASCADE CONSTRAINTS;
DROP TABLE inquiries CASCADE CONSTRAINTS;
DROP TABLE room CASCADE CONSTRAINTS;
DROP TABLE reserv CASCADE CONSTRAINTS;
DROP TABLE room_type CASCADE CONSTRAINTS;
DROP TABLE userInfo CASCADE CONSTRAINTS;
DROP TABLE coupon CASCADE CONSTRAINTS;

CREATE TABLE coupon(
		coupon_no                     		NUMBER(10)		 NULL ,
		coupon_name                   		VARCHAR2(50)		 NOT NULL,
		coupon_dc_rate                		NUMBER(2)		 NOT NULL
);

DROP SEQUENCE coupon_coupon_no_SEQ;

CREATE SEQUENCE coupon_coupon_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER coupon_coupon_no_TRG
BEFORE INSERT ON coupon
FOR EACH ROW
BEGIN
IF :NEW.coupon_no IS NOT NULL THEN
  SELECT coupon_coupon_no_SEQ.NEXTVAL INTO :NEW.coupon_no FROM DUAL;
END IF;
END;

CREATE TABLE userInfo(
		user_id                       		VARCHAR2(50)		 NULL ,
		user_password                 		VARCHAR2(50)		 NOT NULL,
		user_name                     		VARCHAR2(20)		 NOT NULL,
		user_tel                      		VARCHAR2(12)		 NOT NULL,
		user_email                    		VARCHAR2(20)		 NOT NULL,
		user_jumin                    		VARCHAR2(13)		 NOT NULL,
		coupon_no                     		NUMBER(10)		 NULL 
);


CREATE TABLE room_type(
		room_type_no                  		NUMBER(10)		 NULL ,
		room_type_name                		VARCHAR2(50)		 NOT NULL,
		room_type_img                 		VARCHAR2(1000)		 NULL ,
		room_type_detail              		VARCHAR2(10000)		 NOT NULL,
		room_type_pool                		CHAR(1)		 DEFAULT F		 NULL ,
		room_type_num                 		NUMBER(10)		 NOT NULL
);

DROP SEQUENCE room_type_room_type_no_SEQ;

CREATE SEQUENCE room_type_room_type_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

<<<<<<< HEAD
CREATE TRIGGER room_type_room_type_no_TRG
BEFORE INSERT ON room_type
FOR EACH ROW
BEGIN
IF :NEW.room_type_no IS NOT NULL THEN
  SELECT room_type_room_type_no_SEQ.NEXTVAL INTO :NEW.room_type_no FROM DUAL;
END IF;
END;


=======
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
CREATE TABLE reserv(
		reserv_no                     		NUMBER(10)		 NULL ,
		reserv_check_in               		DATE		 NOT NULL,
		reserv_check_out              		INTEGER(10)		 NOT NULL,
		reserv_adult                  		NUMBER(2)		 DEFAULT 1		 NOT NULL,
		reserv_child                  		NUMBER(2)		 DEFAULT 0		 NOT NULL,
		isbreakfast                   		CHAR(1)		 DEFAULT F		 NULL ,
		reserv_extra_bed              		NUMBER(1)		 DEFAULT 0		 NULL ,
		reserv_date                   		DATE		 DEFAULT sysdate		 NULL ,
		reserv_fprice                 		NUMBER(10)		 NOT NULL,
		reserv_payment                		VARCHAR2(10)		 NOT NULL,
		coupon_no                     		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE reserv_reserv_no_SEQ;

CREATE SEQUENCE reserv_reserv_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER reserv_reserv_no_TRG
BEFORE INSERT ON reserv
FOR EACH ROW
BEGIN
IF :NEW.reserv_no IS NOT NULL THEN
  SELECT reserv_reserv_no_SEQ.NEXTVAL INTO :NEW.reserv_no FROM DUAL;
END IF;
END;



CREATE TABLE room(
		room_no                       		NUMBER(10)		 NULL ,
		room_price                    		NUMBER(10)		 NOT NULL,
		room_type_no                  		NUMBER(10)		 NULL ,
		reserv_no                     		NUMBER(10)		 NULL 
);


CREATE TABLE inquiries(
		inquiries_no                  		NUMBER(10)		 NULL ,
		inquiries_title               		VARCHAR2(1000)		 NOT NULL,
		inquiries_content             		VARCHAR2(10000)		 NOT NULL,
		inquiries_date                		DATE		 DEFAULT sysdate		 NULL ,
		user_id                       		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE inquiries_inquiries_no_SEQ;

CREATE SEQUENCE inquiries_inquiries_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER inquiries_inquiries_no_TRG
BEFORE INSERT ON inquiries
FOR EACH ROW
BEGIN
IF :NEW.inquiries_no IS NOT NULL THEN
  SELECT inquiries_inquiries_no_SEQ.NEXTVAL INTO :NEW.inquiries_no FROM DUAL;
END IF;
END;


CREATE TABLE review(
		review_no                     		NUMBER(10)		 NULL ,
		review_date                   		DATE		 DEFAULT sysdate		 NULL ,
		review_title                  		VARCHAR2(100)		 NOT NULL,
		review_content                		VARCHAR2(3000)		 NOT NULL,
		review_img                    		VARCHAR2(1000)		 NULL 
);

DROP SEQUENCE review_review_no_SEQ;

CREATE SEQUENCE review_review_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER review_review_no_TRG
BEFORE INSERT ON review
FOR EACH ROW
BEGIN
IF :NEW.review_no IS NOT NULL THEN
  SELECT review_review_no_SEQ.NEXTVAL INTO :NEW.review_no FROM DUAL;
END IF;
END;


CREATE TABLE history(
		history_no                    		NUMBER(10)		 NULL ,
		review_no                     		NUMBER(10)		 NULL ,
		reserv_no                     		NUMBER(10)		 NULL 
);

DROP SEQUENCE history_history_no_SEQ;

CREATE SEQUENCE history_history_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER history_history_no_TRG
BEFORE INSERT ON history
FOR EACH ROW
BEGIN
IF :NEW.history_no IS NOT NULL THEN
  SELECT history_history_no_SEQ.NEXTVAL INTO :NEW.history_no FROM DUAL;
END IF;
END;


CREATE TABLE inquiries_comment(
		inquiries_comment_no          		NUMBER(10)		 NULL ,
		inquiries_comment_title       		VARCHAR2(1000)		 NOT NULL,
		inquiries_comment_content     		VARCHAR2(10000)		 NOT NULL,
		inquiries_no                  		NUMBER(10)		 NULL 
);

DROP SEQUENCE inquiries_comment_inquiries_comment_no_SEQ;

CREATE SEQUENCE inquiries_comment_inquiries_comment_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER inquiries_comment_inquiries_comment_no_TRG
BEFORE INSERT ON inquiries_comment
FOR EACH ROW
BEGIN
IF :NEW.inquiries_comment_no IS NOT NULL THEN
  SELECT inquiries_comment_inquiries_comment_no_SEQ.NEXTVAL INTO :NEW.inquiries_comment_no FROM DUAL;
END IF;
END;



ALTER TABLE coupon ADD CONSTRAINT IDX_coupon_PK PRIMARY KEY (coupon_no);

ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (user_id);
ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon (coupon_no);

ALTER TABLE room_type ADD CONSTRAINT IDX_room_type_PK PRIMARY KEY (room_type_no);

ALTER TABLE reserv ADD CONSTRAINT IDX_reserv_PK PRIMARY KEY (reserv_no);
ALTER TABLE reserv ADD CONSTRAINT IDX_reserv_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon (coupon_no);
ALTER TABLE reserv ADD CONSTRAINT IDX_reserv_FK1 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE room ADD CONSTRAINT IDX_room_PK PRIMARY KEY (room_no);
ALTER TABLE room ADD CONSTRAINT IDX_room_FK0 FOREIGN KEY (room_type_no) REFERENCES room_type (room_type_no);
ALTER TABLE room ADD CONSTRAINT IDX_room_FK1 FOREIGN KEY (reserv_no) REFERENCES reserv (reserv_no);

ALTER TABLE inquiries ADD CONSTRAINT IDX_inquiries_PK PRIMARY KEY (inquiries_no);
ALTER TABLE inquiries ADD CONSTRAINT IDX_inquiries_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE review ADD CONSTRAINT IDX_review_PK PRIMARY KEY (review_no);

ALTER TABLE history ADD CONSTRAINT IDX_history_PK PRIMARY KEY (history_no);
ALTER TABLE history ADD CONSTRAINT IDX_history_FK0 FOREIGN KEY (review_no) REFERENCES review (review_no);
ALTER TABLE history ADD CONSTRAINT IDX_history_FK1 FOREIGN KEY (reserv_no) REFERENCES reserv (reserv_no);

ALTER TABLE inquiries_comment ADD CONSTRAINT IDX_inquiries_comment_PK PRIMARY KEY (inquiries_comment_no);
ALTER TABLE inquiries_comment ADD CONSTRAINT IDX_inquiries_comment_FK0 FOREIGN KEY (inquiries_no) REFERENCES inquiries (inquiries_no);

