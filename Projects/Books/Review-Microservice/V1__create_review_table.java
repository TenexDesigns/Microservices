 CREATE TABLE  IF NOT EXISTS reviews (
        id SERIAL PRIMARY KEY,
   book_id INTEGER NOT NULL,
    rating INTEGER NOT NULL,
  review VARCHAR(255) NOT NULL );


