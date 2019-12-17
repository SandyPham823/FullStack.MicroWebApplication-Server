SET sql_notes = 0;      -- Temporarily disable the "Table already exists" warning

CREATE TABLE IF NOT EXISTS chat_user_profile(
    PROFILE_ID BIGINT (11) NOT NULL AUTO_INCREMENT,
    USER_NAME VARCHAR (255),
    STATE VARCHAR (255),
    BIO VARCHAR (255),
    USER_PICTURE LONGBLOB
    PRIMARY KEY (PROFILE_ID)
);

CREATE TABLE IF NOT EXISTS chat_users(
    USER_ID BIGINT (11) NOT NULL AUTO_INCREMENT,
    FIRST_NAME VARCHAR (255) NOT NULL,
    LAST_NAME VARCHAR (255) NOT NULL,
    EMAIL VARCHAR (255) NOT NULL,
    USER_NAME VARCHAR (255) NOT NULL,
    USER_PWD VARCHAR (255) NOT NULL,
    PRIMARY KEY (USER_ID)
    CONSTRAINT FK_PROFILE FOREIGN KEY (PROFILE_ID) REFERENCES chat_user_profile(PROFILE_ID)
);

CREATE TABLE IF NOT EXISTS chat_groups(
    GROUP_ID BIGINT (11) NOT NULL AUTO_INCREMENT,
    NAME VARCHAR (255)
);

-- O IS FALSE AND 1 IS TRUE IN MYSQL
CREATE TABLE IF NOT EXISTS users_groups(
    GROUP_ID BIGINT (11) NOT NULL,
    USER_ID BIGINT (11) NOT NULL,
    MODERATOR BOOLEAN NOT NULL DEFAULT 0,
    ADMIN BOOLEAN NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS chat_messages(
    MSG_ID BIGINT (11) NOT NULL AUTO_INCREMENT,
    GROUP_ID BIGINT (11) NOT NULL,
    USER1_ID BIGINT (11) NOT NULL,
    USER2_ID BIGINT (11) NOT NULL DEFAULT 0,
    MSG_TIMESTAMP TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    MESSAGE VARCHAR (255) NOT NULL
);


SET sql_notes = 1;      -- And then re-enable the warning again