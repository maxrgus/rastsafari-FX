PRAGMA encoding = "UTF-8";
DROP TABLE IF EXISTS Safari;
DROP TABLE IF EXISTS Booking;
DROP TABLE IF EXISTS Invoice;

CREATE TABLE Safari (
		id					integer PRIMARY KEY AUTOINCREMENT,
		safariLocationId	integer,
		date				varchar(10),
		hour				varchar(5),
		endHour				varchar(5),
		minParticipants		integer,
		maxParticipants		integer,
		price				integer,
		guideId				integer);

INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants, price, guideId)
VALUES (1, '2016-05-14', '07:00', '16:00',5 ,12, 1000, 1);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants, price, guideId)
VALUES (2, '2016-05-15', '07:00', '16:00',5, 12, 1450, 1);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants, price, guideId)
VALUES (3, '2016-05-14', '07:00', '16:00', 5, 7, 850, 2);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants, price, guideId)
VALUES (4, '2016-05-15', '07:00', '16:00', 5, 7, 599, 2);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants, price, guideId)
VALUES (8, '2016-05-15', '22:00', '05:00', 5, 14, 10000, 4);

CREATE TABLE Booking (
		bookingNr	integer PRIMARY KEY AUTOINCREMENT,
		customerId	integer,
		safariId	integer,
		priceIndex	integer,
		isPayed			integer);

INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (1, 5, 1, 1,1);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (2, 75, 2, 0.7,1);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (3, 123, 3, 0.7,1);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (4, 411, 2, 1,1);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (5, 24, 4, 1.2,0);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (6, 1, 1, 0.8,0);
INSERT INTO Booking (bookingNr, customerId, safariId, priceIndex, isPayed)
VALUES (7, 67, 2, 1.5,0);
