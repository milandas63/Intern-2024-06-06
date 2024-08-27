
USE Medicine;

DROP TABLE IF EXISTS manufacture;
CREATE TABLE manufacture (
  mfr_id 	varchar(100) NOT NULL ,
  mfr_name 	varchar(100) NOT NULL,
  mfr_abbr 	varchar(100) NOT NULL,
  headoffice 	varchar(20) NOT NULL,
  contact 	varchar(100) NOT NULL,
  pin 		varchar(10) NOT NULL,
  PRIMARY KEY (mfr_id)
);

LOCK TABLES manufacture WRITE;
INSERT INTO manufacture(mfr_id,mfr_name,mfr_abbr,headoffice,contact,pin) VALUES 
	('1','Sun Pharmaceutical Industries','SUN','BBSR','8328881857','750565'),	
	('2','Biocon Limited','BIOCON','Kolkata','8928881757','750665'),	
	('3','Abbott India Ltd.', 'ABBOTT','Mumbai','4580881857','778567'),									
	('4','Biophar Lifesciences Pvt. Ltd.','BIOPHAR','BBSR','632587945','752063');
UNLOCK TABLES;

DROP TABLE IF EXISTS product;
CREATE TABLE product (
  pr_id varchar(11) NOT NULL, #AUTO_INCREMENT,
  pr_name varchar(100) NOT NULL,
  batch_num varchar(50) NOT NULL,
  mrp varchar(200) NOT NULL,
  #exp_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  mfr_id varchar(100) DEFAULT NULL REFERENCES manufacture(mfr_id),
  PRIMARY KEY (pr_id)
);

LOCK TABLES product WRITE;
INSERT INTO product(pr_id,pr_name,batch_num,mrp,mfr_id) VALUES (1,'Alverine','A-32',23,1),
									(2,'Bisacody','CD-2',45,2),
									(3,'Cetirizine','AB-32',60,3),
									(4,'Ciprofloxacin','Zz-r',12,1);
UNLOCK TABLES;


select p.mfr_id,m.mfr_name from product as p left join manufacture as m on p.mfr_id=m.mfr_id where p.mfr_id=2;


DROP TABLE IF EXISTS user;
CREATE TABLE user (
  UserId varchar(100) NOT NULL,
  Name varchar(100) DEFAULT NULL,
  Phone varchar(100) NOT NULL,
  Email varchar(100) DEFAULT NULL,
  Password varchar(100) NOT NULL,
  PRIMARY KEY (UserId),
  UNIQUE KEY Phone (Phone)
);
 
 insert into user values ('Nigam@1','Nigamanda pradhan','9338545678','nigam@gmail.com','nigam'),
                          ('Biswajit@123','Biswajit Panigrahi','832881857','biswajitpanigrahi108@gmail.com','biswajit@123'),
                          ('Ram','Ramchandara Thakur','3338545678','thakur@gmail.com','thakur');


SELECT 'TranType';
DROP TABLE IF EXISTS trantype;
CREATE TABLE IF NOT EXISTS trantype(
    tt_id           INT(6)              NOT NULL AUTO_INCREMENT,
    tt_desc         VARCHAR(50)         NOT NULL UNIQUE,
    tt_action       ENUM('+','-','=')   NOT NULL,
    
    PRIMARY KEY(tt_id)
);
INSERT INTO trantype VALUES
    ( 1, 'Opening Stock',                '+'),
    ( 2, 'Purchase',                     '+'),
    ( 3, 'Salable Return from Customer', '+'),
    ( 4, 'Expiry Return from Customer',  '='),
    ( 5, 'Expiry Return to Company',     '-'),
    ( 6, 'Replacement from Company',     '+'),
    ( 7, 'Return from Company',          '+'),
    ( 8, 'Sales',                        '-'),
    ( 9, 'Breakage & Expiry',            '-'),
    (10, 'Burglary & Theft',             '-');

DROP TABLE IF EXISTS salesArea;
CREATE TABLE IF NOT EXISTS salesArea(
    sarea_id            INT(6)              NOT NULL AUTO_INCREMENT,
    sarea_name          VARCHAR(50)         NOT NULL UNIQUE,
    sarea_abbr          VARCHAR(10)         UNIQUE,
    distance            DOUBLE(8,2),      
    PRIMARY KEY(sarea_id)
);
INSERT INTO salesArea VALUES
    (1, "Bhubaneswar", "BBSR", 0.00),
    (2, "Cuttack",     "CTC",  0.00),
    (3, "Berhampur",   "BM",   0.00),
    (4, "Balasore",    "BL",   0.00),
    (5, "Sambalpur",   "SBP",  0.00),
    (6, "Balangir",    "BGL",  0.00),
    (7, "Puri",        "PU",   0.00);

DROP TABLE IF EXISTS party;
CREATE TABLE IF NOT EXISTS party(
    party_id            INT(6)              NOT NULL AUTO_INCREMENT,
    sarea_id            INT(6)              DEFAULT NULL REFERENCES salesArea(sarea_id), 
    party_name          VARCHAR(50)         NOT NULL UNIQUE,
    party_dlno          VARCHAR(20)         DEFAULT NULL,
    party_gst           VARCHAR(20)         DEFAULT NULL,
    PRIMARY KEY(party_id)
);

INSERT INTO party VALUES
    (1, 2, "Opening Stock",NULL,NULL),
    (2, 3, "Jyoti Pharmaceuticals","2324L/2325DL", "29AAACH7409R1ZX"),
    (3, 7, "Santuka Pharmaceuticals","4374L/4375DL", "36AAACH7409R1Z2"),
    (4, 1, "Nicolas Pharmaceuticals","5153L/5154DL", "33AAACH7409R1Z8");

select s.sarea_name from party as p left join salesArea as s on p.sarea_id=s.sarea_id where p.party_id=2;


