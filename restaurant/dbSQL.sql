CREATE TABLE User (
    user_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    phone_number BIGINT NOT NULL,
    role VARCHAR(45) NOT NULL
);

CREATE TABLE Order (
    order_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    restaurant_id BIGINT NOT NULL,
    order_date DATE NOT NULL,
    total_price BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User (user_id),
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant (restaurant_id)
);

CREATE TABLE Restaurant (
    restaurant_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    location VARCHAR(255) NOT NULL,
    ownerID BIGINT NOT NULL,
    FOREIGN KEY (ownerID) REFERENCES User (user_id)
);

CREATE TABLE MenuItem (
    item_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    restaurant_id BIGINT NOT NULL,
    name VARCHAR(45) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price BIGINT NOT NULL,
    category VARCHAR(255) NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant (restaurant_id)
);

CREATE TABLE Reviews (
    review_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    restaurant_id BIGINT NOT NULL,
    rating BIGINT NOT NULL,
    review_text VARCHAR(255) NOT NULL,
    review_date DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES User (user_id),
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant (restaurant_id)
);

CREATE TABLE Cart (
    cart_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    total_price BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User (user_id)
);

CREATE TABLE OrderItem (
    order_item_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    item_id BIGINT NOT NULL,
    quantity BIGINT NOT NULL,
    cart_id BIGINT NOT NULL,
    FOREIGN KEY (item_id) REFERENCES MenuItem (item_id),
    FOREIGN KEY (cart_id) REFERENCES Cart (cart_id)
);
