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
		maxParticipants		integer);
		
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants)
VALUES (1, '2016-04-28', '13:00', '15:30',2 ,5);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants)
VALUES (2, '2016-05-02', '11:00', '12:45',5, 25);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants)
VALUES (3, '2012-12-12', '12:12', '12:13', 1, 5);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants)
VALUES (4, '2016-09-16', '18:00', '22:30', 7, 10);
INSERT INTO Safari (safariLocationId, date, hour, endHour, minParticipants, maxParticipants)
VALUES (8, '2020-05-06', '24:00', '03:00', 23, 60);

CREATE TABLE Booking (
		bookingNr	integer PRIMARY KEY,
		customerId	integer,
		calendarId	integer,
		invoiceNr	integer,
		priceIndex	integer);
		
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (1, 5, 23, 001, 1);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (12, 75, 283, 002, 0.7);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (555, 934, 20023, 002, 0.7);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (56564, 78235, 238563, 003, 1);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (24565, 47695, 496723, 004, 1.2);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (661123, 56171, 98765, 005, 0.8);
INSERT INTO Booking (bookingNr, customerId, calendarId, invoiceNr, priceIndex)
VALUES (33344, 66622, 12345, 006, 1.5);

CREATE TABLE Invoice (
		invoiceNr	integer PRIMARY KEY,
		bookingNr	integer,
		customerId	integer);
		
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (001, 55622, 23343);
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (002, 9989285, 233453);
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (003, 35685, 29353);
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (004, 35675, 283563);
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (005, 35675, 357623);
INSERT INTO Invoice (invoiceNr, bookingNr, customerId)
VALUES (006, 4685, 246783);
