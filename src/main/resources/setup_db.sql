CREATE DATABASE mysns CHARACTER SET utf8mb4 CALLOATE utf8mb4_bin;
CREATE USER 'user2'@'localhost' IDENTIFIED BY 'pass';
GRANT ALL PRIVILEGES ON mysns.* to 'user2'@'localhost';