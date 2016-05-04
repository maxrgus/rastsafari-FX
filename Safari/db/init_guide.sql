PRAGMA encoding = "UTF-8";
DROP TABLE if EXISTS guide;

CREATE TABLE guide (
  id            integer PRIMARY KEY AUTOINCREMENT,
  givenName     varchar(50),
  familyName    varchar(50),
  email         varchar(50));

INSERT INTO guide (givenName,familyName,email)
VALUES ('Sune','Simming','max.r.gus@gmail.com');

INSERT INTO guide (givenName,familyName,email)
VALUES ('Bengt','Birkerud','max.r.gus@gmail.com');

INSERT INTO guide (givenName,familyName,email)
VALUES ('Lars','Lasander','max.r.gus@gmail.com');

INSERT INTO guide (givenName,familyName,email)
VALUES ('Hilma','Halmesjö','max.r.gus@gmail.com');
