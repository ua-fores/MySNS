CREATE DATABASE my_sns CHARACTER SET utf8mb4 CALLOATE utf8mb4_bin;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'pass';
GRANT ALL PRIVILEGES ON my_sns.* to 'user'@'localhost';