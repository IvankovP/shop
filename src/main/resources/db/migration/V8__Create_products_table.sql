CREATE TABLE products
(
    id SERIAL PRIMARY KEY NOT NULL,
    article INTEGER,
    name CHARACTER VARYING (100) NOT NULL,
    description CHARACTER VARYING (1000),
    price NUMERIC(9,2) DEFAULT 0.0 NOT NULL,
    discount_percentage INTEGER DEFAULT 0 NOT NULL,
    new_arrival BOOLEAN DEFAULT FALSE,
    deleted BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);