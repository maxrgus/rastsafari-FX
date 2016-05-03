PRAGMA encoding = "UTF-8";
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customerCategory;

CREATE TABLE customer (
       id    		    integer PRIMARY KEY	AUTOINCREMENT,
       customerCatID	    integer,
       SSID                 varchar(15),
       givenName	    varchar(50),
       familyName	    varchar(50),
       email    	    varchar(50),
       phoneDay             varchar(10),
       phoneNight           varchar(10),
       username             varchar(50),
       password             varchar(50));
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Klaudia', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anders', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Trygg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Lovisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kï¿½lberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Lisa', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Lina', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Magnus', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lina', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Omar', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Knoxville', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lovisa', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Lina', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Andersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Nur', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Dristig', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Ferenc', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Matilda', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Spjuth', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Nur', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Emir', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Matilda', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Anton', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Max', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Max.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lovisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kï¿½lberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Anton', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Elise', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Aida', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Lina', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Ali', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Malin', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Nur', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anna', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Matilda', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Alexander', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Johanna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Ferenc', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Mancino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Elise', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anton', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Elise', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Elise', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Elise', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Elise', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Mancino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Ferenc', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Elise', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Klaudia', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Zafar', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anders', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Omar', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Matilda', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Lovisa', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Knoxville', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Alexander', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Omar', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Emir', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Kï¿½lberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Matilda', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Max', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Magnus', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Peter', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Max', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Max.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Ferenc', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Max', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Max.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Ferenc', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Alexander', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Anders', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lovisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Matilda', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Peter', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Max', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Max.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Anton', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Zafar', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Klaudia', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lina', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lovisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kï¿½lberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Peter', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Emir', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Mancino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Klaudia', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Matilda', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Nur', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Zafar', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Klaudia', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Elise', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Anna', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Anders', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Knoxville', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Johanna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Ferenc', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Sandklef', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Nur', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anders', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Magnus', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Andersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Nur', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kï¿½lberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Magnus', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lisa', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Nur', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lovisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Ferenc', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Pettersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Anna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Matilda', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Peter', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Zafar', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Ferenc', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Elise', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Aida', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Hadzic', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Emir', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Nyberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Johanna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Aida', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Aida', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Ferenc', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lina', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pettersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lina', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Ferenc', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Peter', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Kï¿½lberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Anna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Alexander', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Magnus', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Andersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lovisa', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Ferenc', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Lovisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kï¿½lberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Nur', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Anders', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Trygg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Aida', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Pettersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Max', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Max.Knoxville', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Klaudia', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Peter', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Kï¿½lberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Malin', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Omar', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Emir', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Lina', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lovisa', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Magnus', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Nur', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kï¿½lberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Emir', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Zafar', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Klaudia', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Kï¿½lberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Elise', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Nur', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Lisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Aida', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Anton', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anders', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Gustafsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Aida', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Matilda', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Lina', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Andersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lovisa', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Omar', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Alexander', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lina', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Spjuth', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Anton', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Anders', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Elise', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Lina', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Elise', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Aida', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Malin', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Knoxville', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Malin', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Matilda', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Malin', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Emir', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Trygg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Johanna', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Elise', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anders', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Emir', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Aida', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Magnus', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gulevski', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Nur', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Elise', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gustafsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Magnus', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Dristig', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Nur', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Anna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Larsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Matilda', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Spjuth', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Emir', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Ferenc', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Kï¿½lberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Malin', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Aida', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Malin', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lovisa', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Anna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Magnus', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Nauti', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Elise', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nyberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Klaudia', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Kï¿½lberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Elise', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Emir', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lovisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kï¿½lberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Lovisa', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Matilda', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Nur', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Emir', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pettersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lovisa', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Matilda', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Ferenc', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Peter', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Alexander', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Max', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Max.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Alexander', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Spjuth', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Omar', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Magnus', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Lina', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Max', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Matilda', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Magnus', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Anna', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Nur', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lisa', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Elise', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Aida', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Lisa', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Johanna', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Max', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pettersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Elise', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Lisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Lisa', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Zafar', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lisa', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Hadzic', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Elise', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Kï¿½lberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Anton', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Johanna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gulevski', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Max', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Max.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Emir', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Nur', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Matilda', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Max', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Trygg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Malin', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Anders', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Ferenc', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Malin', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Zafar', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Aida', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Max', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Max.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Johanna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Larsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Lina', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lina', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Aida', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Anton', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Johanna', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Nur', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Matilda', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Peter', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Malin', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Alexander', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Kï¿½lberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Johanna', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Malin', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nauti', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Lisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Spjuth', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Aida', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Dristig', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Kï¿½lberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Emir', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Anna', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Nur', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Zafar', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lina', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Peter', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Anton', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Magnus', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Emir', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Lina', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Ferenc', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Knoxville', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Klaudia', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Alexander', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Johanna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Emir', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Johanna', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Magnus', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Anton', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Peter', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Dristig', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Lisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Andersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Lovisa', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anna', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Knoxville', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Peter', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Omar', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Max', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Max.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Magnus', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Nur', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Hadzic', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Elise', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Trygg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Aida', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Johanna', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Lovisa', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Zafar', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lina', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Sandklef', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Lovisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Emir', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Peter', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Omar', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Trygg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Malin', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Mancino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Anna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Larsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Johanna', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Malin', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Emir', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Magnus', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Lina', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Emir', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Sandklef', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Omar', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Homoras', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Emir', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Kï¿½lberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Max', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Max.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Klaudia', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Elise', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Ferenc', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Emir', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Matilda', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anton', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Hadzic', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Nur', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kï¿½lberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Peter', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Emir', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Johanna', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Trygg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Anna', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Alexander', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Elise', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Trygg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Max', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Max.Knoxville', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anton', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Alexander', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lovisa', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Ferenc', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Malin', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Pettersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Elise', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Kï¿½lberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Peter', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Max', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gulevski', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Johanna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Lisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Kï¿½lberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Max', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Malin', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Nur', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Anna', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Matilda', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Johanna', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Lisa', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Peter', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Max', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lovisa', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Anna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Aida', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Homoras', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Johanna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nyberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anton', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Matilda', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Lovisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Peter', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Elise', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Malin', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Aida', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Max', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gulevski', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anton', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Anton', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Nur', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Knoxville', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Max', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Aida', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Pettersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Max', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Max.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Magnus', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Anton', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anton', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Nur', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Ferenc', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Hadzic', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Alexander', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Elise', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Sandklef', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Johanna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Lovisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Spjuth', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Malin', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Mancino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Alexander', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Anders', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Omar', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Andersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Aida', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Elise', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lovisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Homoras', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anders', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Nyberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Klaudia', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Sandklef', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Malin', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Hadzic', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Elise', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Malin', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nyberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Matilda', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Peter', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Max', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Aida', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lina', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Zafar', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Klaudia', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Magnus', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Nauti', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Anders', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Malin', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lina', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Magnus', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Kï¿½lberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Klaudia', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Trygg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Johanna', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Malin', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Ali', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Max', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Anders', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Emir', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Dristig', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anna', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Lisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Omar', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Lovisa', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anders', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Nur', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gustafsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Malin', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gulevski', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Nur', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kï¿½lberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Anna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Lovisa', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Alexander', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Alexander', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Andersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lovisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Elise', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Elise', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Sandklef', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Omar', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Anton', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Max', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Max.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Anton', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Mancino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Max', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Max.Spjuth', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Malin', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Johanna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gunnarson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Ferenc', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Kï¿½lberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Emir', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Emir', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Lisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pettersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Max', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Max.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lina', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Alexander', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Aida', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Matilda', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Homoras', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Lovisa', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gulevski', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Lisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Malin', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Zafar', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Aida', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Klaudia', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Peter', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Johanna', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Matilda', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Mancino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Elise', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Andersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Nur', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Nur', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Peter', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Anders', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anton', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Gulevski', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Johanna', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Matilda', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lisa', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Klaudia', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Knoxville', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Lina', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Dristig', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Aida', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Emir', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lisa', 'Kï¿½lberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Kï¿½lberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anton', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Trygg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Johanna', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Malin', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Aida', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Elise', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Anton', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Elise', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Malin', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gulevski', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Max', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Max.Hadzic', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Anna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Elise', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '770508-7323');


CREATE TABLE customerCategory (
	id 	integer PRIMARY KEY AUTOINCREMENT,
	categoryName 	varchar(20),
	priceIndex 	integer);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Student',0.9);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Pension�r',0.8);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Lennart',999);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Bill gates',0);
