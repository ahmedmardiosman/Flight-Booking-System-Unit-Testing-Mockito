


INSERT INTO Users (customer_id, userName, firstName, secondName, adressLine1, adressLine2, townOrCity, postcode, telephoneNumber, email, password) VALUES (1, 'ahmedosman', 'Ahmed', 'Osman', '3 Northampton Road', '', 'Northampton', 'NN4 5DH' ,'07542563587', 'ahmedo@outlook.com', 'ahmedosman')
INSERT INTO Users (customer_id, userName, firstName, secondName, adressLine1, adressLine2, townOrCity, postcode, telephoneNumber, email, password) VALUES (2, 'adonayg', 'Adonay', 'Ghebremedhin', '4 Manchester Road', 'Media City', 'Manchester','M50 2BB' ,'07254196875', 'adonayg@btinternet.com', 'adonayg')
INSERT INTO Users (customer_id, userName, firstName, secondName, adressLine1, adressLine2, townOrCity, postcode, telephoneNumber, email, password) VALUES (3, 'adilooz', 'Adil', 'Ozzerally', '3 London Road', 'Peckham', 'London','E1 4NS' ,'07698587451', 'adilozz@gmail.com', 'adilooz')


INSERT INTO FlightDetails ( flightId, customer_Id, destinationCountry, destinationCity, priceOfFlight, cardNumber, expiryDate, cvv) VALUES (1, 1, 'Egypt', 'Cairo', '3421', '9856452145328756', '08/2019', '454')
INSERT INTO FlightDetails ( flightId, customer_Id, destinationCountry, destinationCity, priceOfFlight, cardNumber, expiryDate, cvv) VALUES (2, 1, 'France', 'Paris', '234', '5874586352145235', '03/2020', '685')
INSERT INTO FlightDetails ( flightId, customer_Id, destinationCountry, destinationCity, priceOfFlight, cardNumber, expiryDate, cvv) VALUES (3, 2, 'Japan', 'Tokyo', '6242', '2547874514214425', '05/2021', '985')
INSERT INTO FlightDetails ( flightId, customer_Id, destinationCountry, destinationCity, priceOfFlight, cardNumber, expiryDate, cvv) VALUES (4, 2, 'Germany', 'Berlin', '533', '9865471214547854', '05/2022', '536')


INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (1, 'Germany', 'Berlin', '932', '100')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (2, 'Japan', 'Tokyo', '9569', '1000')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (3, 'Egypt', 'Cairo', '3515', '500')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (4, 'France', 'Paris', '343', '80')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (5, 'Australia', 'Sydney', '17000', '1400')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (6, 'Brazil', 'Rio de Janeiro', '8807', '860')
INSERT INTO FlightDestinations ( destinationId, destCountry, destCity, destDistance, destPrice ) VALUES (7, 'Mauritius', 'Port Louis', '9744', '920')



INSERT INTO AdminAccounts ( adminId, adminName, password) VALUES (1, 'Ahmed Osman', 'ahmedmardiosman')
INSERT INTO AdminAccounts ( adminId, adminName, password) VALUES (2, 'Adil Ozzerally', 'adiloz')
INSERT INTO AdminAccounts ( adminId, adminName, password) VALUES (3, 'Adonay G', 'adonayg')


