CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE event (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(255) NOT NULL,
    img_url TEXT NOT NULL,
    event_url TEXT NOT NULL,
    date TIMESTAMP NOT NULL,
    remote BOOLEAN NOT NULL
);