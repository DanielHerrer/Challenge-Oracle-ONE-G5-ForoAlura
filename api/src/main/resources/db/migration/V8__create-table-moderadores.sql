CREATE TABLE moderadores (
    id BIGINT NOT NULL AUTO_INCREMENT,
    username VARCHAR(300) NOT NULL UNIQUE,
    password VARCHAR(300) NOT NULL,

    PRIMARY KEY (id)
);