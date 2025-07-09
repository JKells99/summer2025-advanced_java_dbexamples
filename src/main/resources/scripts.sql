CREATE TABLE products (
      product_id SERIAL PRIMARY KEY,
      product_name VARCHAR(255) NOT NULL,
      product_type VARCHAR(100) NOT NULL,
      product_description TEXT,
      product_location VARCHAR(255) NOT NULL
);

