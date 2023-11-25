INSERT INTO user_table ( name, email, password, age, assignedSeat, payment_id, isFoodBought, film_id, food_id) VALUES ( 'Jorge Ruiz', 'jorge.ruiz@gmail.com', 'TSI98La', 34, 'H5', 2, false, 1, 1);
INSERT INTO user_table ( name, email, password, age, assignedSeat, payment_id, isFoodBought, film_id, food_id) VALUES ( 'Sarah Paulson', 'sarah.pl@gmail.com', 'JSDU789n', 45, 'B12', 5, true, 2, 2);
INSERT INTO user_table ( name, email, password, age, assignedSeat, payment_id, isFoodBought, film_id, food_id) VALUES ( 'Alex Martinez', 'alec.mar@gmail.com', 'lkY78H', 23, 'I7', 1, false, 3, 3);

INSERT INTO admin_table ( adminName, adminEmail, adminPassword, authNumber) VALUES ( 'Rodrigo Lopez', 'jorge.lopez@cine.com', 'lshns09', 23028);
INSERT INTO admin_table ( adminName, adminEmail, adminPassword, authNumber) VALUES ( 'Diana Mendez', 'diana.mdz@cine.com', 'jyajl92', 12390);
INSERT INTO admin_table ( adminName, adminEmail, adminPassword, authNumber) VALUES ( 'Martina Luna', 'martina.luna@cine.com', 'nuj98lo', 40124);

INSERT INTO film_table ( filmName, description, rating, priceTicket, isParentalGuideNeeded, user_id) VALUES ( 'Alien', 'In the space, no one can hear you scream', 'R', 12.99, true, 1);
INSERT INTO film_table ( filmName, description, rating, priceTicket, isParentalGuideNeeded, user_id) VALUES ( 'Funny Games', 'Why in the movies we cheer for the villains to kil our protagonist', 'NC-17', 8.99, true, 2);
INSERT INTO film_table ( filmName, description, rating, priceTicket, isParentalGuideNeeded, user_id) VALUES ( 'Wish', 'The 100th Disney movie', 'PG', 10.99, false, 3);

INSERT INTO payment_table ( userName, userAddress, bankAccountName, cardNumber, CVV, amountCharged, user_id) VALUES ( 'Jorge Ruiz', 'Paseo de la Vista #165', 'Scotiabank', 23901600, 237, 12.99, 1);
INSERT INTO payment_table ( userName, userAddress, bankAccountName, cardNumber, CVV, amountCharged, user_id) VALUES ( 'Sarah Paulson', 'Via Alta #1443', 'BBVA', 67541600, 345, 8.99, 2);
INSERT INTO payment_table ( userName, userAddress, bankAccountName, cardNumber, CVV, amountCharged, user_id) VALUES ( 'Alex Martinez', 'Monte Parnazo #16', 'Citi', 78201600, 237, 10.99, 3);