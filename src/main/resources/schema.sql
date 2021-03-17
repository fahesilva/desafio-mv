CREATE SEQUENCE PERSON_SQ
  MINVALUE 1
  MAXVALUE 9999999999999999
  START WITH 1
  INCREMENT BY 100
  CACHE 100;

 insert into person ('id', 'name', 'type', 'document_number', 'created_at','email') values
 (PERSON_SQ.nextval, 'Hernane', 'FISICO', '00000000000', 'sysdate', 'a@a.com'); 