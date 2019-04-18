DROP TABLE  IF EXISTS user;

CREATE TABLE user  (
    user_id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    user_name VARCHAR(20),
    address VARCHAR(20),
    birth Date,
    gender varchar(1)
);