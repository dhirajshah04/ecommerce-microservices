-- V3__alter_users_id_to_bigserial.sql
ALTER TABLE users
    ALTER COLUMN id DROP DEFAULT;

DROP SEQUENCE IF EXISTS users_id_seq;

ALTER TABLE users
    ALTER COLUMN id SET DATA TYPE BIGINT;

CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    OWNED BY users.id;

ALTER TABLE users
    ALTER COLUMN id SET DEFAULT nextval('users_id_seq');

SELECT setval('users_id_seq', COALESCE((SELECT MAX(id) FROM users), 1), false);