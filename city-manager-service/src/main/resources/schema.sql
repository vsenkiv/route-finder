CREATE TABLE cityroute(
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    city VARCHAR(128) NOT NULL,
    destiny_city VARCHAR(128) NOT NULL,
    departure_time TIMESTAMP NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    distance   FLOAT  NOT NULL,
    PRIMARY KEY (id)
);