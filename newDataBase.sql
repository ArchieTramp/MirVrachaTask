DROP TABLE IF EXISTS MirVrachaDB;
CREATE TABLE MirVrachaDB
(
    id       bigserial primary key,
    paragraph varchar(256) NOT NULL
);
