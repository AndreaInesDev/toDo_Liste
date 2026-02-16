CREATE TABLE tasks (
        id int PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        completed BOOLEAN DEFAULT FALSE,
        user_id BIGINT NOT NULL
);