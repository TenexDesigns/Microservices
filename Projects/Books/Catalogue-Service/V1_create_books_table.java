  CREATE TABLE  IF NOT EXISTS books (
       id SERIAL PRIMARY KEY,
       title VARCHAR(255) NOT NULL,
   author VARCHAR(255) UNIQUE NOT NULL,
    price DECIMAL,
        stock INTEGER
        );
