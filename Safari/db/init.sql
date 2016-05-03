PRAGMA encoding = "UTF-8";
DROP TABLE IF EXISTS safariLocation;
DROP TABLE if EXISTS gearReq;

CREATE TABLE safariLocation (
       id    		    integer PRIMARY KEY	AUTOINCREMENT,
       locationName	    varchar(50),
       description	    varchar(50),
       location		    varchar(21),
       minParticipants	    integer,
       maxParticipants	    integer,
       isActive             integer);

INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Storsjön', 'Laxfiske', '59.1234459,12.1212122', 4, 8, 1);
INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Storsjön', 'Äringsfiske', '59.1234459,12.1212122', 6, 12, 1);
INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Svartetjörn', 'Gäddfiske', '59.1234459,12.1212122', 8, 16, 1);
INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Svartetjörn', 'Metning för barn', '59.1234459,12.1212122', 8, 16, 1);
INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Gunnliseå', 'Flugfiske', '59.1234459,12.1212122', 5, 10, 1);
INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive)
VALUES ('Långån', 'Kanotsafari', '59.1234459,12.1212122', 3, 6, 1);

CREATE TABLE gearReq (
       sid		integer,
       gid		integer);

INSERT INTO gearReq VALUES (1,3);
INSERT INTO gearReq VALUES (1,2);
INSERT INTO gearReq VALUES (2,3);
INSERT INTO gearReq VALUES (2,14);
INSERT INTO gearReq VALUES (3,4);
INSERT INTO gearReq VALUES (4,19);
INSERT INTO gearReq VALUES (5,22);
INSERT INTO gearReq VALUES (6,13);
INSERT INTO gearReq VALUES (6,46);
