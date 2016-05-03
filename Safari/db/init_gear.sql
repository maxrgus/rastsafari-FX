DROP TABLE IF EXISTS gear;
DROP TABLE IF EXISTS gearStock;

CREATE TABLE gear (
  id            integer PRIMARY KEY AUTOINCREMENT,
  gearName      varchar(50),
  description   varchar(50));

INSERT INTO gear (gearName,description)
VALUES ('Flugfiskespö', 'Modell TMC');
INSERT INTO gear (gearName,description)
VALUES ('Sovsäck', '175cm');
INSERT INTO gear (gearName,description)
VALUES ('Sovsäck', '185cm');
INSERT INTO gear (gearName,description)
VALUES ('Tält', '3man');
INSERT INTO gear (gearName,description)
VALUES ('Havsspö', 'Modell THC');

CREATE TABLE gearStock (
  gid           integer PRIMARY KEY,
  amount        integer);

INSERT INTO gearStock
VALUES (1,4);
INSERT INTO gearStock
VALUES (2,8);
INSERT INTO gearStock
VALUES (3,6);
INSERT INTO gearStock
VALUES (4,2);
