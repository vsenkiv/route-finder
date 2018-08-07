CREATE TABLE cityroute(
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    distance   FLOAT  NOT NULL,
    city VARCHAR(128) NOT NULL,
    destiny_city VARCHAR(128) NOT NULL,
    departure_time TIMESTAMP NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
);