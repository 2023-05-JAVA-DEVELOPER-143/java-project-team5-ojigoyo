DROP TABLE board_reply CASCADE CONSTRAINTS;
DROP TABLE booking CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE room CASCADE CONSTRAINTS;
DROP TABLE roon_Type CASCADE CONSTRAINTS;
DROP TABLE userInfo CASCADE CONSTRAINTS;

CREATE TABLE userInfo(
		user_id                       		VARCHAR2(10)		 NULL ,
		user_password                 		VARCHAR2(10)		 NOT NULL,
		user_name                     		VARCHAR2(20)		 NOT NULL,
		user_email                    		VARCHAR2(10)		 NOT NULL,
		user_phone                    		VARCHAR2(10)		 NOT NULL,
		user_address                  		VARCHAR2(10)		 NOT NULL,
		user_gender                   		CHAR(1)		 NOT NULL,
		user_birthdate                		DATE		 NOT NULL
);


CREATE TABLE roon_Type(
		room_type_no                  		NUMBER(10)		 NULL 
);

DROP SEQUENCE roon_Type_room_type_no_SEQ;

CREATE SEQUENCE roon_Type_room_type_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER roon_Type_room_type_no_TRG
BEFORE INSERT ON roon_Type
FOR EACH ROW
BEGIN
IF :NEW.room_type_no IS NOT NULL THEN
  SELECT roon_Type_room_type_no_SEQ.NEXTVAL INTO :NEW.room_type_no FROM DUAL;
END IF;
END;


CREATE TABLE room(
		room_no                       		NUMBER(10)		 NULL ,
		room_type_no                  		NUMBER(10)		 NULL 
);

DROP SEQUENCE room_room_no_SEQ;

CREATE SEQUENCE room_room_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER room_room_no_TRG
BEFORE INSERT ON room
FOR EACH ROW
BEGIN
IF :NEW.room_no IS NOT NULL THEN
  SELECT room_room_no_SEQ.NEXTVAL INTO :NEW.room_no FROM DUAL;
END IF;
END;


CREATE TABLE board(
		board_no                      		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(10)		 NULL ,
		board_title                   		VARCHAR2(10)		 NOT NULL,
		board_content                 		VARCHAR2(10)		 NOT NULL,
		board_write_date              		DATE		 DEFAULT sysdate		 NULL ,
		reply_no                      		NUMBER(10)		 NULL 
);

DROP SEQUENCE board_board_no_SEQ;

CREATE SEQUENCE board_board_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER board_board_no_TRG
BEFORE INSERT ON board
FOR EACH ROW
BEGIN
IF :NEW.board_no IS NOT NULL THEN
  SELECT board_board_no_SEQ.NEXTVAL INTO :NEW.board_no FROM DUAL;
END IF;
END;


CREATE TABLE booking(
		booking_no                    		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE booking_booking_no_SEQ;

CREATE SEQUENCE booking_booking_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER booking_booking_no_TRG
BEFORE INSERT ON booking
FOR EACH ROW
BEGIN
IF :NEW.booking_no IS NOT NULL THEN
  SELECT booking_booking_no_SEQ.NEXTVAL INTO :NEW.booking_no FROM DUAL;
END IF;
END;


CREATE TABLE board_reply(
		reply_no                      		NUMBER(10)		 NULL ,
		reply_title                   		VARCHAR2(10)		 NOT NULL,
		reply_content                 		VARCHAR2(10)		 NOT NULL,
		reply_write_date              		DATE		 DEFAULT sysdate		 NULL ,
		board_no                      		NUMBER(10)		 NULL 
);

DROP SEQUENCE board_reply_reply_no_SEQ;

CREATE SEQUENCE board_reply_reply_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER board_reply_reply_no_TRG
BEFORE INSERT ON board_reply
FOR EACH ROW
BEGIN
IF :NEW.reply_no IS NOT NULL THEN
  SELECT board_reply_reply_no_SEQ.NEXTVAL INTO :NEW.reply_no FROM DUAL;
END IF;
END;



ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (user_id);

ALTER TABLE roon_Type ADD CONSTRAINT IDX_roon_Type_PK PRIMARY KEY (room_type_no);

ALTER TABLE room ADD CONSTRAINT IDX_room_PK PRIMARY KEY (room_no);
ALTER TABLE room ADD CONSTRAINT IDX_room_FK0 FOREIGN KEY (room_type_no) REFERENCES roon_Type (room_type_no);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (board_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE booking ADD CONSTRAINT IDX_booking_PK PRIMARY KEY (booking_no);
ALTER TABLE booking ADD CONSTRAINT IDX_booking_FK0 FOREIGN KEY (user_id) REFERENCES userInfo (user_id);

ALTER TABLE board_reply ADD CONSTRAINT IDX_board_reply_PK PRIMARY KEY (reply_no);
ALTER TABLE board_reply ADD CONSTRAINT IDX_board_reply_FK0 FOREIGN KEY (board_no) REFERENCES board (board_no);

