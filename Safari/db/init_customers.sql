DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customerCategory;

CREATE TABLE customer (
       id              integer PRIMARY KEY AUTOINCREMENT,
       customerCatID       integer,
       SSID                 varchar(15),
       givenName       varchar(50),
       familyName      varchar(50),
       email           varchar(50),
       phoneDay             varchar(10),
       phoneNight           varchar(10),
       username             varchar(50),
       password             varchar(50));
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Aida', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Elise', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Larsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Alexander', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Lina', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Malin', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Anna', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Knoxville', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Omar', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lina', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Anders', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anton', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Trygg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Lovisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Alexander', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Lina', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Aida', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Ferenc', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Malin', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nauti', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anders', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Emir', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Elise', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nauti', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Elise', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Max', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Max.Knoxville', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Anton', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lina', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Anna', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Anders', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Magnus', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Mancino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Peter', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Johanna', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gustafsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Klaudia', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gulevski', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Anders', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Lisa', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Nur', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Peter', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Max', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Max.Zafar', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Alexander', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Matilda', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Omar', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gustafsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Ferenc', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Trygg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Elise', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gunnarson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Max', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pettersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Anton', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Aida', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Nur', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lina', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lina', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gustafsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Lina', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Magnus', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Emir', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lisa', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Kålberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Peter', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Malin', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Elise', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Klaudia', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Nur', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Omar', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Matilda', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Kålberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Malin', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Lina', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Emir', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Lina', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Nyberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Lovisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Emir', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Zafar', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Peter', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Magnus', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Anton', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anton', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Anna', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Hadzic', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Lisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Anders', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Larsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Ferenc', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Gunnarson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Matilda', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Nur', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Matilda', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Zafar', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Omar', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Larsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Emir', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Aida', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Peter', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lina', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Anton', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nyberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Aida', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Zafar', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Nur', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kålberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Ferenc', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Nauti', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Anders', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Max', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Max.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Aida', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Knoxville', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Lisa', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Ferenc', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Dristig', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Anna', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Elise', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Hadzic', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lovisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Sandklef', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Nur', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Ali', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lovisa', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Max', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Max.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Matilda', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Klaudia', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gustafsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Max', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gulevski', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Aida', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Emir', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Emir', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pettersson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Johanna', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Nur', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Dristig', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anton', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Johanna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Dristig', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Omar', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Max', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Max.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Matilda', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Omar', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Max', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anton', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pacino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Malin', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Sandklef', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Aida', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Emir', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gulevski', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Lisa', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Zafar', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lovisa', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Nyberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Anders', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Kålberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Matilda', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Elise', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Klaudia', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Magnus', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Ferenc', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Malin', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Matilda', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Alexander', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nauti', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Nur', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Emir', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Knoxville', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Johanna', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Mancino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Johanna', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Nur', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gulevski', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Lisa', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Peter', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Omar', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Malin', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Emir', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Malin', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Anna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Elise', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Peter', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anders', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Max', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Alexander', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lina', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Trygg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Omar', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Alexander', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Emir', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Anna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Alexander', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Emir', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Mancino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Johanna', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gustafsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Lina', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Nyberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Max', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Max.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Klaudia', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Peter', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Omar', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Klaudia', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Omar', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Johanna', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lina', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Nyberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Alexander', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Aida', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Emir', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Ferenc', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Malin', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Anders', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Johanna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Omar', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Klaudia', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Malin', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Omar', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Malin', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Malin', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Lisa', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Alexander', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Anna', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Emir', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lovisa', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Klaudia', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Magnus', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Zafar', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Max', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Spjuth', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anders', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Anton', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Aida', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Alexander', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Elise', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gustafsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Emir', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Sandklef', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Klaudia', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Gulevski', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Max', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Max.Spjuth', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Anton', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Magnus', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lina', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Andersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Aida', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gunnarson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Alexander', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Anna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Elise', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Malin', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nyberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Johanna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Spjuth', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Magnus', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Matilda', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Dristig', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Malin', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Matilda', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Larsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Matilda', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Nur', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Ferenc', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anders', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Anton', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Peter', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Sandklef', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anton', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Kålberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Magnus', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Matilda', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Kålberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Nur', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Max', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Max.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Aida', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Alexander', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nauti', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lovisa', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Elise', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Aida', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Elise', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nyberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Anna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Magnus', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Aida', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Nur', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Kålberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Omar', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Anton', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nyberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Anton', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Magnus', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Lisa', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Mancino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Elise', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Nur', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Gustafsson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Max', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gunnarson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Emir', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Malin', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Elise', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Anna', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gulevski', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Lina', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pettersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Emir', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gustafsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Magnus', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Hadzic', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Aida', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Alexander', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Ali', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Matilda', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Gulevski', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Alexander', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Elise', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Aida', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Pettersson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Lovisa', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Lina', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kålberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Matilda', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Spjuth', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Emir', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Ferenc', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Klaudia', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Omar', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Hadzic', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lina', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Omar', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Nyberg', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lina', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Omar', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Spjuth', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lisa', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Anna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Spjuth', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Emir', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Magnus', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anders', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Kålberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Peter', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Nur', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Sandklef', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Matilda', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lovisa', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Anders', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Lovisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Sandklef', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Anders', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Kålberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Lovisa', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Kålberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Alexander', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Ferenc', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Hadzic', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Matilda', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Sandklef', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Anton', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Dristig', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Anders', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Nyberg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Elise', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lisa', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Sandklef', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Nur', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Max', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Trygg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anders', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Trygg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Elise', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Omar', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Anders', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Alexander', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Dristig', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Anna', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Gulevski', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Lina', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Hadzic', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Max', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Max.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Malin', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Sandklef', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Alexander', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Anders', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Peter', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Spjuth', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Alexander', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Zafar', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Elise', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Sandklef', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Max', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Max', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gunnarson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Matilda', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Alexander', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pettersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Malin', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Omar', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Nyberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Anders', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Gunnarson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lina', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Matilda', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Mancino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Malin', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Matilda', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Aida', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Anton', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Nur', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Ali', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Johanna', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Lisa', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Johanna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nyberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Matilda', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Omar', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Pacino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Elise', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Max', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Max.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Anton', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Andersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Ferenc', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Peter', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Lina', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Kålberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Alexander', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Mancino', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Emir', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Kålberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Matilda', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lovisa', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Malin', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Dristig', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Matilda', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Mancino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Max', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anna', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Knoxville', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Lina', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Lisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Elise', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Matilda', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Ali', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Max', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Max.Kålberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Emir', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lovisa', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Lovisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Lisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Anders', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Ali', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Magnus', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Kålberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Aida', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Sandklef', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Ferenc', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Lovisa', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Spjuth', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Klaudia', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Kålberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Max', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Max.Hadzic', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Anders', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Gustafsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Ferenc', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Ferenc', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Nyberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Max', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Max.Larsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Nur', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lina', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Klaudia', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Ali', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Magnus', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Johanna', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Alexander', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Pacino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Elise', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Hadzic', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Ferenc', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Gustafsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Anna', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Matilda', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Aida', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Pettersson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '550405-0849', 'Anton', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Trygg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '710103-9118', 'Alexander', 'Sandklef', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Sandklef', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Johanna', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Ali', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Johanna', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Spjuth', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Johanna', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Pettersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Anton', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Homoras', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Johanna', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Andersson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Anders', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Omar', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anders', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Dristig', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Alexander', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Alexander', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nyberg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Magnus', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Kålberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Anton', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Mancino', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Peter', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Homoras', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Lisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lisa.Trygg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Anders', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Zafar', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Aida', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Andersson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Anders', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Kålberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Max', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Max.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Matilda', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Lovisa', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gustafsson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Lina', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Anders', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Magnus', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Spjuth', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Johanna', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Dristig', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '770508-7323', 'Omar', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Klaudia', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Knoxville', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Elise', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Emir', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Gustafsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Magnus', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Gustafsson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Nur', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Klaudia', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '531009-0286', 'Elise', 'Ali', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Ali', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Aida', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Pacino', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Matilda', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Andersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '550405-0849', 'Lovisa', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Andersson', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Elise', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Mancino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Nur', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Larsson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Elise', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pacino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Peter', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nyberg', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '621025-5474', 'Max', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Max.Pacino', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Peter', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Gulevski', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Lovisa', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Larsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Ferenc', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Gustafsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '770508-7323', 'Anders', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Gunnarson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Lovisa', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gunnarson', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Aida', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Aida.Gunnarson', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Matilda', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '531009-0286', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Magnus', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Omar', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gulevski', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '710103-9118', 'Peter', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Peter.Nauti', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '550405-0849', 'Malin', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Nauti', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Nur', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Larsson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Omar', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Gunnarson', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Emir', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Emir.Andersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Anders', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Hadzic', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Max', 'Spjuth', 'spam@spam.se', '0102109000', '0733690437', 'Max.Spjuth', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '621025-5474', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Nur', 'Gustafsson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Gustafsson', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Anna', 'Zafar', 'spam@spam.se', '0102109000', '0733690437', 'Anna.Zafar', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Anton', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Nyberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Elise', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Hadzic', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Alexander', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '621025-5474', 'Magnus', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Knoxville', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Klaudia', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Nauti', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anton', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Kålberg', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '621025-5474', 'Elise', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pettersson', '621025-5474');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '690818-3186', 'Matilda', 'Hadzic', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Hadzic', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '690818-3186', 'Max', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Max.Mancino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '770508-7323', 'Omar', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Omar.Trygg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '531009-0286', 'Magnus', 'Larsson', 'spam@spam.se', '0102109000', '0733690437', 'Magnus.Larsson', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '710103-9118', 'Anton', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Gulevski', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '770508-7323', 'Klaudia', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Klaudia.Kålberg', '770508-7323');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Alexander', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Alexander.Nauti', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '550405-0849', 'Johanna', 'Nyberg', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Nyberg', '550405-0849');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Lina', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Dristig', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '690818-3186', 'Ferenc', 'Dristig', 'spam@spam.se', '0102109000', '0733690437', 'Ferenc.Dristig', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Johanna', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Anton', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anton.Homoras', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '660310-3091', 'Lovisa', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Trygg', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Anders', 'Kålberg', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Kålberg', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Nur', 'Pettersson', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Pettersson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '660310-3091', 'Nur', 'Nauti', 'spam@spam.se', '0102109000', '0733690437', 'Nur.Nauti', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '531009-0286', 'Matilda', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Pacino', '531009-0286');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '710103-9118', 'Johanna', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Johanna.Homoras', '710103-9118');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '690818-3186', 'Elise', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Elise.Pacino', '690818-3186');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '940517-2264', 'Lovisa', 'Mancino', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Mancino', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (2, '940517-2264', 'Lina', 'Gunnarson', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Gunnarson', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (4, '940517-2264', 'Malin', 'Trygg', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Trygg', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '660310-3091', 'Lovisa', 'Gulevski', 'spam@spam.se', '0102109000', '0733690437', 'Lovisa.Gulevski', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Anders', 'Homoras', 'spam@spam.se', '0102109000', '0733690437', 'Anders.Homoras', '940517-2264');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Lina', 'Knoxville', 'spam@spam.se', '0102109000', '0733690437', 'Lina.Knoxville', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (3, '660310-3091', 'Malin', 'Pacino', 'spam@spam.se', '0102109000', '0733690437', 'Malin.Pacino', '660310-3091');
INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,phoneDay,phoneNight,username,password)
VALUES (1, '940517-2264', 'Matilda', 'Andersson', 'spam@spam.se', '0102109000', '0733690437', 'Matilda.Andersson', '940517-2264');


CREATE TABLE customerCategory (
	id 	integer PRIMARY KEY AUTOINCREMENT,
	categoryName 	varchar(20),
	priceIndex 	integer);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Student',0.9);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Pensionär',0.8);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Lennart',999);
INSERT INTO customerCategory (categoryName, priceIndex) VALUES ('Bill gates',0);
