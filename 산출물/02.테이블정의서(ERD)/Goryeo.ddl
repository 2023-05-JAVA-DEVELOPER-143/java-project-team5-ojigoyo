DROP TABLE comments CASCADE CONSTRAINTS;
DROP TABLE review CASCADE CONSTRAINTS;
DROP TABLE inquiries CASCADE CONSTRAINTS;
DROP TABLE room CASCADE CONSTRAINTS;
DROP TABLE reserv CASCADE CONSTRAINTS;
DROP TABLE room_type CASCADE CONSTRAINTS;
DROP TABLE userInfo CASCADE CONSTRAINTS;

CREATE TABLE userInfo(
		user_id                       		VARCHAR2(50)		 NULL ,
		user_password                 		VARCHAR2(50)		 NOT NULL,
		user_name                     		VARCHAR2(20)		 NOT NULL,
		user_tel                      		VARCHAR2(30)		 NOT NULL,
		user_email                    		VARCHAR2(20)		 NOT NULL,
		user_jumin                    		VARCHAR2(30)		 NOT NULL
);


CREATE TABLE room_type(
		room_type_no                  		NUMBER(10)		 NULL ,
		room_type_name                		VARCHAR2(50)		 NOT NULL,
		room_type_img                 		VARCHAR2(1000)		 NULL ,
		room_type_detail              		VARCHAR2(4000)		 NOT NULL,
		room_type_pool                		CHAR(1)		 DEFAULT 'F'		 NULL ,
		room_type_qty                 		NUMBER(10)		 NOT NULL
);

DROP SEQUENCE room_type_room_type_no_SEQ;

CREATE SEQUENCE room_type_room_type_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER room_type_room_type_no_TRG
BEFORE INSERT ON room_type
FOR EACH ROW
BEGIN
IF :NEW.room_type_no IS NOT NULL THEN
  SELECT room_type_room_type_no_SEQ.NEXTVAL INTO :NEW.room_type_no FROM DUAL;
END IF;
END;


CREATE TABLE reserv(
		reserv_no                     		NUMBER(10)		 NULL ,
		reserv_check_in               		DATE		 NOT NULL,
		reserv_check_out              		DATE		 NOT NULL,
		reserv_adult                  		NUMBER(2)		 DEFAULT 1		 NOT NULL,
		reserv_child                  		NUMBER(2)		 DEFAULT 0		 NOT NULL,
		isbreakfast                   		CHAR(1)		 DEFAULT 'F'		 NULL ,
		reserv_extra_bed              		NUMBER(1)		 DEFAULT 0		 NULL ,
		reserv_date                   		DATE		 DEFAULT sysdate		 NULL ,
		reserv_fprice                 		NUMBER(10)		 NOT NULL,
		reserv_payment                		VARCHAR2(30)		 NOT NULL,
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
		inquiries_content             		VARCHAR2(4000)		 NOT NULL,
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
		review_img                    		VARCHAR2(1000)		 NULL ,
		user_id                       		VARCHAR2(50)		 NULL 
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


CREATE TABLE comments(
		comm_no                       		NUMBER(10)		 NULL ,
		comm_content                  		VARCHAR2(4000)		 NOT NULL,
		comm_date                     		DATE		 DEFAULT sysdate		 NULL ,
		inquiries_no                  		NUMBER(10)		 NULL 
);

DROP SEQUENCE comments_comm_no_SEQ;

CREATE SEQUENCE comments_comm_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER comments_comm_no_TRG
BEFORE INSERT ON comments
FOR EACH ROW
BEGIN
IF :NEW.comm_no IS NOT NULL THEN
  SELECT comments_comm_no_SEQ.NEXTVAL INTO :NEW.comm_no FROM DUAL;
END IF;
END;



ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (user_id);

ALTER TABLE room_type ADD CONSTRAINT IDX_room_type_PK PRIMARY KEY (room_type_no);

ALTER TABLE reserv ADD CONSTRAINT IDX_reserv_PK PRIMARY KEY (reserv_no);
ALTER TABLE reserv ADD CONSTRAINT IDX_reserv_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE room ADD CONSTRAINT IDX_room_PK PRIMARY KEY (room_no);
ALTER TABLE room ADD CONSTRAINT IDX_room_FK0 FOREIGN KEY (room_type_no) REFERENCES room_type (room_type_no);
ALTER TABLE room ADD CONSTRAINT IDX_room_FK1 FOREIGN KEY (reserv_no) REFERENCES reserv (reserv_no);

ALTER TABLE inquiries ADD CONSTRAINT IDX_inquiries_PK PRIMARY KEY (inquiries_no);
ALTER TABLE inquiries ADD CONSTRAINT IDX_inquiries_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE review ADD CONSTRAINT IDX_review_PK PRIMARY KEY (review_no);
ALTER TABLE review ADD CONSTRAINT IDX_review_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE comments ADD CONSTRAINT IDX_comments_PK PRIMARY KEY (comm_no);
ALTER TABLE comments ADD CONSTRAINT IDX_comments_FK0 FOREIGN KEY (inquiries_no) REFERENCES inquiries (inquiries_no);

