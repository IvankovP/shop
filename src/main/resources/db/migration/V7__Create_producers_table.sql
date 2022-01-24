CREATE TABLE producers
(
    id SERIAL PRIMARY KEY NOT NULL,
    name CHARACTER VARYING (100) NOT NULL,
    deleted BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);